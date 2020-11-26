# Release Management

## How to cut a release
+ Branch off from your current master state, name the branch `release-cut` for example.

+ Run the following command, first in dry mode to test what's being changed
```
npm run release -- --dry-run
```

Check the `CHANGELOG.md` and the generated version. If everything is fine cut the release.

```
npm run release
```

You will end with an updated `changelog` and `packages/ngx-ndbx/src/package.json`
checked into with a commit in the format `release: cut <VERSION>` and a new version tag.

Push that branch

```
git push origin HEAD
```

Let it review and merge. In Jenkins start the publish task `ngx-ndbx (next)` which will build and publish from master. The task `ngx-ndbx (stable)` is used to publish from the current stable branch.

## Preparing a new major version
+ Create a LTS branch for the current major called `v<CURRENT_MAJOR>.x-stable`, so e.g. if you plan to release 8.0.0 the branch is named `v7.x-stable`
+ Protect the branch in the repo settings with the same settings as the master branch (PR needs reviews and green build to be merged)
+ The current stable state is now saved and we can work on the new major version changes, especially breaking changes

## Prerelease
You can cut a prerelease by passing the flag 'prerelease' with the prefix (beta, rc) if you want. You can combine this with a dry-run too.

```
npm run release -- --prerelease beta
```

When using `beta` you get a name like this: `6.0.0-beta.1` with the postfix number being increased with each prerelease.

**Note:** Each prerelease will create a new entry in the changelog file. Once you have the final version in place you won't automatically get all prerelease entries replaced with the final release log. That's because `standard-version` is using `conventional-changelog` which incrementally extends the changelog based on the last tag. If you don't like this behavior you have to manually work around it by deleting all prerelease tags for example.

## Reverting a release
When you created a release by accident you can revert it easily.
+ Delete the created tag. Check with `git tag` before and after. Delete with `git tag -d <tag>`.
+ Reset your branch to the state before the release commit: `git checkout HEAD~`
+ Discard the changes by checking out the current state. `git checkout .`


## Send mail
After a new release we want to inform users about the new version. For that we send a mail.

* !! Wait until the build is finished and green. !!

* Then execute

  ```
  npm view @allianz/ngx-ndbx
  ```

  Which should display the release you just published as the "latest" version.
  You can also run

  ```
  npm view @allianz/ngx-ndbx versions
  ```

  which lists all the versions of the library. This should also contain your newest published version.

* Open the CHANGELOG.md somewhere.

* Then go to the ndbx-ndbx repository on Github and open the "Releases" page. At the top toggle button, switch from "Releases" to "Tags".

* You should see a tag for your new published version. On the right side, open the menu belonging to the tag (menu with three dots) and choose "Create release".

* In the opened form:

  Leave the "Release title" empty.

  In "Describe the release", enter the changes of the new version (copied from CHANGELOG.md, copy also the version title on top of the changes from there).

* Send the form with the "Publish release" button.
