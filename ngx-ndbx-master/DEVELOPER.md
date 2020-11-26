# NDBX Angular Component Library - Developer Guide

📚 Global NDBX component library for Angular.

This guide will tell you how to build & install & run & test the library/documentation on your local machine.
If you want to contribute, please read the **[Contribution Guidelines](CONTRIBUTING.md)**.

---

## Table of contents

- [Development](#development)
- [Testing](#testing)

## Development
To access the documentation, clone this project and run the following commands:

```shell

# Install all dependencies
npm install

# Run the viewer to access the documentation
npm start

```

This will start a local webserver which is using
the integrated sources of the library. This allows you to extend the library and the documentation.

If you have changed, added or removed the example files in `packages/ngx-ndbx/documentation/examples` you have to run `npm start` again to see the changes in the documentation.

### Building
Run the following script to build all packages of the monorepo:

```shell
$ npm run build
```

This will build the library, the ngx-docs-ui package and the documentation application in AOT mode.

Run the following script to build only the library:

```shell
$ npm run build:lib
```

It will create the build in `dist` ready to be published.
This is powered by [ng-packagr](https://github.com/dherges/ng-packagr) which generates the necessary bundles to be consumed by most build systems.

### Deployment
+ The documentation is currently deployed [here](https://api-test.allianz.com/ngx-ndbx-dev/my-viewer/) whenever a new version is deployed.
+ The library is published if the version in the `package.json` of the `master` is incremented.
+ We follow semantic versioning and provide beta releases for larger changes.


## Testing

### Run unit tests

The unit tests are run with

`ng test ngx-ndbx`

### Test visual regression

The library includes some scripts to test the visual regressions with backstop.js for different themes. For every theme, the example components contained in `ngx-ndbx/documentation/examples` are tested, both for desktop and mobile.

Please make sure that backstop.js is installed (`npm install -g backstopjs`) before running the scripts mentioned below. Everything else will be set up automatically.

⚠️ Note that at the moment the visual regression testing is not included in the automated checks of pull requests. A frontend library like NDBX often does a lot of visual changes intentionally, so the visual regression testing is a tool to check for unintended changes every once in a while.

#### Set up the environment and create reference screenshots

Run

```
$ node scripts/setup-visual-regression
```

A test folder will be created inside the repository in which all the test configurations and results will be saved. The reference screenshots will be taken from the newest NDBX version (from https://api-test.allianz.com/ngx-ndbx-dev).

The reference screenshots will not be updated on later testing runs. To generate new reference screenshots, delete the whole `tests` folder, or a single `tests/backstop_data_<theme>` folder.

#### Testing your local code changes

Run

```
$ node scripts/test-visual-regression
```

After the tests are finished for a theme a new tab with the testing results will open in the browser.

⚠️ The tests for one theme currently take about 10 minutes (and there are 7 themes at the moment), so be aware that the testing takes some time! ⚠️

#### _(Approving visual changes)_

After some visual changes were done, they usually must be approved so that for the next run the changes are saved in the reference screenshots. For NDBX this is currently out of scope (check the ⚠️ warning under [Test visual regression](#test-visual-regression)).

For updating your reference screenshots, delete the whole `tests` folder, or a single `tests/backstop_data_<theme>` folder and run `node scripts/setup-visual-regression` again.

If you want to approve your changes anyway because of some reason, run

```
$ node scripts/approve-visual-regression
```

#### Test only certain themes

The themes that are tested are set in `scripts/visual-regression-module.js`. To test only certain themes, you can comment out the others that are listed there.
