# NDBX Angular Component Library

📚 Global NDBX component library for Angular.

Browse the [Documentation & Examples](https://api-test.allianz.com/ngx-ndbx-dev/my-viewer/welcome)
or have a look at the [sample app](https://github.developer.allianz.io/ilt/ndbx-sample-app).

If you want to contribute, please read the **[Contribution Guidelines](CONTRIBUTING.md)** and the **[Developer Guide](DEVELOPER.md)**.

---

## Table of contents

- [Installation](#installation)
- [Usage](#usage)
- [Peer Dependencies](#peer-dependencies)


## Installation
Before we can start coding, we need to change our npm registry endpoint and install Angular NDBX.

### Additional NPM Registry
All involved packages are scoped to `@allianz` and published on the GDF Nexus, so you need to register it as your registry endpoint for this scope.

**Note:** Build processes that run within the Allianz network should use https://nexus-adp-tools-gcj.apps.crp.ec1.aws.aztec.cloud.allianz to proxify GDF Nexus repository properly.

Create a `.npmrc` file in the root folder of your project and paste the following lines in the file.

```bash
registry=https://nexus-gcj.apps.crp-gate.ec1.aws.aztec.azcs.io/repository/npm-all/
email=gdf-npm-read@allianz.com
always-auth=true
_auth=Z2RmLW5wbS1yZWFkOmdkZg==
```

Please be careful with this ⚠️

This provides read-only access to the Nexus repository and is not meant to be used outside of the Allianz scope. So please don't distribute or commit this in a public repository like github.com.

### Install Angular NDBX

```shell
ng add @allianz/ngx-ndbx
```

The `ng add @allianz/ngx-ndbx` command will install the needed packages and add a minimal global CSS. This sets fonts and does some resets.


## Usage
Start using the library by importing the appropriate modules into your application modules.
We have enabled view encapsulation for all components so every component will bring it's own CSS.

```typescript

// <-- app.module.ts -->
import { NxCheckboxModule } from '@allianz/ngx-ndbx/checkbox';
import { NxButtonModule } from '@allianz/ngx-ndbx/button';


@NgModule({
    imports: [
        NxButtonModule,
        NxCheckboxModule
    ]
})

```

Then use the components.


```html

<button nxButton>I'm a button</button>
<nx-checkbox>Check me</nx-checkbox>
```

## Peer Dependencies
We have some peer dependencies, for instance:

```
"@allianz/ndbx-styles": "^1.29.0",
"@angular/core": "^8.0.0",
"@angular/common": "^8.0.0",
"@angular/cdk": "^8.0.0",
"@angular/animations": "^8.0.0",
"moment": "^2.22.2",
"object-fit-images": "^3.2.3"
"what-input": "^5.1.2",
"iban": "^0.0.12"
```

That means you have to ensure they are in place.

The CDK is required for modules like message toast, popover and dropdown as they use the overlay component. This requires the CDK CSS for the overlay to be configured. This is added by running `ng add @allianz/ngx-ndbx` and will add the following CSS:

```
@import '@angular/cdk/overlay-prebuilt.css';
@import '@angular/cdk/a11y-prebuilt.css';
```

Other dependencies are:
* Animations are required by the Modal component.
* `Moment` is needed for the Datepicker if you choose to use the MomentAdapter.
* `object-fit-images` is required by the image component.
* `iban` is required by the input mask

### BrowserAnimationsModule
In case you need the BrowserAnimationsModule because you're using a NDBX module that requires it: Check if your application already imports the `BrowserAnimationsModule` or, if you do not want animations, the `NoopAnimationsModule`. If not, you need to install `@angular/animations` and import either one of these modules in your root level application module.

```typescript

// <-- app.module.ts -->
import { BrowserModule } from '@angular/platform-browser';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';

@NgModule({
    imports: [
    BrowserModule,
    BrowserAnimationsModule,
    //...
    ]

})
```