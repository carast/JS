# Contributing to ngx-ndbx
Thanks for your help and for reading this 🙏

This project will be useful to many developers in the Allianz family. We hope this encourages you to contribute to it with new features, bug fixes or just your thoughts and ideas. All work happens directly on GitHub Enterprise. Both Angular NDBX team members and  contributors can send pull requests which go through the same review process.

In order to work together on this project, we need some basic rules which are outlined in the following sections. Those guidelines grew from Allianz Angular projects in the past, and we are sure that most of you should be comfortable with them. If you have any ideas and remarks feel free to open an [issue][issues].

---

## Table of contents

- [Before you start](#before-you-start)
- [Ways of contribution](#ways-of-contributing)
- [Development Guide](#development-guide)
- [Pull Request](#pull-request)
- [Coding guidlines](#coding-guidelines)
  * [Commit Message Guidelines](#commit-message-guidelines)
  * [General comments](#general-comments)
  * [Typescript](#typescript)
  * [Specs](#specs)
  * [CSS](#css)
  * [Documentation](#documentation)
  * [Accessibility and bidirectionality](#accessibility-and-bidirectionality)
- [Other Notes](#other-notes)


## Before you start
+ Clone the project on your local machine.
+ Clone the [Google Material Design](https://github.com/angular/components) sources. They are a good source for inspiration.

## Ways of contributing
There are different ways of contributing to Angular NDBX, with varying levels of complexity. If you are just getting started we recommend to get accustomed with *light* topics and then work your way through to heavier topics. In case you are in doubt what to do, please never hesitate to get in touch with us :telephone_receiver:. Before filing a new issue, try to make sure this problem hasn't already been submitted.

### Reporting bugs (*light*)
You can create issues to report bugs. If you do so we kindly ask you to fill out the issue template and provide an insulated example of the bug - if possible. 

### Suggesting Enhancements (*medium*)
Yes, we are open to ideas or enhancements for this library! 💌<br>
Feel free to open an [issue][issues].

### Style fixes (*light*)
Any style fix has to adhere the NDBX style guide. To ensure this also for your fix, please open an issue describing your change first and once we verified NDBX compliance you can move forward.

### Providing a bugfix (*light* to *medium*)
Bug fixes can be very simple, but sometimes also rather complex. If you are not sure if you are on the right track with your fix, open an issue first so we can discuss the changes.

### Provide a new component (*heavy*)
Since we have a specific workflow for new components, you should not start working on one without talking to us beforehand. Please drop a mail to one of the contributors or open an issue.

### Introducting breaking changes or deprecations (*heavy*)
If you intend to change the public API or deprecate an existing capability, please open an issue describing the change. This lets us reach an agreement with you before you put significant work into it.

## Development Guide
If you consider to contribute with a component, here's a quick list of things to do and consider:

+ The master branch is protected. You work in a feature branch.
+ You're implementing a component within the library sources located at `./packages/ngx-ndbx/src`
+ Look at existing components to know which files and patterns are required.
+ Never develop without a spec (`.spec.ts`) file that provides sufficient test coverage.
+ When the component has reached a usable state, start integrating it in the documentation app (`./apps/viewer/src`).
+ The viewer application is the web documentation for this library. Provide some useful examples and a short introduction, just like you would like to read it as a developer. We are one family 😍.
+ To integrate a new component in the viewer:
  - Create the necessary files in the `documentation/demo` folder.
  - Make it accessible by providing a router in `documentation-routing.module`.
  - Make it visible in the table and sidebar by updating the `componentlist.json`
+ Finally, create a [Pull Request](#pull-request) and wait for your code reviews and the PR build checks.
+ Once you are given all green lights, merge it and enjoy your component being used 🙌.

## Starting Document Viewer

Make sure to test your component using the documentation viewer. To do this, simply run `npm run library:generate:docs:watch` and `npm run ndbxviewer:start` in parallel. Once the environment is up, you can check if everthing is fine.

## Before you submit the pull request
+ Make sure that all tests are green, run `ng test`
+ Make sure the build is working by running
  + `npm run build`
+ In the compare view of your commit check if it contains any unintended changes

## Pull Request
+ Fill in the required template
+ Ensure you follow the Commit Message Guidelines.
+ Follow our Specs Guidelines. Specs are mandatory, we won't allow new features without an accompanying spec.
+ You will need at least one code review.
+ Your PR will be build and blocked if the build fails.

## Coding guidelines
### General comments
If you plan on contributing, please make sure you read and follow these guidelines. We will check them during the review process, however, knowing them will reduce the friction for everybody involved in this process.

- Make sure your code does not contain any hard-coded text or magic numbers.
- Implement `onPush` as change detection strategy
- Always write components for full customizability, then add shortcuts to it. Writing the other way, limited features which you extend later, leads to blocking issues that users can't work around.
- Make sure your component ships without external margins. For projects it is much easier to add margins themselves, than removing existing margins.

### Commit Message Guidelines
+ We stick 100% to the [Angular Commit Guidelines][Angular Commit Guidelines].
+ Commit messages headers will therefore look like `<type>(<scope>): <subject>`, for example:

```
feat(accordion): Add basic accordion component

fix(release): Downgraded rxjs to prevent an error with the current Angular version.
```
+ Don't forget the body for more information about the commit.
+ Ensure to mark breaking changes with the appropriate notice in the commit footer.

#### Type and scope
The type should be one of the items below and the scope should either be the name of the affected component or the functional scope.

+ build: Changes that affect the build system or external dependencies (example scopes: npm or package.json)
+ chore: Routine housekeeping fixes.
+ ci: Changes to our CI configuration files and scripts (example scopes: jenkins)
+ docs: Documentation changes
+ feat: New feature
+ fix: Bug or a11y fix 
+ perf: Performance improvement
+ refactor: Code change with no feature nor bug
+ style: Code changes that do not affect any function (only formatting)
+ test: Adding or correcting tests

### Typescript
We follow the [Angular Material Style Guide][Material Style guide].
We generate the API documentation out of the source code so you must follow these rules especially:

+ All `public` properties and methods must have a docstring describing the purpose to the public.
+ Omit the `public` keyword
+ Prefix all library-internal properties and methods with an underscore without the `private` keyword. Additionally you can use the `@docs-private` JsDoc annotation to hide any symbol from the public API docs.
+ All `private` properties are prefixed with an underscore.
+ We will exclusively go for the prefix nx. You will need to prefix classes, component & directive selectors with this prefix. The linting rules have been updated accordingly.

### Specs
We are testing components and services. E2E tests are in discussion.

Try to work in a TDD cycle. Do so by running Karma and let it run your Jasmine Tests during development. Your tests will keep running whenever your test files are changed.

Run your tests with
```bash
yarn run test
```

### CSS
Every component ships it's own SCSS, which should - whenever applicable - rely on the shared styles, for instance, for paddings, colors and font. To ensure a proper view encapsulation, please make yourself comfortable with the special selectors used for scoping (e.g. `:host` or `:host-context`), see the Angular Component Styles [(documentation)](https://angular.io/guide/component-styles). We are currently using `ViewEncapsulation.Emulated`, since this is the Angular default you don't have to explicitly set this property. We follow `BEM` approach (http://getbem.com/naming/) to name our CSS classes.

## Documentation
No component is complete without well crafted documentation. Therefore, every component must be accompanied with a markdown documentation file that is placed in the components' source folder. The name of the markdown file has to be the same as the parent folder.

While documenting, please be aware of some things:

### API Descriptions
The API descriptions are generated directly from DocStrings in the code. By default private properties are not listed. If you want to hide some property you can use a `/** @docs-private */`-description.

### Attributes
To generate the content of the navigations, every documentation file must contain a front-matter YAML block with attributes that describe the component and its status:

| Attribute | Possible values                    | Description                                                                                   |
|-----------|------------------------------------|-----------------------------------------------------------------------------------------------|
| title     | `string`                           | The name of the component that is displayed.                                                  |
| category  | `components | Expert (Alpha)`      | The category in which the component is listed.                                                |
| b2c       | `true | **false**`                 | Whether the component is allowed to be used in client facing applications (B2C).              |
| expert    | `true | **false**`                 | Whether the component is an expert option and can be used for internal applications (Expert). |
| ndbx      | `done | progress | queue | **na**` | Describes the status of the component.                                                        |
| stable    | `done | progress | queue | **na**` | Describes the stable status of the component.                                                 |

For the NDBX Button component this front-matter YAML block is set in `button.md`:

```
---
title: Button
category: components
b2c: true
expert: true
ndbx: done
stable: done
---
```

### Headings
When editing the documentation of a component, please make sure that only headings with three or more `#` are used, level 1 (`#`) or 2 (`##`) headings are not reflected in the table of contents.

### Code examples
Examples can be inserted to the documentation by using the placeholder

```html
<!-- example(component-basic) -->
```

in the documentation markdown file. The actual example component is placed in the folder `<component-basic>` in ngx-ndbx/documentation/examples/. Please use the name `<component-basic>-example.[html|ts|css]` for the example files. In case you don't need any css code for your example, please create an empty css file anyway (It is needed for the generation process of the documentation).

Please also add a title to the example component like

```ts
/** @title Component basic example */
@Component({
	...
```

This is also used in the generation process to describe the used examples.

Please use as little code as possible and avoid any unnecessary code, as the examples should contain the minimal code to achieve a certain thing.

## Accessibility
Our ambition is to create a library that enables accessibility with the AA (W3C) standard. To ensure this we ask for any contributor to  ensure AA accessibility of their component (following [WAI-ARIA](http://w3c.github.io/aria-practices/)). In addition, we recommend to include automated tests checking a11y properties for every component. The main a11y tasks are to ensure that:
- the focus state is displayed properly
- keyboard navigation within the component is working and documented
- aria-label attributes are properly set and documented
- components are working in high-contrast mode

## Breaking changes and deprecations
We only release breaking changes when we are moving to a new major Angular version. This way we limit their frequency and are in sync with Angular's major version. In most cases you are introducing a breaking change if you:
+ Remove or alter existing API capabilities or remove a component
+ Change the layout or size of a component - simply if your change affects the layout of applications

This is what you need to do if you run into such a case:
+ Get in touch with the Angular NDBX team
+ Write a transition guide for users
+ If possible automate the transition with `ng update` or other means
+ If possible deprecate the existing capability for backwards compatibility, while:
1. Adding a console warning (`console.warn`) in case deprecated functions are still in use
```TypeScript
/**
 * @deprecated Use `nx-circle-toggle` instead
 * @deletion-target 8.0.0
 */
constructor() {
  console.warn('`nx-checkbox-circle` is deprecated. Use `nx-circle-toggle` instead.');
}
```
2. Adding a banner to the respective component notifying about what's deprecated and when it will be removed
  
 ![deprecation warning](private/docs/assets/deprecation-warning.png)
3. Marking the breaking change or deprecation in the overview table

## Other Notes
Some useful notes about this project:

+ This is a mono repository containing the library itself and the documentation viewer.
+ We use [ng-packagr](https://github.com/dherges/ng-packagr) to build the library.
+ Every component is a module. There are no exceptions.
+ Every component needs to support i18n.
+ Don't forget the prefixes. Every component, directive and module is prefixed., e.g. `nx-button` and `NxButtonModule`.
+ Prefixing inside the viewer app is more relaxed. Try to use the prefix `nxv-` for all selectors. You can skip it for modules.

[Angular Commit Guidelines]: https://github.com/angular/angular/blob/master/CONTRIBUTING.md#-commit-message-guidelines
[Angular Style Guide]: https://angular.io/guide/styleguide
[Material Style Guide]: https://github.com/angular/components/blob/master/CODING_STANDARDS.md
[issues]: https://github.developer.allianz.io/ilt/ngx-ndbx/issues
