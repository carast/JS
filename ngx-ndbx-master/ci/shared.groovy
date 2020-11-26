import hudson.AbortException;

RELEASE_BRANCHES = /(master)|([v]\d+\.x-stable)$/
LTS_FORMAT = /([v]\d+)\.x-stable$/
TAG_STABLE_FORMAT = /[v](\d+\.\d+.\d+)$/
TAG_BETA_FORMAT = /[v](\d+\.\d+.\d+)-((beta|next)\.\d+)$/

def getGitTag() {
  def tag = sh script: "git describe --exact-match --tags \$(git log -n1 --pretty='%h')", returnStdout: true
  return tag.trim()
}

def getIntermediateGitTag() {
  def tag = sh script: "git describe --tags", returnStdout: true
  return tag.trim()
}


def isPullRequest() {
    return (env.CHANGE_ID != null) && (env.CHANGE_TARGET != null)
}

def getRepoURL() {
  def url = sh script: "git config --get remote.origin.url",  returnStdout: true
  if (env.ORIGINAL_REMOTE_URL)
    return env.ORIGINAL_REMOTE_URL
  return url
}

def getCommitSha() {
  def sha = sh script: "git rev-parse HEAD",  returnStdout: true
  return sha
}

// pipeline globals: currentStage currentBuild
// https://qa.nuxeo.org/jenkins/pipeline-syntax/globals
// https://developer.github.com/v3/repos/statuses/
def updateCommitStatus(Map params = [:]) {
  String context = params.get('context')
  String message = params.get('message')
  String state = params.get('state')
  String url = params.get('url', null)

  repoUrl = getRepoURL()
  commitSha = getCommitSha()

  echo "repoUrl: ${repoUrl}"
  echo "commitSha: ${commitSha}"

  def stepAction = [
      $class: "GitHubCommitStatusSetter",
      reposSource: [$class: "ManuallyEnteredRepositorySource", url: repoUrl],
      commitShaSource: [$class: "ManuallyEnteredShaSource", sha: commitSha],
      contextSource: [$class: "ManuallyEnteredCommitContextSource", context: context],
      errorHandlers: [[$class: 'ShallowAnyErrorHandler']],
      statusResultSource: [$class: "ConditionalStatusResultSource", results: [[$class: "AnyBuildResult", message: message, state: state]] ]
  ]

  if(url){
    stepAction << [statusBackrefSource: [$class: "ManuallyEnteredBackrefSource", backref: url]]
  }

  step(stepAction)
}





// A helper function to use the CLI of cloud foundry.
// This will pickup the manifest file and upload the generated artefacts (Step Deploy)
def deployCloudFoundry(Map params = [:]) {
    String appName = params.get('appName')
    String credentialsId = params.get('credentialsId')

    String adpurl = params.get('adpurl', 'https://api.sys.adp.allianz')
    String org = params.get('org', 'gdf')
    String space = params.get('space', 'development')
    String path = params.get('path', 'dist/')

    if(!appName) {
      throw new AbortException('appName is required')
    }

    if(!credentialsId) {
      throw new AbortException('credentialsId is required')
    }


    withCredentials([[
        $class: "UsernamePasswordMultiBinding",
        credentialsId: credentialsId,
        usernameVariable: "CF_USERNAME",
        passwordVariable: "CF_PASSWORD"
    ]]) {
        sh "cf login -a ${adpurl} -u ${env.CF_USERNAME} -p ${env.CF_PASSWORD} --skip-ssl-validation -o ${org} -s ${space}"
        sh "cf target -o  ${org} -s ${space}"
        // appName is a variable recognized in the manifest.yml file
        sh "cf push -f manifest.yml --var appName=${appName} --var path=${path}"
    }
}

def undeployCloudFoundry(Map params = [:]) {
    String appName = params.get('appName')
    String credentialsId = params.get('credentialsId')

    String adpurl = params.get('adpurl', 'https://api.sys.adp.allianz')
    String org = params.get('org', 'gdf')
    String space = params.get('space', 'development')

    if(!appName) {
      throw new AbortException('appName is required')
    }

    if(!credentialsId) {
      throw new AbortException('credentialsId is required')
    }

    // Requires credentials binding plugin
    withCredentials([[
                             $class: "UsernamePasswordMultiBinding",
                             credentialsId: credentialsId,
                             usernameVariable: "CF_USERNAME",
                             passwordVariable: "CF_PASSWORD"
                     ]]) {

        sh "cf login -a ${adpurl} -u ${env.CF_USERNAME} -p ${env.CF_PASSWORD} --skip-ssl-validation -o ${org} -s ${space}"
        sh "cf target -o ${org} -s ${space}"
        sh "cf delete ${appName} -r -f"
    }


}

def withNotification(context, description, Closure closure) {

  updateCommitStatus([
    context: context,
    message: "`${description}` started...",
    state: 'PENDING'
  ]);

  try {
    def result = closure.call()

    updateCommitStatus([
      context: context,
      message: "`${description}` succeeded.",
      state: 'SUCCESS'
    ]);
  } catch(Exception error) {

    updateCommitStatus([
      context: context,
      message: "`${description}` failed.",
      state: 'FAILURE'
    ]);

    // requires script approval in Jenkins for "new hudsonAbortException java.lang.String"
    throw new AbortException("Error occured in `${description}` - abort.");
  }

  return true
}


def buildDocumentation(Map params = [:]) {
  String appName = params.get('appName');
  String versionChannel = params.get('versionChannel');

  if (!versionChannel) {
    versionChannel = getChannelName(appName);
  }

  if(!appName) {
    throw new AbortException('appName is required');
  }

    sh "cp packages/documentation/src/environments/environment.prod.ts packages/documentation/src/environments/environment.prod.ts.backup"
    sh "npm run replace-version -- --channel ${versionChannel} --envFile packages/documentation/src/environments/environment.prod.ts"
    sh "npm run build:docs -- --base-href=/${appName}/ --no-progress" 
    sh "npm run ndbxviewer:predeploy"
    sh "cp packages/documentation/src/environments/environment.prod.ts.backup packages/documentation/src/environments/environment.prod.ts"
}

def deployDocumentation(Map params = [:]) {
  String appName = params.get('appName')
  String path = params.get('path', 'dist/documentation')

  if(!appName) {
    throw new AbortException('appName is required')
  }

  withNotification('ci/deploy', "Deploy Documentation") {
    echo "Deploying with appName ${appName} from path ${path}"
    deployCloudFoundry([
      credentialsId: env.DEPLOY_CREDENTIALS_ID,
      appName: appName,
      path: path
    ])
  }
}


// gets the channel name for the version switcher
def getChannelName(appName) {
  String versionSwitcherChannel = '';
  if (appName == 'ngx-ndbx-lts') {
    versionSwitcherChannel = 'lts'
  } else if (appName == 'ngx-ndbx-dev') {
    versionSwitcherChannel = 'stable'
  } else if (appName == 'ngx-ndbx-next' || appName == 'ngx-ndbx-staging') {
    versionSwitcherChannel = 'next'
  } else {
    throw new Exception("No channel found for appname ${appName}")
  }
  return versionSwitcherChannel;
}

def publish(Map params = [:]) {
  String path = params.get('path', 'dist/ngx-ndbx')
  String channel = params.get('channel')
  String registry = params.get('registry', 'https://api-dev.allianz.com/gdf-nexus/repository/npm-internal/')

  if (!channel) {
    throw new AbortException('Channel is required in publish')
  }

  withNotification('ci/publish', "Publish Library") {
    echo "publishing on channel `${channel}` and registry `${registry}`"
    echo "Setting npmrc credentials, output is hidden"

    // set credentials in npmrc
    sh """
      set +x
      NEXUS_CREDS=\$(echo -n \"${env.NEXUS_USER}:${env.NEXUS_PASSWORD}\" | openssl base64)
      sed -i 's#registry=.*#registry=${env.NEXUS_URL}/repository/npm-releases/#g' .npmrc
      sed -i '/registry=.*/ a strict-ssl=false' .npmrc
      sed -i "s/_auth=.*/_auth=\$NEXUS_CREDS/g" .npmrc
      sed -i 's/email=.*/email=${env.NEXUS_USER}@allianz.com/g' .npmrc
      set -x
    """

    // Caution A: dry-run is not working as npm 5.6 is installed and
    // Cautuon B: registry from CLI is not overwriting any value given from registryConfig in the package

    // Caution C: If folder is not existing (due to some config error, you will get the error
    // npm ERR! Error while executing:
    // npm ERR! /usr/bin/git ls-remote -h -t ssh://git@github.com/dist/lib.git
    sh "npm publish ${path} --tag ${channel}"
  }
}

// This will login the technical git user
// so we can read refs and push tags
def gitAuthenticate() {
  def gitUserEmail = 'jenkins@notreal.gdf.allianz.de'
  def gitUserName = 'Jenkins'

  sh "git config user.email '${gitUserEmail}'"
  sh "git config user.name '${gitUserName}'"

  String remoteUrl = sh(script: 'git config --get remote.origin.url', returnStdout: true)

  // save original url for usage in getRepoURL()
  if(env.ORIGINAL_REMOTE_URL?.trim()) {
    echo "saving remote url: ${remoteUrl}, old one: ${env.ORIGINAL_REMOTE_URL}"
    env.ORIGINAL_REMOTE_URL = remoteUrl
  }

  withCredentials([[
      $class          : 'UsernamePasswordMultiBinding',
      credentialsId   : "${env.TAG_GIT_CREDENTIALS_ID}",
      usernameVariable: 'GIT_USERNAME',
      passwordVariable: 'GIT_PASSWORD'
  ]]) {
      def credentialString = String.format("%s:%s", GIT_USERNAME, GIT_PASSWORD)

      // insert user:password in the url string.
      remoteUrl = remoteUrl.replaceAll(/(https?:\/\/)(.+)/) { matches ->
        protocol = matches[1]
        rest = matches[2]
        "${protocol}${credentialString}@${rest}"
      }
      sh "git remote set-url origin ${remoteUrl}"
  }
}

def createGitTag(tagName) {
  echo "add and push tag ${tagName}"
  sh "git tag ${tagName}"
  sh "git push --tags"
}

def getVersionFromPackage(path) {
  def packageVersion = sh script: "node -pe \"require('${path}').version\"", returnStdout: true
  return packageVersion.trim()
}

def isTagAvailable(tagName){
  def status = 0
  status = sh script: "git ls-remote --exit-code --tags origin ${tagName}",  returnStatus: true

  // failure status of 2 signals ref is not found hence its availability
  // see https://git-scm.com/docs/git-ls-remote.html
  return status == 2
}

// Builds the appname for cloudfoundry. Let's keep master explicit
// but for LTS branches a bit of automagic happens to create ngx-ndbx-v<majorVersion>
def getAppName(branch, tag) {
  def appName = ""
  if (branch == 'master') {
    switch(tag) {
      case ~TAG_STABLE_FORMAT:
        appName = "ngx-ndbx-dev"
        break
      case ~TAG_BETA_FORMAT:
        appName = "ngx-ndbx-next"
        break
    }
  } else if (branch =~ LTS_FORMAT) {
    appName = "ngx-ndbx-lts"
  }

  return appName
}


return this

