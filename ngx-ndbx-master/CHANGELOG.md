# Changelog

All notable changes to this project will be documented in this file. See [standard-version](https://github.com/conventional-changelog/standard-version) for commit guidelines.

<a name="9.0.0"></a>
# [9.0.0](https://github.developer.allianz.io/ilt/ngx-ndbx/compare/v9.0.0-next.2...v9.0.0) (2020-03-18)

### Highlights and how to update
With ngx-ndbx version 9 the library is ready for Angular Ivy, the new and improved renderer.

You can find update instructions in the [releases guide](https://api-test.allianz.com/ngx-ndbx-dev/my-viewer/guides/releases).
In short run `ng update @angular/cli @angular/core` followed by `ng update @allianz/ngx-ndbx`.
Migrations during `ng update` will try to migrate breaking changes for you automatically.
On error or if you update from a `9.0.0-next` version you can rerun the migrations with
`ng update @allianz/ngx-ndbx --migrateOnly --from 8 --to 9` after you installed the package of `9.0.0`.

### Bug Fixes

* **card:** remove NxSelectableCardModule ([#2378](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/2378)) ([d8ab8f0](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/d8ab8f0))
* **checkbox:** correct event type for checkbox group change event ([#2156](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/2156)) ([4d30670](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/4d30670))
* **checkbox-group:** add errorStateMatcher to group ([#2338](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/2338)) ([0790b13](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/0790b13))
* **input:** placeholder alignment on FF and safari ([#2387](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/2387)) ([9f29ef7](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/9f29ef7))
* **modal:** prevent cutting off content ([#2392](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/2392)) ([5b7bbf1](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/5b7bbf1))
* **radio-group:** remove ngIf from nx-error ([#2339](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/2339)) ([6b1fb06](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/6b1fb06))
* **tabs:** remove padding from tab-header ([#2380](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/2380)) ([2ef5580](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/2ef5580))
* **tabs:** ivy detecting cyclic dependency ([#2358](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/2358)) ([98fe2fc](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/98fe2fc))


### Chores

* **link:** remove block option ([#2367](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/2367)) ([b37465f](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/b37465f))
* **message:** remove deprecated showIcon property ([#2366](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/2366)) ([e64aa61](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/e64aa61))
* remove deprecated main entry point ([#2359](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/2359)) ([295a22d](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/295a22d))


### Features

* **dropdown:** add placeholder support ([#2363](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/2363)) ([f742f1c](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/f742f1c))
* **dropdown:** disabled dropdown items ([#2349](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/2349)) ([352180f](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/352180f))
* **dropdown:** filter result emission ([#2352](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/2352)) ([be4bb86](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/be4bb86))
* **ivy:** add input type coercion ([#2374](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/2374)) ([e868380](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/e868380))
* update to v9 ([#2345](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/2345)) ([81a41e9](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/81a41e9)), closes [#2175](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/2175)


### BREAKING CHANGES

* **card:** `NxSelectableCardModule` was removed. `NxSelectableCardComponent` was moved to `NxCardModule`.
* **tabs:** Visual change: the default padding of the tab-header was removed. You can use the class `.nx-tab-header` to set your own values or use a margin-top on the `nx-tab-group` element for spacing to element above the tabs. Please see the tabs documentation page for an example.
* **checkbox:** checkbox-group: The type of the event emitted on `(selectionChange)` has changed to `NxCheckboxGroupChangeEvent`.
* **message**: remove the deprecated showIcon property
* **link**: remove block option for `nxStyle`. This has already been a noop so you can leave it in your templates.
* **general**: remove the deprecated entry point `@allianz/ngx-ndbx`
Use the secondary entry points like `@allianz/ngx-ndbx/button` for each component.
Using `ng update` will automatically migrate all imports for you.


### DEPRECATIONS
+ **datefield**: the `format` method of `NxDatefieldDirective` is deprecated and will be removed in 10.0.0. It is not needed to call this method manually anymore.


<a name="9.0.0-next.0"></a>
# [9.0.0-next.0](https://github.developer.allianz.io/ilt/ngx-ndbx/compare/v8.13.0...v9.0.0-next.0) (2020-03-02)

### Highlights
This is the first prerelease including angular 9 and ivy. This version is supposed to help you try out angular 9 and ivy, breaking changes will follow in later prereleases and we will provide schematics to
migrate them for you where possible. We want to use the `next` releases to collect feedback if there is still something not working with ivy so please don't hesitate to open issues in our github repository.
To update to the next version run `ng update @allianz/ngx-ndbx --next --force`.



<a name="8.13.0"></a>
# [8.13.0](https://github.developer.allianz.io/ilt/ngx-ndbx/compare/v8.12.0...v8.13.0) (2020-02-25)


### Bug Fixes

* **card:** theme selectable card ([#2335](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/2335)) ([f2b9819](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/f2b9819))
* **datefield:** prevent double event triggering ([#2346](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/2346)) ([cee4338](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/cee4338))
* **formfield:** autofill not working in chrome 80 ([#2350](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/2350)) ([1ce8f39](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/1ce8f39))
* **formfield:** correct border color on dark theme ([#2343](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/2343)) ([9e47ada](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/9e47ada))
* **modal:** adds missing z-index ([#2341](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/2341)) ([d84d7da](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/d84d7da))
* **notification:** correct border-radius token value ([#2348](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/2348)) ([a05c474](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/a05c474))
* **selectable-card:** remove ngIf from nx-error ([#2337](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/2337)) ([ce3c401](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/ce3c401))
* **switcher:** multiline text, tokens for styling text control position ([#2328](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/2328)) ([40b834c](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/40b834c))


### Features

* **schematics:** add expert css and ponyfill to project setup ([#2336](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/2336)) ([a7fcffb](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/a7fcffb))



<a name="8.12.0"></a>
# [8.12.0](https://github.developer.allianz.io/ilt/ngx-ndbx/compare/v8.11.0...v8.12.0) (2020-02-13)

### Highlights
Theming is now available as a feature. It is possible now to override specific design tokens and create a custom theme. Please see in our documentation for a guide.

### Bug Fixes

* **datefield:** fixes null input field on blur ([#2323](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/2323)) ([95728e0](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/95728e0))
* **dropdown:** fixes no focus ring ([#2318](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/2318)) ([e71c08a](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/e71c08a))
* **input:** formfield autofill ([#2295](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/2295)) ([ecbfbe0](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/ecbfbe0))
* **modal:** correct fixed modal width ([#2331](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/2331)) ([74a7c46](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/74a7c46))
* **modal:** updates z-index ([#2319](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/2319)) ([7e57c1a](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/7e57c1a))
* **opel-theme:** focus box shadow design tokens adjustments ([#2332](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/2332)) ([2855576](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/2855576))
* **selectable-card:** added error styles for checked state and example ([#2305](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/2305)) ([b9f9c13](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/b9f9c13))


### Features

* **tabs:** supports content projection ([#2258](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/2258)) ([5508c47](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/5508c47))
* **theming:** create and export theming interface ([#2286](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/2286)) ([9207553](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/9207553))



<a name="8.11.0"></a>
# [8.11.0](https://github.developer.allianz.io/ilt/ngx-ndbx/compare/v8.10.0...v8.11.0) (2020-02-10)


### Bug Fixes

* **card:** deprecate selectable properties ([#2300](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/2300)) ([58d0998](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/58d0998))
* **natural-language-form:** add margin to nx-word ([#2313](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/2313)) ([8eef4dc](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/8eef4dc))
* **notification:** remove browser module from imports ([#2321](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/2321)) ([2ac0bf8](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/2ac0bf8))


### Features

* **formfield:** placeholder support ([#2266](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/2266)) ([023ffc2](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/023ffc2))



<a name="8.10.0"></a>
# [8.10.0](https://github.developer.allianz.io/ilt/ngx-ndbx/compare/v8.9.0...v8.10.0) (2020-02-05)


### Bug Fixes

* **dropdown:** correct typing for compareWith input ([#2280](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/2280)) ([5996ab4](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/5996ab4))
* **dropdown:** input filter focus styles ([#2278](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/2278)) ([817c4a7](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/817c4a7))
* **nlf:** correct error input text color ([#2289](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/2289)) ([629aeb9](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/629aeb9))
* **number-stepper:** remove undefined ViewChild ([#2251](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/2251)) ([39982bc](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/39982bc))
* **progress-indicator:** remove unnecessary click handlers ([#2265](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/2265)) ([7874f3e](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/7874f3e))
* **selectable-card:** a11y improvements for the error message ([#2206](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/2206)) ([c4807bc](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/c4807bc))
* **toggle-button:** style single-optioned button ([#2275](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/2275)) ([23e8a32](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/23e8a32))


### Features

* **message-toast:** add message toast service ([#2202](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/2202)) ([131a485](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/131a485))



<a name="8.9.0"></a>
# [8.9.0](https://github.developer.allianz.io/ilt/ngx-ndbx/compare/v8.8.1...v8.9.0) (2020-01-15)


### Bug Fixes

* **checkbox:** remove margins when there is no label ([#2237](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/2237)) ([e0cf274](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/e0cf274))
* **dropdown:** fixed filter field position ([#2259](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/2259)) ([7722ef8](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/7722ef8))
* **dropdown:** jumping to items on keyboard event ([#2207](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/2207)) ([762f79c](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/762f79c))
* **dropdown:** remove double-focus in multi-dropdown ([#2269](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/2269)) ([4bb890d](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/4bb890d))
* **expandable-table:** toggle all not working due to missing children ([#2254](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/2254)) ([2a3774d](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/2a3774d))
* **iban-mask:** update iban-mask on patchValue ([#2271](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/2271)) ([a38a2f6](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/a38a2f6))
* **modal:** transition not applied to all elements ([#2247](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/2247)) ([98ccbf8](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/98ccbf8))
* **progress-indicator:** indirect descendants not picked by ivy ([#2176](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/2176)) ([#2253](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/2253)) ([d446d3e](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/d446d3e))
* **radio-button:** bobble is centered with multiline label ([#2209](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/2209)) ([4c8733d](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/4c8733d))
* **table:** table header sort icon text position ([#2252](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/2252)) ([68593ba](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/68593ba))
* **tooltip:** removes dispose on nav ([#2204](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/2204)) ([b82ad6f](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/b82ad6f))
* **tree:** remove unnecessary click handler ([#2255](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/2255)) ([c7394db](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/c7394db))


### Features

* **accordion:** add expert theme to regular accordion ([#2210](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/2210)) ([543e87a](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/543e87a))



## [8.8.1](https://github.developer.allianz.io/ilt/ngx-ndbx/compare/v8.8.0...v8.8.1) (2019-12-20)


### Bug Fixes

* **autocomplete:** correct overlay styles ([#2217](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/2217)) ([bbe6f2e](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/bbe6f2e))
* **autocomplete:** fixes autocomplete examples ([#2214](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/2214)) ([f2e7261](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/f2e7261))
* **formfield:** removed transition when the input is filled ([#2222](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/2222)) ([c1dd0bf](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/c1dd0bf))
* **grid:** adjust mobile grid gutter ([#2215](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/2215)) ([e5a5f4c](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/e5a5f4c))
* **input:** foward disabled, required, readonly to native input element ([#2232](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/2232)) ([b0952ea](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/b0952ea))
* **link:** ie11 link alignment in table ([#2228](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/2228)) ([baee131](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/baee131))



# [8.8.0](https://github.developer.allianz.io/ilt/ngx-ndbx/compare/v8.7.1...v8.8.0) (2019-12-11)


### Bug Fixes

* **accordion:** add missing borders for accordion-light ([#2131](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/2131)) ([e478d3c](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/e478d3c))
* **checkbox-group:** dirty flag always true ([#2195](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/2195)) ([03d6bc9](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/03d6bc9))
* **datefield:** always update nativeElement value with formatted value ([#2186](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/2186)) ([a9579e3](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/a9579e3))
* **input:** add dirty-check to notify changes ([#2152](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/2152)) ([6575c77](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/6575c77))
* **opel-theme:** radio-button design token adjustment ([#2168](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/2168)) ([5bd8a29](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/5bd8a29))
* **popover:** change example to be icon based ([#2030](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/2030)) ([f357dca](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/f357dca))
* **slider:** improving performance ngzone ([#2146](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/2146)) ([ed72f11](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/ed72f11))


### Features

* **breadcrumb:** add new breadcrumb component ([#2133](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/2133)) ([ab7ef90](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/ab7ef90))
* **message:** add new styles ([#2160](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/2160)) ([12ab94b](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/12ab94b))
* **page-search:** added clear button into examples ([#2150](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/2150)) ([32ff9b7](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/32ff9b7))
* **selectable-card:** add selectable card component ([#2134](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/2134)) ([1578a0c](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/1578a0c))



## [8.7.1](https://github.developer.allianz.io/ilt/ngx-ndbx/compare/v8.7.0...v8.7.1) (2019-11-15)


### Bug Fixes

* **iban-mask:** convert lowercase to uppercase letters ([#2151](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/2151)) ([fb293a8](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/fb293a8))
* **nlf:** integrate popover into word component ([#2149](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/2149)) ([25dda1c](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/25dda1c))



# [8.7.0](https://github.developer.allianz.io/ilt/ngx-ndbx/compare/v8.6.1...v8.7.0) (2019-11-08)


### Bug Fixes

* **datefield:** consider custom parseFormats for validation ([#2128](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/2128)) ([b4a94cf](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/b4a94cf))
* **dropdown:** add tokens for filter input (active state) ([#2126](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/2126)) ([2485d0d](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/2485d0d))
* **dropdown:** items slightly misplaced on keyboard navigation ([#2035](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/2035)) ([deda19b](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/deda19b))
* **error:** move margin on outer element ([#2135](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/2135)) ([66a4b33](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/66a4b33))
* **error, message:** align text left ([#2123](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/2123)) ([87ea7bb](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/87ea7bb))
* **formfield:** red label on error (not floated) ([#2130](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/2130)) ([ce3103c](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/ce3103c))
* **mask:** improve component lifecycle, reduce onchange calls ([#2093](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/2093)) ([45daef7](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/45daef7))


### Features

* **autocomplete:** expert styling inside formfield ([#2029](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/2029)) ([2d5462c](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/2d5462c))
* **circle-toggle:** support text instead of icon inside circle ([#2132](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/2132)) ([f93f2a2](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/f93f2a2))



## [8.6.1](https://github.developer.allianz.io/ilt/ngx-ndbx/compare/v8.6.0...v8.6.1) (2019-10-30)


### Bug Fixes

* **card:** correct selected background color ([#2106](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/2106)) ([fdc1db1](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/fdc1db1))
* **dropdown:** use viewValue for getLabel of items ([#2097](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/2097)) ([9bf5563](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/9bf5563))
* **page-search:** text alignment on iOS ([#2096](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/2096)) ([b6af394](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/b6af394))
* **progress-stepper:** unstyled title for progress-stepper and multi-stepper components ([#2041](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/2041)) ([cbd18f2](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/cbd18f2))



# [8.6.0](https://github.developer.allianz.io/ilt/ngx-ndbx/compare/v8.5.0...v8.6.0) (2019-10-23)


### Bug Fixes

* **checkbox:** checked state not set correctly in group ([#2079](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/2079)) ([88c37c4](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/88c37c4))
* **dropdown, datefield, header, modal, popover:** add fallback values for css variables ([#2089](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/2089)) ([ba54d6c](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/ba54d6c))
* **expandable-table:** make hidden items not focusable ([#2076](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/2076)) ([701c073](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/701c073))
* **formfield:** error when control is loaded with ngIf([#2081](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/2081)) ([06976bd](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/06976bd))
* **opel-theme:** button text uppercase ([#2072](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/2072)) ([05a2681](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/05a2681))
* **opel-theme:** design tokens adjustments ([#2083](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/2083)) ([283b937](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/283b937))
* **switcher:** correct width on small IE11 screens ([#2085](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/2085)) ([413980c](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/413980c))


### Features

* **datefield:** make validators public ([#2038](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/2038)) ([1b580d9](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/1b580d9))
* **pagination:** add mobile styling ([#2019](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/2019)) ([f57629f](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/f57629f))



# [8.5.0](https://github.developer.allianz.io/ilt/ngx-ndbx/compare/v8.4.3...v8.5.0) (2019-10-11)


### Bug Fixes

* **button:** use hostbindings instead of host metadata ([#1998](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1998)) ([13d1656](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/13d1656))
* **datefield:** prevent non existing toggleButton from throwing an error ([#2031](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/2031)) ([c9a9d8f](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/c9a9d8f))
* **dropdown:** style fixes for direct ([#1985](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1985)) ([683ff01](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/683ff01))
* **formfield:** correct label color on negative ([#2014](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/2014)) ([f6fad15](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/f6fad15))
* **margins:** add margin 0 to the documentation ([#2015](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/2015)) ([e7fec25](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/e7fec25))
* **opel-theme:** button and dropdown styles ([#2048](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/2048)) ([3ed619a](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/3ed619a))
* **Opel-theme:** button, checkbox, datefield, list, radio styles ([#2060](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/2060)) ([307633c](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/307633c))
* **popover:** accessible hover popovers ([#1892](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1892)) ([d12315d](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/d12315d))
* **popover:** prevent popover from closing on content click ([#2016](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/2016)) ([01ec4c9](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/01ec4c9))
* **theming:** correct colours for dropdown and formfield ([#2056](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/2056)) ([c2de2eb](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/c2de2eb))
* **toggle-button:** disabled selected text color ([#2066](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/2066)) ([74620ca](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/74620ca))


### Features

* **mask:** add input for letter size conversion ([#1995](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1995)) ([0f7e615](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/0f7e615))
* **progress-indicator:** add groups for vertical progress indicator ([#1855](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1855)) ([7599007](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/7599007))



## [8.4.3](https://github.developer.allianz.io/ilt/ngx-ndbx/compare/v8.4.2...v8.4.3) (2019-09-19)


### Bug Fixes

* **formfield:** make textarea container grow on resize ([#2010](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/2010)) ([3c1369b](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/3c1369b))
* **radio-button:** hover styling on IE/Edge ([#2007](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/2007)) ([0d4bad2](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/0d4bad2))
* **tabs:** correct color for disabled negative ([#1991](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1991)) ([37f027e](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/37f027e))



## [8.4.2](https://github.developer.allianz.io/ilt/ngx-ndbx/compare/v8.4.1...v8.4.2) (2019-09-18)


### Bug Fixes

* **checkbox:** add disabled for ControlValueAccessor ([#1976](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1976)) ([461d9df](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/461d9df))
* **checkbox:** add token for margin-left of label ([#1984](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1984)) ([df527d3](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/df527d3))
* **dropdown:** show text-overflow: ellipsis for filled out dropdown ([#2001](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/2001)) ([1cc4925](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/1cc4925))
* **modal:** remove global event listener after destruction ([#2004](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/2004)) ([c8d45a9](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/c8d45a9))
* **number-stepper:** color of prefix/suffix (negative) ([#1963](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1963)) ([4deeb80](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/4deeb80))
* **pagination:** fix disabled color of links in high contrast mode ([#1960](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1960)) ([7386142](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/7386142))
* **radio-button:** add token for margin-left ([#1986](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1986)) ([6e4a873](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/6e4a873))
* **radio-button:** border color when selected with error ([#2000](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/2000)) ([1e754b9](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/1e754b9))



## [8.4.1](https://github.developer.allianz.io/ilt/ngx-ndbx/compare/v8.4.0...v8.4.1) (2019-09-10)


### Bug Fixes

* **action:** fix icon size and component height ([#1916](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1916)) ([dcb817b](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/dcb817b))
* **card:** remove dotted border (firefox) ([#1937](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1937)) ([6f9e2f4](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/6f9e2f4))
* **list:** fixed ul.li dot position ([#1895](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1895)) ([b81ff48](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/b81ff48))
* **popover:** focus styles of overlay and close button ([#1949](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1949)) ([c0bda28](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/c0bda28))
* **toggle-button:** opacity of negative text ([#1938](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1938)) ([89f8c1e](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/89f8c1e))
* **video:** embedded play button ([#1893](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1893)) ([14fb563](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/14fb563))



# [8.4.0](https://github.developer.allianz.io/ilt/ngx-ndbx/compare/v8.3.0...v8.4.0) (2019-09-06)

### Highlights
Implementation of high contrast mode with system colors for windows has been completed which was a major step for us to improve accessibility. 🎉

### Visual Changes
* **progress indicator**: The handling of the labels was refactored that they don't overlap anymore and the large paddings were removed (which most of you were overriding anyways ;) ). Please check your pages with any progress indicator if everything still fits to your designs.
* **formfield**: The formfield hint was not pushed to left if an appendix was present. This change required some refactorings which introduced a new container inside the template and the container which holds the border has changed. If you wrote custom css for the formfield please double check if it still applies.
* other components got minor style updates

### Bug Fixes

* **button:** padding fallback for IE ([#1934](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1934)) ([a9e21c3](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/a9e21c3))
* **code-input:** style fixes ([#1913](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1913)) ([0301c54](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/0301c54))
* **datefield, formfield:** hover color to datepicker and password toggle ([#1909](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1909)) ([8f779ef](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/8f779ef))
* **dropdown:** remove blue text-color from selected option ([#1912](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1912)) ([c9f23eb](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/c9f23eb))
* **dynamic-table:** update font weight of table header text ([#1914](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1914)) ([cbbe9d5](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/cbbe9d5))
* **formfield:** correct positioning of hint ([#1827](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1827)) ([e441112](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/e441112))
* **header:** update spacings ([#1907](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1907)) ([c9e1400](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/c9e1400))
* **list:** size of ordered-circle lists (list numbers) ([#1910](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1910)) ([1708a5d](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/1708a5d))
* **natural-language-form:** fix dropdown focus color ([#1908](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1908)) ([81bf4dc](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/81bf4dc))
* **page-search:** set font-weight of entered text ([#1911](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1911)) ([5ce55ff](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/5ce55ff))
* **pagination:** fix getmin producing erroneous values ([#1902](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1902)) ([4a74b7f](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/4a74b7f))
* **progress-stepper:** added support of high contrast ([#1406](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1406)) ([1e7a74c](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/1e7a74c))
* **progress-stepper:** multi stepper labels overlap [#1328](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1328) ([#1337](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1337)) ([d26a93b](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/d26a93b))
* **slider:** correct value-label typography ([#1915](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1915)) ([e71248a](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/e71248a))
* **tabs:** added disabled state on mobile ([#1849](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1849)) ([82ed437](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/82ed437))
* **tabs:** header item letter-spacing ([#1926](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1926)) ([cfeb6f3](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/cfeb6f3))
* **tags:** improve accessibility (keyboard interaction) ([#1797](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1797)) ([4860ab4](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/4860ab4))
* **toggle-button:** update styling ([#1891](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1891)) ([c066ee7](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/c066ee7))


### Features

* **code-input:** add disabled functionality ([#1873](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1873)) ([92ae40e](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/92ae40e))
* **popover:** added focus trap ([#1864](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1864)) ([3e0107b](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/3e0107b))
* **grid:** add grid maxwith to expert theme ([#1901](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1901)) ([8c74598](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/8c74598))



# [8.3.0](https://github.developer.allianz.io/ilt/ngx-ndbx/compare/v8.2.0...v8.3.0) (2019-08-23)


### Bug Fixes

* **button:** button vertical align ([#1870](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1870)) ([5d1e4bd](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/5d1e4bd))
* **button:** fixed icon size small and small medium ([#1828](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1828)) ([965a331](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/965a331))
* **checkbox:** align control with text ([#1861](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1861)) ([b2bbf5d](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/b2bbf5d))
* **code-input:** remove focus from host element ([#1847](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1847)) ([72000c4](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/72000c4))
* **mask:** remove implementation parts depending on keycodes ([#1819](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1819)) ([2f98373](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/2f98373))
* **ngadd:** add cdk styles ([#1869](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1869)) ([bff022d](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/bff022d))


### Features

* **ng-add:** getting started with ng add ([#1820](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1820)) ([391168a](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/391168a))
* **progress-indicator:** add vertical progress indicator ([#1781](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1781)) ([85aca26](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/85aca26))
* **tabs:** support high contrast mode ([#1859](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1859)) ([a95da58](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/a95da58))



# [8.2.0](https://github.developer.allianz.io/ilt/ngx-ndbx/compare/v8.1.0...v8.2.0) (2019-08-16)


### Bug Fixes

* **aot:** fix aot errors for mask, progress indicator, documentation ([#1834](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1834)) ([e73d647](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/e73d647))
* **code-input:** change aria-label and enable localization ([#1816](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1816)) ([aa5abc6](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/aa5abc6))
* **code-input:** select input when user selection in iPhone ([#1732](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1732)) ([fadacb8](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/fadacb8))
* **formfield:** dropdown chevron alignment and aria-describedBys ([#1824](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1824)) ([e9cea7f](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/e9cea7f))
* **radio-button, table:** fix high contrast colors ([#1822](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1822)) ([7309a67](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/7309a67))
* **radio-toggle:** added display block property ([#1783](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1783)) ([a56b439](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/a56b439))


### Features

* **circle-toggle:** mobile version ([#1740](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1740)) ([10967b9](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/10967b9))
* **code-input:** add negative styling property ([#1826](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1826)) ([09d8fa7](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/09d8fa7))
* **popover:** add closeOnClickout input and set show flag correctly ([#1811](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1811)) ([702aed4](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/702aed4))
* **tabs:** fix tab navbar a11y and introduce disabled functionality ([#1752](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1752)) ([9cc647a](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/9cc647a))



# [8.1.0](https://github.developer.allianz.io/ilt/ngx-ndbx/compare/v8.0.0...v8.1.0) (2019-08-08)


### Bug Fixes

* **action, context-menu, menu:** add selected styling for high contrast mode ([#1791](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1791)) ([8e5ccce](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/8e5ccce))
* **autocomplete, datefield, dropdown:** improve high contrast of selected/disabled items ([#1785](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1785)) ([80c809b](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/80c809b))
* **card:** update high contrast styling ([#1772](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1772)) ([b778eed](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/b778eed))
* **circle-toggle:** remaining high contrast modes ([#1771](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1771)) ([bb069ba](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/bb069ba))
* **code-input:** allow only one character per input ([#1660](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1660)) ([f7dc0e8](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/f7dc0e8))
* **datepicker:** apply displayFormat on blur ([#1747](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1747)) ([4d45280](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/4d45280))
* **dropdown:** set fallback to 0 if dropdown overaly label undefined ([#1807](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1807)) ([bfad535](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/bfad535))
* **formfield:** prevent label from overlapping dropdown chevron ([#1777](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1777)) ([141e87c](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/141e87c))
* **input:** export as nxInput and fix examples with queries ([#1763](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1763)) ([80bf8b5](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/80bf8b5))
* **link:** inherit font and line-height of text (link--text) ([#1801](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1801)) ([cdc329d](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/cdc329d))
* **link:** link position in IE11 and Edge ([#1773](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1773)) ([356f9b6](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/356f9b6))
* **number-stepper:** Number stepper blur ([#1708](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1708)) ([ba4dc1b](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/ba4dc1b))
* **popover:** emit nxPopoverShowChange event when closed with ESC ([#1770](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1770)) ([a6d6274](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/a6d6274))
* **table, progress-indicator, number-stepper:** correct font sizes ([#1768](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1768)) ([45c9706](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/45c9706))
* **tooltip:** high contrast mode styling ([#1793](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1793)) ([d857f5d](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/d857f5d))


### Features

* **accordion:** add high-contrast styling and light negative refactoring ([#1758](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1758)) ([1d82194](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/1d82194))
* **code-input:** add error state matcher logic ([#1749](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1749)) ([3872c8e](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/3872c8e))
* **context-menu:** add context menu ([#1651](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1651)) ([65ddf5d](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/65ddf5d))
* **formfield, natural-language-form, code-input:** add high contrast styling ([#1787](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1787)) ([b42d2e1](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/b42d2e1))
* **link:** implement high contrast mode ([#1774](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1774)) ([37713fd](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/37713fd))
* **message, error:** add high contrast styling ([#1775](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1775)) ([f802b4c](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/f802b4c))
* **page-search:** add search region role ([#1737](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1737)) ([e090add](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/e090add))
* **rating:** add high contrast styling ([#1779](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1779)) ([32c89e3](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/32c89e3))
* **spinner:** add high contrast styling ([#1780](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1780)) ([7cbd189](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/7cbd189))
* **switcher:** add high contrast stylings with system colors ([#1778](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1778)) ([96cbbd0](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/96cbbd0))
* **toggle-button:** add high contrast styling with system colors ([#1792](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1792)) ([c7d46fb](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/c7d46fb))
* **video:** add high contrast styling with system colors ([#1741](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1741)) ([281e3d2](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/281e3d2))



# [8.0.0](https://github.developer.allianz.io/ilt/ngx-ndbx/compare/v7.11.0...v8.0.0) (2019-07-25)

### How to update
This is our first version where we provide an `ng update` script which makes updating a lot easier for you. For the full update guide please see our [update guide](https://api-test.allianz.com/ngx-ndbx-dev/my-viewer/guides/releases).
In short: by using `ng update @allianz/ngx-ndbx@8.0.0` it will update all packages (including peer dependencies) and it will run migration scripts to automatically apply necessary changes if possible. If you get npm compatibility warnings because
of incompatible versions you can use `ng update @allianz/ngx-ndbx@8.0.0 --force` to apply the update anyway and then fix the incompatible versions manually.
If you have any questions or run into issues during the update please don't hesitate to approach us by opening issues in our [repository](https://github.developer.allianz.io/ilt/ngx-ndbx).

### Bug Fixes

* **accordion:** add border in high contrast mode ([#1675](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1675)) ([7acb3fd](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/7acb3fd))
* **action, side-navigation, tabs, tree:** add remaining focus styles in high contrast mode ([#1719](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1719)) ([d7520bc](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/d7520bc))
* **badge:** add border in high contrast mode ([#1683](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1683)) ([7faec39](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/7faec39))
* **button:** icon sizes in nxButton ([#1596](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1596)) ([0aaac89](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/0aaac89))
* **button:** vertical align content in block elements ([#1649](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1649)) ([62b7646](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/62b7646))
* **checkbox:** a11y in high contrast mode ([#1682](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1682)) ([bab7f72](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/bab7f72))
* **checkbox:** correct validation and error styles ([#1636](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1636)) ([5c26469](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/5c26469))
* **checkbox:** selecting examples in IE ([#1645](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1645)) ([fe34601](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/fe34601))
* **checkbox:** update icon size ([#1697](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1697)) ([dced5b6](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/dced5b6))
* **checkbox-group:** ie fix 1549 ([#1552](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1552)) ([669007b](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/669007b))
* **formfield:** error colors and font-weight ([#1659](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1659)) ([1af1d67](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/1af1d67))
* add missing exports ([#1761](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1761)) ([23d91c8](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/23d91c8))
* **circle-toggle:** correct style in high contrast mode ([#1694](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1694)) ([10c92f0](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/10c92f0))
* **circle-toggle:** img pointer events ([#1554](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1554)) ([338bb3b](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/338bb3b))
* **datefield:** add selected styles on high contrast ([#1688](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1688)) ([2342fcb](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/2342fcb))
* **datefield:** color of negative datepicker ([#1595](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1595)) ([5a69ede](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/5a69ede))
* **datefield:** overlay behavior and mobile size of datepicker ([#1705](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1705)) ([fe36b0c](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/fe36b0c))
* **dropdown:** focus on element after selection (multiselect) ([#1586](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1586)) ([b178a51](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/b178a51))
* **dropdown:** ie11 flex issues outside of formfield ([#1612](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1612)) ([c4028ea](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/c4028ea))
* **dynamic-table, pagination, progress-indicator, checkbox:** remove white backgrounds ([#1674](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1674)) ([d61b5b7](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/d61b5b7))
* **formfield:** fix font-weight theming ([#1629](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1629)) ([f68329a](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/f68329a))
* **headline, link:** inherit headline font-size in link ([#1725](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1725)) ([6a4fb32](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/6a4fb32))
* **iban-mask:** remove separate module file ([#1646](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1646)) ([a912159](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/a912159))
* **icon:** disable contrast adjust in high contrast mode ([0a3a525](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/0a3a525))
* **icon:** fix occasional subpixel dimensions ([#1663](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1663)) ([8ea1383](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/8ea1383))
* **icon:** remove black border in Firefox ([#1658](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1658)) ([3a1f6d5](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/3a1f6d5))
* **mask:** cursor position on numpad entering ([#1550](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1550)) ([ea3014b](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/ea3014b))
* **modal, number-stepper, popove:** improve accessbility ([#1729](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1729)) ([e523f8c](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/e523f8c))
* **number-stepper:** prevent submitting form on buttons click ([#1713](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1713)) ([4068a6b](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/4068a6b))
* **pagination:** add underline to current page for high contrast ([#1738](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1738)) ([f462c31](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/f462c31))
* **progress-indicator:** nxStepperNext state set before stepper content ([#1712](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1712)) ([fe632ac](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/fe632ac))
* **radio-button:** hover only when cursor is on button or text ([#1411](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1411)) ([d704da2](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/d704da2))
* **slider:** change handle element from link to div ([#1728](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1728)) ([777751b](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/777751b))
* **table:** remove focus on table rows ([#1750](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1750)) ([d9041a2](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/d9041a2))
* **table, radio-button, header:** make background generic, define typo ([#1669](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1669)) ([2a949d0](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/2a949d0))
* **tag:** remove line-height on icon ([#1733](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1733)) ([441ac72](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/441ac72))
* **tooltip:** show the arrow in the same time as the content on ie11 ([#1599](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1599)) ([27f5857](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/27f5857))


### Code Refactoring

* **checkbox-circle:** remove component due to deprecation ([#1534](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1534)) ([b0a48af](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/b0a48af))
* **dynamic-table:** remove nxStyle input due to deprecation ([#1536](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1536)) ([6f171be](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/6f171be))
* **number-stepper:** remove nxStyle input due to deprecation ([#1537](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1537)) ([11b21b6](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/11b21b6))
* **radio-circle:** remove component due to deprecation ([#1535](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1535)) ([2f3f607](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/2f3f607))


### Features

* **accordion:** add expert theming ([#1604](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1604)) ([132e4d7](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/132e4d7))
* **all:** add focus-style in high contrast mode to all components ([#1707](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1707)) ([229aa91](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/229aa91))
* **dropdown:** add dropdown styles for outline formfield ([#1540](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1540)) ([1f54b28](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/1f54b28))
* **iban-mask:** add iban-mask directive ([#1577](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1577)) ([7010884](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/7010884))
* **link:** add large size ([#1603](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1603)) ([6558efa](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/6558efa))
* **list:** add high contrast mode with system colors ([#1739](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1739)) ([f5843d1](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/f5843d1))
* **ng-update:** add update schematics for v8 changes ([#1668](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1668)) ([ce02ff4](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/ce02ff4))
* **progress-bar:** add high contrast mode with system colors ([#1742](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1742)) ([d9854b4](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/d9854b4))
* **progress-indicator:** add high contrast mode with system colors ([#1743](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1743)) ([0c6008b](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/0c6008b))
* **radio-button:** remove background of dot ([#1670](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1670)) ([8af0e5f](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/8af0e5f))
* **radio-button:** support high contrast ([#1706](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1706)) ([f1345c8](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/f1345c8))
* add preset injection token for Direct ([#1746](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1746)) ([6be7d55](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/6be7d55))
* **sidebar:** add footer slot [#1545](https://github.developer.allianz.io/ilt/ngx-ndbx/pull/1545) ([290307b](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/290307b))
* **sidebar:** update icon size ([#1667](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1667)) ([2bc07f7](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/2bc07f7))
* **slider:** support high contrast ([#1714](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1714)) ([0139d3d](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/0139d3d))
* **switcher:** add error state ([#1569](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1569)) ([e93d707](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/e93d707))
* **table:** add radio to single select example ([#1664](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1664)) ([88b4bb1](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/88b4bb1))
* **table:** add selectable table row ([#1626](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1626)) ([69c2fbb](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/69c2fbb))
* **toggle-button:** added error state ([#917](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/917)) ([0c13af2](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/0c13af2))


### DEPRECATIONS
Following deprecations will be removed in version 9.0.0

* **message:** Notice that messages without a contextual icon are deprecated due to accessibility issues. The `showIcon` property should always be set to `true` in the future. 
* **main entry points:**  Importing from the root `@allianz/ngx-ndbx` entry-point is deprecated. Starting with v8 you should import all components through a specific entry-point (e.g.,  `@allianz/ngx-ndbx/button`). This helps keeping the application footprint small, avoiding unused code. With this version both entry points will work, starting with Angular v9 we will remove the deprecated root entry-points. 
* **CSS dependencies:** Using the `patternlab.css`, `patternlab.min.css`, `patternlab-rtl.css` and `patternlab-rtl.min.css` from **ndbx-styles** is **deprecated**. For latest Pattern Lab releases please refer to https://github.developer.allianz.io/oneMarketing/pattern-lab. Regarding Angular NDBX we recommend using `patternlab-minimal.css`. In the long run, we will include the reset classes into Angular NDBX and only fonts and theming will remain as dependency.


### BREAKING CHANGES

* **radio-circle:** **radio-circle**: The radio-circle component was removed. Instead use the new component **nx-circle-toggle-group** as shown in the code snipped below.

  ```html
  <nx-circle-toggle-group>
    <nx-circle-toggle value="A" icon="product-car" label="Label A"></nx-circle-toggle>
    <nx-circle-toggle value="B" icon="product-heart" label="Label B"></nx-circle-toggle>
  </nx-circle-toggle-group>
  ```
* **number-stepper:** **number-stepper**: The [nxStyle] property, defining the font-weight of the number stepper input was removed. The functionality behind this property was already removed before.
* **dynamic-table:** **dynamic-table**: The `nxStyle` input was removed and therefore the styling options (default and light table header styling). The former `border` (no-color) styling will now be used as the default styling.
* **checkbox-circle:** **checkbox-circle**: The checkbox-circle component was removed. Instead use the new component **nx-circle-toggle** as shown in the code snippet below. In addition, don't forget to replace the import of NxCheckboxCircleModule through NxCircleToggleModule.

  ```html
  <nx-circle-toggle checked="true" icon="search" label="With Icon" value="A">
  </nx-circle-toggle>
  ```
* **sidebar**: the toggle button at the bottom of the sidebar is now opt-in and not there by default. if you want to use the button you can add a predefined `nxSidebarToggle` button into the new sidebar-footer slot.  
This also enables you to add tooltips and correct aria attributes to the button as it is not hidden in the sidebar template anymore.

  ```html
  <nx-sidebar>
    <nx-sidebar-footer>
      <button nxSidebarToggle aria-label="Toggle sidebar"></button>
    </nx-sidebar-footer>
  </nx-sidebar
  ```




# [7.11.0](https://github.developer.allianz.io/ilt/ngx-ndbx/compare/v7.10.0...v7.11.0) (2019-06-04)


### Bug Fixes

* **autocomplete:** remove default chrome foxus style ([#1528](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1528)) ([78352c0](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/78352c0))
* **dropdown:** prevent changed after checked errors after close ([#1509](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1509)) ([a42a03c](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/a42a03c))
* **list:** correct styles on nested lists ([#1515](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1515)) ([9733b98](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/9733b98))


### Features

* **button:** add icon only button ([#1513](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1513)) ([5a81408](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/5a81408))
* **button:** add tertiary button ([#1503](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1503)) ([7dd57cc](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/7dd57cc))
* **codeinput:** added type support ([#1440](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1440)) ([5e6a75c](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/5e6a75c))
* **error:** extend error to cover also b2c styles ([#1480](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1480)) ([f822266](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/f822266))
* **list:** added new smaller size option [#1460](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1460) ([29efd99](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/29efd99))
* **number-stepper:** add prefix and suffix ([#1410](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1410)) ([84b77bf](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/84b77bf))
* **pagination:** add arrows for first and last ([#1439](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1439)) ([23a7e25](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/23a7e25))
* **tooltip:** add tooltip component  ([#1492](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1492)) ([4154445](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/4154445))



# [7.10.0](https://github.developer.allianz.io/ilt/ngx-ndbx/compare/v7.9.0...v7.10.0) (2019-05-24)


### Bug Fixes

* **autocomplete:** high contrast with system colors ([#1475](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1475)) ([c81f89f](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/c81f89f))
* **badge:** center text correctly ([#1461](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1461)) ([ff4766c](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/ff4766c))
* **badge, radio-button:** high contrast ([#1466](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1466)) ([e5b0cef](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/e5b0cef))
* **card:** add high contrast with system colors ([#1469](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1469)) ([098db01](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/098db01))
* **checkbox:** add aria-hidden to icon ([#1446](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1446)) ([ef0e626](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/ef0e626))
* **checkbox:** remove double checkbox change event ([#1438](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1438)) ([37c14d8](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/37c14d8))
* **code-input:** add tabindex support ([#1488](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1488)) ([9a23fe4](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/9a23fe4))
* **dropdown:** add high contrast with system colors ([#1467](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1467)) ([1ecd454](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/1ecd454))
* **header:** fix high contrast ([#1473](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1473)) ([bfd4460](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/bfd4460))
* **sidebar:** high contrast mode with system colors ([#1472](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1472)) ([5a5a479](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/5a5a479))
* **tabs:** prevent focus on inactive tab-bodies 1431 ([#1468](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1468)) ([8eeb4cc](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/8eeb4cc))


### Features

* **datefield:** add global configuration token ([#1487](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1487)) ([38bb94c](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/38bb94c))
* **datefield:** make toggle focus configurable ([#1453](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1453)) ([d509509](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/d509509))
* **global-config:** global component presets  ([#1402](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1402)) ([267a057](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/267a057))
* **input:** add toggle password visibility ([#1278](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1278)) ([2598acc](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/2598acc))
* **mask:** add validation ([#1414](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1414)) ([263410a](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/263410a))
* **utils:** add an ErrorStateMatcher service ([#1423](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1423)) ([4c3aa4e](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/4c3aa4e))



# [7.9.0](https://github.developer.allianz.io/ilt/ngx-ndbx/compare/v7.8.0...v7.9.0) (2019-05-14)


### Bug Fixes

* **datefield, formfield:** update and align toggle icon and formfield appendix ([#1381](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1381)) ([907401e](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/907401e))
* **dropdown:** float label on focus ([#1403](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1403)) ([2dde0da](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/2dde0da))
* **footer:** add focus style to footer links ([#1429](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1429)) ([2cfebea](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/2cfebea))
* **formfield:** correct floating position of outline label ([#1383](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1383)) ([2b09fab](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/2b09fab))
* **formfield:** fix blurry text in some circumstances ([#1396](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1396)) ([d17e503](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/d17e503))
* **formfield:** prevent jumping when selecting a value in dropdown ([#1401](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1401)) ([7bc1129](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/7bc1129))
* **number-stepper:** update template on value change ([#1422](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1422)) ([4321de8](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/4321de8))
* **pagination:** add focus style only on keyboard events ([#1424](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1424)) ([eb8bf8a](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/eb8bf8a))
* **pagination:** update spacing around dots ([#1394](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1394)) ([f9d82d8](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/f9d82d8))
* **radio-button, radio-circle, expansion-panel:** enable user select ([#1407](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1407)) ([46af074](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/46af074))
* **table:** correct height of expandable toggles ([#1398](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1398)) ([8877b26](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/8877b26))


### Features

* **card:** focus style for the selectable card ([#1427](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1427)) ([41ca9bf](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/41ca9bf))
* **icons:** update icon font and set peer dependency to ndbx-styles ([#1391](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1391)) ([68fbd84](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/68fbd84))
* **margins:** add margin variables and classes ([#1208](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1208)) ([d579a9a](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/d579a9a))
* **popover:** support lazy loading content ([#1298](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1298)) ([08a2b20](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/08a2b20))
* **radio-group:** added group label and slot for error messages ([#1370](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1370)) ([2eabf96](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/2eabf96))
* **table:** add sort and sort-header directives ([#1384](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1384)) ([d177b9f](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/d177b9f))



# [7.8.0](https://github.developer.allianz.io/ilt/ngx-ndbx/compare/v7.7.0...v7.8.0) (2019-04-26)


### Bug Fixes

* **formfield:** correct readonly colors ([#1377](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1377)) ([d84a357](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/d84a357))
* **tabs:** give header buttons type=button ([#1378](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1378)) ([9e2fa8f](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/9e2fa8f))
* **toggle-button:** change label background color for high contrast mode ([#1376](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1376)) ([3eef7c0](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/3eef7c0))


### Features

* **mask:** add input mask directive ([#1300](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1300)) ([0e4124d](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/0e4124d))



# [7.7.0](https://github.developer.allianz.io/ilt/ngx-ndbx/compare/v7.6.0...v7.7.0) (2019-04-24)


### Bug Fixes

* **autocomplete:** style according to dropdown look ([#1197](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1197)) ([3602356](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/3602356))
* **button:** correct vertical alignment of icon and text ([#1247](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1247)) ([025af04](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/025af04))
* **checkbox:** disabled label text color ([#1339](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1339)) ([83c2f80](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/83c2f80))
* **circle-toggle:** show disappearing svg on hover ([#1256](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1256)) ([0c6f6f0](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/0c6f6f0))
* **code-input:** correct styles and enable deleting on iOS ([#1343](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1343)) ([d9676bb](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/d9676bb))
* **datefield:** increase font-size of change-view button in datepicker ([#1316](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1316)) ([2bdd260](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/2bdd260))
* **datefield:** localize text of adjacent cells in calendar ([#1360](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1360)) ([50ae2bb](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/50ae2bb))
* **datepicker:** fix pointer styles ([#1291](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1291)) ([dcf3d69](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/dcf3d69))
* **dropdown:** correct TAB handling and item selection on screen reader ([#1322](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1322)) ([4a6cecf](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/4a6cecf))
* **dropdown:** fix pointer behavior ([#1323](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1323)) ([197caee](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/197caee))
* **dropdown:** prevent content overflow on IE11 ([#1299](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1299)) ([fc76748](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/fc76748))
* **formfield:** correct font weight and error focus ([#1309](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1309)) ([00400f6](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/00400f6))
* **formfield:** font weight of error floating label ([#1334](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1334)) ([667c429](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/667c429))
* **formfield:** increase hint font-size for outline appearance ([#1318](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1318)) ([589a491](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/589a491))
* **formfield:** restrict floating label width to container ([#1293](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1293)) ([0a3d845](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/0a3d845))
* **input:** remove clear button on IE11 ([#1273](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1273)) ([5a5a512](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/5a5a512))
* **list:** correct colors and alignment ([#1254](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1254)) ([46436cf](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/46436cf))
* **modal:** no overlap with mobile navigation bar ([#1354](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1354)) ([81fb6a2](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/81fb6a2))
* **number-stepper:** correct button color ([#1267](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1267)) ([913ec56](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/913ec56))
* **radio-button:** correct color on disabled + hover ([#1336](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1336)) ([c224714](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/c224714))
* **tree:** remove nxTreeNodeToggle from NxTreeNodeComponent([#1347](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1347)) ([114a12c](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/114a12c))
* **video:** change play button and remove grey line around video ([#1274](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1274)) ([41b0e2f](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/41b0e2f))


### Features

* **autocomplete:** panel should be longer than trigger element [#1221](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1221) ([4022a71](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/4022a71)), closes [#1326](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1326)
* **card:** add disabled card ([#1205](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1205)) ([05ce307](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/05ce307))
* **checkbox:** added checkbox group to handle new error states and label ([#1013](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1013)) ([462f2a7](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/462f2a7))
* **formfield:** add readonly for input and textarea ([#1319](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1319)) ([d066fda](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/d066fda))
* **icon:** update icon font ([#1350](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1350)) ([68d1329](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/68d1329))
* **modal:** add actions option for modal with disclaimer ([#1268](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1268)) ([ef6abe6](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/ef6abe6))
* **natural-language-form:** small size option ([#1103](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1103)) ([#1168](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1168)) ([12b1b02](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/12b1b02))
* **spinner:** add negative styling option ([#1269](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1269)) ([234ab7b](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/234ab7b))


### (BREAKING CHANGES: Expert alpha)

**Note**: Breaking changes only affect the expert components, which are currently declared as non-stable. Therefore, we are not bumping the major version number in this case.

* **tree:** There was an error that all tree items where "toggle items" and thus not propagating the click handler like links would do. To update you have to add the nxTreeNodeToggle directive to the items you want to toggle. Please refer to our tree example in the documentation. Sample code:

```
<nx-tree [dataSource]="_dataSource" [treeControl]="_treeControl">
  <nx-tree-node *nxTreeNodeDef="let node">
      <button nxAction
          nxTreeNodePadding
          nxTreeNodePaddingOffset="40"
          routerLinkActive="is-selected"
          routerLink="./"
          [queryParams]="node.query"
          title="{{node.label}}">
        <nx-icon *ngIf="node.icon" nxActionIcon [name]="node.icon" size="s"></nx-icon>
        {{node.label}}
      </button>
  </nx-tree-node>
  <nx-tree-node *nxTreeNodeDef="let node; when: _hasChild">
      <button nxAction
         nxTreeNodeToggle <------ !!! ADD THIS !!!!
          nxTreeNodePadding
          nxTreeNodePaddingOffset="40"
          expandable
          [expanded]="_treeControl.isExpanded(node)"
          title="{{node.label}}">
        <nx-icon *ngIf="node.icon" nxActionIcon [name]="node.icon" size="s"></nx-icon>
        {{node.label}}
      </button>
  </nx-tree-node>
</nx-tree>
```



# [7.6.0](https://github.developer.allianz.io/ilt/ngx-ndbx/compare/v7.5.0...v7.6.0) (2019-03-21)


### Bug Fixes

* **dropdown:** correct scrolling to active item in filter dropdown ([#1206](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1206)) ([c7b3629](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/c7b3629))
* **message:** fix mobile alignment of message content ([#1203](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1203)) ([eb01a61](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/eb01a61))
* **popover:** arrow style and border size ([#1199](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1199)) ([c89996f](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/c89996f))
* **radio-toggle-button:** remove multi select using space key ([#1224](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1224)) ([161a6ff](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/161a6ff))
* **textarea:** change font family to AllianzNeo ([#1218](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1218)) ([848de9e](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/848de9e))
* **toggle-button:** fix pressed styling ([#1222](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1222)) ([8cbbdd4](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/8cbbdd4))


### Features

* **checkbox:** add hover and pressed states ([#1220](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1220)) ([e8d92cd](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/e8d92cd))
* **multi-stepper:** make steps clickable ([#1173](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1173)) ([4c8e75a](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/4c8e75a))
* **number-stepper:** add leadingZero property ([#1204](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1204)) ([9af3fa2](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/9af3fa2))
* **radio-button:** add focus style ([#1219](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1219)) ([5d55a26](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/5d55a26))
* **tabs, rating, header, pagination:** add focus styles ([#1200](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1200)) ([9f57a6f](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/9f57a6f))



# [7.5.0](https://github.developer.allianz.io/ilt/ngx-ndbx/compare/v7.4.0...v7.5.0) (2019-03-13)


### Bug Fixes

* focus and error state styles on firefox ([#1136](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1136)) ([c67981a](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/c67981a))
* **datepicker-toggle:** remove focus from datepicker toggle ([#1170](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1170)) ([9d4d684](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/9d4d684))
* **docs:** style and inconsistencies fixes ([#1172](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1172)) ([dd2ca87](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/dd2ca87))
* **dropdown:** keyboard navigation in disabled dropdown ([#1134](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1134)) ([5933507](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/5933507))
* **nlf:** required state style on firefox ([#1178](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1178)) ([74db871](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/74db871))
* **nlf:** vertical align of words ([#875](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/875)) ([5f90ac3](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/5f90ac3))
* **radio-button:** add min-width for circle ([#1152](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1152)) ([6084271](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/6084271))
* **radio-button:** touch state of radio-group with keyboard ([#1132](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1132)) ([9a474ec](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/9a474ec))
* **sidebar:** width adjustible via css [#1024](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1024) ([#1037](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1037)) ([4796209](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/4796209))
* **style:** remove margins of components placed inside of table ([#1167](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1167)) ([7b519d5](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/7b519d5))


### Features

* **button:** add medium small type ([#1068](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1068)) ([9d00587](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/9d00587))
* **formfield:** support global settings for appearance and floatLabel ([#1140](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1140)) ([1d076bb](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/1d076bb))
* **radio-button:** add negative-styling property ([#1114](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1114)) ([8ddcf50](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/8ddcf50))
* **sidebar:** add output event on width change ([#1165](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1165)) ([84654c4](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/84654c4))
* **style:** new focus styles ([#1160](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1160)) ([4a670f4](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/4a670f4))
* **tabs:** add a tab-like component for route navigation ([#1091](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1091)) ([58787d5](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/58787d5))



<a name="7.4.0"></a>
# [7.4.0](https://github.developer.allianz.io/ilt/ngx-ndbx/compare/v7.3.0...v7.4.0) (2019-02-22)

Important note: there was an error that the badge component was still part of the main entry point which was unintended. If you already used the badge and did the import from `@allianz/ngx-ndbx` please change the import to `@allianz/ngx-ndbx/badge` as stated in the documentation.

Style changes: there are new keyboard focus styles for the form control components which replaced the old purple background. The new style is a blue box-shadow with a white inset so that the blue border has some offset to the component.

### Bug Fixes

* **badge:** remove from main entry point ([#1107](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1107)) ([74b6aa4](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/74b6aa4))
* **datefield:** update year labels on keyboard-navigation ([#1119](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1119)) ([59a434d](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/59a434d))
* **switcher:** added W3C role for a11y of switcher ([#1083](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1083)) ([cfc9124](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/cfc9124))


### Features

* **checkbox:** add new checkbox change event containing instance reference ([#1080](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1080)) ([7d58600](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/7d58600))
* **code-input:** add code input component ([#1047](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1047)) ([3cb6c55](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/3cb6c55))
* **datefield:** add new calendar style ([#1086](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1086)) ([f3e993d](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/f3e993d))
* **formfield:** support custom and native controls [#978](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/978) ([#1031](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1031)) ([01cf5c9](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/01cf5c9))
* **mobile-menu:** add mobile menu components ([#961](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/961)) ([25c2ed8](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/25c2ed8))
* **radio-button:** add option to change the label size ([#1115](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1115)) ([51b7f33](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/51b7f33))
* **style:** new focus styles ([#1053](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1053)) ([c9ff187](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/c9ff187))
* **table:** expandable rows ([#1102](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1102)) ([8af17f0](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/8af17f0))



<a name="7.3.0"></a>
# [7.3.0](https://github.developer.allianz.io/ilt/ngx-ndbx/compare/v7.2.0...v7.3.0) (2019-02-13)


### Bug Fixes

* **package:** remove new components from main entry point ([#1082](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1082)) ([f6d5637](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/f6d5637))


### Features

* **dropdown:** use flexible dimensions for dropdown overlay [#962](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/962) ([#1027](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1027)) ([3164711](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/3164711))



<a name="7.2.0"></a>
# [7.2.0](https://github.developer.allianz.io/ilt/ngx-ndbx/compare/v7.1.0...v7.2.0) (2019-02-12)

This version includes new components called "expert components" which are intended to be used for internal
applications. These components are released as an experimental/alpha state and may introduce breaking changes in next versions. The documentation is available at https://api-test.allianz.com/ngx-ndbx-test/

### Bug Fixes

* **autocomplete:** overlay width fits the input width ([#1023](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1023)) ([aff076c](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/aff076c))
* **dropdown:** dropdown in NLF has a small grey bar at the top [#953](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/953) ([#1061](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1061)) ([5cc1e7e](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/5cc1e7e))
* **rating:** add missing onPush implementation ([#1015](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1015)) ([d7b3e4c](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/d7b3e4c))


### Features

* **formfield:** add custom label option  ([#1030](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1030)) ([b550a1f](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/b550a1f))
* **list:** add an example for custom list item color ([#1051](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1051)) ([2549e8a](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/2549e8a))
* **number-stepper:** add negative styling-option ([#1052](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1052)) ([2c47374](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/2c47374))
* **table:** add basic table ([#991](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/991)) ([ebbe7ae](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/ebbe7ae))

### Expert components
* **action**
* **badge**
* **footer**
* **header**
* **sidebar**
* **tree**


<a name="7.2.0-beta.0"></a>
# [7.2.0-beta.0](https://github.developer.allianz.io/ilt/ngx-ndbx/compare/v7.1.0...v7.2.0-beta.0) (2019-02-07)


### Bug Fixes

* **autocomplete:** overlay width fits the input width ([#1023](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1023)) ([aff076c](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/aff076c))
* **rating:** add missing onPush implementation ([#1015](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1015)) ([d7b3e4c](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/d7b3e4c))


### Features

* **formfield:** add custom label option  ([#1030](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1030)) ([b550a1f](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/b550a1f))
* **list:** add an example for custom list item color ([#1051](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1051)) ([2549e8a](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/2549e8a))
* **number-stepper:** add negative styling-option ([#1052](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/1052)) ([2c47374](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/2c47374))
* **table:** add basic table ([#991](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/991)) ([ebbe7ae](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/ebbe7ae))



<a name="7.1.0"></a>
# [7.1.0](https://github.developer.allianz.io/ilt/ngx-ndbx/compare/v7.0.0...v7.1.0) (2019-01-22)


### Bug Fixes

* **checkbox:** click problems in multiselect dropdown ([#963](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/963)) ([12b7773](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/12b7773))
* **datefield:** add cursor:pointer on clickable elements ([#945](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/945)) ([2a065a7](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/2a065a7))
* **dropdown:** clear selected value when filter input does not match any item ([#935](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/935)) ([057f90f](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/057f90f))
* **link:** remove NodeList.forEach for IE compatibility ([#972](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/972)) ([574970a](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/574970a))
* **message:** correct width of content ([#929](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/929)) ([f93db94](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/f93db94))
* **popover:** clean up open overlays on trigger destroy ([#956](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/956)) ([72aa18a](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/72aa18a))
* **radio-button:** set checked in initialization ([#920](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/920)) ([b51844a](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/b51844a))


### Features

* **card:** add card component ([#828](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/828)) ([85c5782](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/85c5782))
* **dropdown:** add possibility to customize closed label ([#891](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/891)) ([d7f2ded](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/d7f2ded))



<a name="7.0.0"></a>
# [7.0.0](https://github.developer.allianz.io/ilt/ngx-ndbx/compare/v6.4.0...v7.0.0) (2019-01-11)

### Highlights
* No breaking changes :) The update should be seemless as Angular also doesn't have breaking changes.
* With v7.0.0 all design changes coming from the 8x8 point grid are implemented in the library. Please check if the visual changes impact your UI and UX.
* Some design changes added new elements to the components, e.g. the message component now has an icon indicating the type of message. We tried to make these new things opt-in to not interfere with existing implementations in your projects.
* If you find some major implications in your projects please report to us by opening a github issue.


### Bug Fixes

* **checkbox:** add label size input property ([#884](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/884)) ([28fe6bd](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/28fe6bd))
* **checkbox:** correct checkbox vertical alignment ([#871](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/871)) ([ec2bb04](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/ec2bb04))
* **dropdown:** correct display of multi dropdown items ([#866](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/866)) ([67e93fe](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/67e93fe))
* **dropdown:** fix overflow on android ([#876](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/876)) ([08e9d65](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/08e9d65))
* **formfield:** make disabled formfield input visible ([#868](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/868)) ([659f358](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/659f358))
* **grid:** nxColOffset accepts 0 as value now ([#867](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/867)) ([8844a37](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/8844a37))
* **pagination:** enable localisation of 'of' ([#899](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/899)) ([5478b0d](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/5478b0d))
* **radio-toggle:** implement correct mobile styles ([#893](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/893)) ([a36f485](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/a36f485))


### Features

* **checkbox:** add negative style ([#894](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/894)) ([f43dce9](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/f43dce9))
* **message:** add option to show icon related to context ([#897](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/897)) ([1aca83a](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/1aca83a))
* **slider:** add option to hide thumb label ([#853](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/853)) ([86f4c90](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/86f4c90))
* **switcher:** add label size option ([#865](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/865)) ([60cec07](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/60cec07))

### Deprecations
Some components and properties were deprecated. All listed items will be removed in `v8.0.0`

* **checkbox-circle:** The checkbox circle component has been deprecated. Use the new `nx-circle-toggle` component instead.
* **nx-radio-circle:** The radio circle component has been deprecated. Use the new `nx-circle-toggle` combined with the `nx-circle-toggle-group` component instead.
* **number-stepper:** The `nxStyle` input property has been deprecated because the options for the font-weight were removed from the NDBX style.
* **dynamic-table:** The `default` and `light` styling options for `nxType` have been deprecated because they have been removed from the NDBX style.


<a name="6.4.0"></a>
# [6.4.0](https://github.developer.allianz.io/ilt/ngx-ndbx/compare/v6.3.0...v6.4.0) (2018-10-29)


### Bug Fixes

* **dropdown:** pass viewValue to filter function ([#747](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/747)) ([4157f50](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/4157f50))
* **input:** textarea height is no longer restricted ([#735](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/735)) ([471332e](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/471332e))
* **number-stepper:** make the button aria-labels translatable ([#745](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/745)) ([2e13d8b](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/2e13d8b))
* **popover:** nxClosed event is now triggered consistently ([#719](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/719)) ([48ad1c7](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/48ad1c7)), closes [#442](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/442)
* **popover:** wrong arrow position in IE ([#750](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/750)) ([12003a4](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/12003a4))
* **progress-stepper:** prevent changed after checked error ([#748](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/748)) ([c5f8db8](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/c5f8db8)), closes [#743](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/743)
* **slider:** multiple sliders changed by keyboard ([#737](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/737)) ([8b45a31](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/8b45a31)), closes [#715](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/715)


### Features

* **circle-toggle:** CircleToggle component added ([#657](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/657)) ([9f8074e](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/9f8074e))
* **grid:** add ability to offset columns ([#734](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/734)) ([b0c9b66](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/b0c9b66))
* **snippets:** adding components to code snippets ([#738](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/738)) ([b3f02eb](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/b3f02eb))


<a name="6.3.0"></a>
# [6.3.0](https://github.developer.allianz.io/ilt/ngx-ndbx/compare/v6.2.0...v6.3.0) (2018-10-16)


### Bug Fixes

* **button:** added CSS for block option ([#649](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/649)) ([c33370c](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/c33370c))
* **docs:** Removed typo in setup for style.css ([#647](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/647)) ([4fbb3d6](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/4fbb3d6))
* **dropdown:** set correct class on item preselection ([#717](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/717)) ([5881e7a](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/5881e7a))
* **dropdown:** update item template when ng-content changes ([#651](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/651)) ([d36ca30](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/d36ca30))
* **list:** switch to nx-icon to display icons again ([#689](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/689)) ([b14a9a7](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/b14a9a7))
* **nlf:** correct word display on IE11 ([#708](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/708)) ([de6148e](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/de6148e))
* **progress-stepper:** ensure checkmark is hidden when inactive ([#642](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/642)) ([83f0b41](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/83f0b41)), closes [#639](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/639)
* **slider:** clamp percentage calculation ([#652](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/652)) ([2bcee89](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/2bcee89))


### Features

* **nx-formfield:** add appendix slot to formfield ([#635](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/635)) ([bcecad8](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/bcecad8))
* **switcher:** add switcher with left label ([#718](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/718)) ([9d272ed](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/9d272ed))
* **tabs:** add new tabs component ([#648](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/648)) ([27ecb60](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/27ecb60))


<a name="6.2.0"></a>
# [6.2.0](https://github.developer.allianz.io/ilt/ngx-ndbx/compare/v6.1.0...v6.2.0) (2018-08-30)


### Bug Fixes

* **docs:** npmrc copy & past example invalid ([41a69c8](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/41a69c8))
* **dropdown:** add padding to item to prevent collapsing of panel ([0a0b5ae](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/0a0b5ae))
* **dropdown:** major refactoring to fix several issues ([#595](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/595)) ([bbe8b84](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/bbe8b84))
* **dropdown:** panel width equals trigger width again ([#619](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/619)) ([03ea041](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/03ea041))
* **modal:** change overlay z-index to 100 ([#567](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/567)) ([543c783](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/543c783))
* **modal:** content will now scrollable once too large ([5c671f8](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/5c671f8))
* **NxRadioCircle:** IE11 bug with swallowed mouse pointer on svg ([705487c](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/705487c))
* **popover:** correcting the arrow position ([#581](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/581)) ([0e19445](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/0e19445))
* **popover:** fix build error during test ([0602cf9](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/0602cf9))
* **popover:** refactor popover to only render in viewport ([#551](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/551)) ([4fbb78a](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/4fbb78a))
* **radio-button:** fix ExpressionChangedAfterItHasBeenCheckedError ([#607](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/607)) ([0298661](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/0298661))
* **radio-circle:** icon sizes too small some circumstances ([d0f2883](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/d0f2883))
* **radio-toggle:** allow empty radio toggles (github issue [#421](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/421)) ([9d7e2d0](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/9d7e2d0))
* **radio-toggle:** center button labels vertically ([21443ab](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/21443ab))
* **snippets:** wrong snippet format of checkbox corrected ([#563](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/563)) ([44b32f4](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/44b32f4))
* access modifiers for negative and _accordionstyle ([34862ca](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/34862ca))
* disabled CSS Text Size Adjusting to fix floating labels on iOS ([#242](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/242)) ([dcde465](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/dcde465))
* floating label was jumping in Firefox ([67d38b3](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/67d38b3))
* **taglist:** enable deleting tags through keyboard interaction ([faac9a3](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/faac9a3))
* **taglist:** prevent Mozilla from going back on BACKSPACE pressed ([d3bb374](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/d3bb374))
* **taglist:** text wrapping works in IE11 now ([007b315](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/007b315))


### Features

* **dropdown:** add custom filter function support ([e724272](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/e724272))
* **formfield:** you can now specify if a label should always float ([71d9c98](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/71d9c98))
* **taglist:** allow and style two lined tags ([515acbc](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/515acbc))


<a name="6.1.0"></a>
# [6.1.0](https://github.developer.allianz.io/ilt/ngx-ndbx/compare/v6.0.0...v6.1.0) (2018-07-09)


### Bug Fixes

* correcting module name from NxButtonModule to NxIconModule ([c014592](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/c014592))


### Features

* **accordion:** add new accordion component ([#550](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/550)) ([aad98fe](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/aad98fe))



<a name="6.0.0"></a>
# [6.0.0](https://github.developer.allianz.io/ilt/ngx-ndbx/compare/v3.2.1...v6.0.0) (2018-06-26)

### Important Notes
Please refer to the BREAKING CHANGES section below to upgrade to our 6.0.0 major release for the necessary steps to upgrade.<br />
You can also find other information about our release in the [releases section](https://api-test.allianz.com/ngx-ndbx-next/news#releases).

The NDBX library is now based on Angular 6. Please refer to the [Angular update page](https://update.angular.io/) for the necessary steps to migrate to Angular 6.

### Bug Fixes

* add missing negative style for inputs and dropdowns in natural language form ([#409](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/409)) ([f93a6d1](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/f93a6d1))
* allow custom classes in components ([#360](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/360)) ([a500875](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/a500875))
* **autocomplete:** fixed wrong handling of disabled state ([db91af8](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/db91af8))
* change prefix and suffix styling ([#359](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/359)) ([7f1c60d](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/7f1c60d))
* **autocomplete:** manual subscription handling of items instead of async pipe ([3d32c08](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/3d32c08))
* **autocomplete:** Wrong imports caused AOT build errors ([65df8a2](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/65df8a2))
* **checkbox-circle:** add negative margins to center svg ([#469](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/469)) ([59762bf](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/59762bf))
* **docs:** add missing property in datefield examples ([#508](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/508)) ([14d31e3](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/14d31e3))
* **docs:** scroll issues on some components fixed ([12849c9](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/12849c9))
* **dropdown:** chevron size is fixed to 20px now ([#457](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/457)) ([c7bff90](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/c7bff90))
* **dropdown:** keyboard selection with up/down keys when filter input is active is working again ([#490](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/490)) ([eaa5dcc](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/eaa5dcc))
* **grid:** add secondary entry point (BREAKING) ([3c81e74](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/3c81e74))
* **input:** modify visibility of variable ([#529](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/529)) ([bfbbfa4](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/bfbbfa4))
* **modal:** clickHandler event bubbling is stopped now ([#464](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/464)) ([05bc899](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/05bc899))
* **natural-language-form:** update font-weight, color and size for the long word option ([#451](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/451)) ([50a6476](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/50a6476))
* Popover arrow alignment on hover ([a5dacc3](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/a5dacc3))
* **number-stepper:** fix wrong disabled border, fix wrong alignment o… ([#487](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/487)) ([871b548](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/871b548))
* **NxDatepicker:** AOT errors fixed ([af88a99](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/af88a99))
* **NxDropdown:** AOT errors fixed ([3067e88](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/3067e88))
* update pagination docs to show custom pagination texts ([71f6c76](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/71f6c76))
* **NxGrid:** AOT fixes ([5492016](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/5492016))
* **NxNaturalLanguageForm:** AOT errors fixed ([f00f85f](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/f00f85f))
* **NxPopover:** AOT errors fixed ([ad6bc4a](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/ad6bc4a))
* **NxProgressStepper:** Angular 6 fixes ([87469ce](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/87469ce))
* **NxRadioCircle:** Aligned breakpoints when circles are not collapsing with the default behavior ([151ff83](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/151ff83))
* dropdown doesn't throw ExpressionChangedAfterItHasBeenCheckedError with items in a ngFor loop anymore ([#400](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/400)) ([6766ab5](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/6766ab5))
* **NxTaglist:** AOT errors fixed ([0d385e1](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/0d385e1))
* **NxVideoComponent:** AOT errors fixed ([612d1f0](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/612d1f0))
* remove Object.values from version-select to work in IE again ([#403](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/403)) ([eb7e755](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/eb7e755))
* **popover:** added missing rxjs operator ([bde58b9](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/bde58b9))
* **slider:** fix decimal handling and add secondary entry point (BREAKING) ([b1bcf6f](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/b1bcf6f))
* dropdown shows correct labels for falsy values like 0 ([#386](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/386)) ([8c7bb7b](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/8c7bb7b))
* **word:** aligning nxWord members with nxFormField ([21ce216](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/21ce216))
* fix font-size of nx-icon with class nx-link__icon ([#384](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/384)) ([75656cc](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/75656cc))
* mousleave instead of mouseout to prevent early exit of popover ([ec51f31](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/ec51f31))
* natural language form typography and alignment are in line with styleguide definitions now ([#396](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/396)) ([cf4175a](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/cf4175a))
* nxOpenModalOnClick directive is working with nxButton again ([#413](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/413)) ([ecc4c0e](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/ecc4c0e))
* nxPopoverCloseable is considered for trigger type click now ([#395](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/395)) ([5b53b4c](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/5b53b4c))
* NxSwitcher two-way binding now working ([5878c2c](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/5878c2c))
* Remove dependency to Angular 5, fix v6 statement ([086164c](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/086164c))
* totalNumberPages is recalculated when nxCount changes in pagination ([f73d420](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/f73d420))


### Chores

* NxButton has now fully encapsulated its css ([ab3c0d9](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/ab3c0d9))
* nxFigureComponent (image) is now fully encapsulated and using its own css ([#428](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/428)) ([2c1200c](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/2c1200c))


### Code Refactoring

* Default NxDateAdapter date implementation based on moment removed ([db429db](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/db429db))
* Move NxIconModule into its own entry point to get imported by other entry points ([00776fb](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/00776fb))
* nxDisabled changed to disable in directive nxDatefield. ([12b1258](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/12b1258))
* NxFormfield moved into a separate entrypoint. ([9740e97](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/9740e97))
* **copytext:** copytext is fully encapsulated and using its own css ([#416](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/416)) ([fbec04e](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/fbec04e))
* nxHeadline is fully encapsulated and using its own css now ([#424](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/424)) ([6156f24](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/6156f24))
* NxInput moved into a separate entry point. ([ca164d5](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/ca164d5))
* **grid:** grid is using view encapsulation and its own css now ([#455](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/455)) ([50458af](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/50458af))
* **NxList:** Now with a fully encapsulated CSS. ([95f965d](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/95f965d))


### Features

* Add configuration option nxResponsiveToggle for radio circle ([#381](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/381)) ([06735a2](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/06735a2))
* Include support for html tags in nx-dynamic-table ([28822ed](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/28822ed))
* NxDatepicker functionality added to the NxDatefield directive. ([6d36a26](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/6d36a26))
* progress stepper ([#299](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/299)) ([9671758](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/9671758))
* **autocomplete:** implemented nxValueFormatter ([8cf973a](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/8cf973a))
* **autocomplete:** refactored autocomplete ([b819a2a](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/b819a2a))
* **formfield:** added conditional label floating, publicly exposing elementRef ([7418a62](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/7418a62))
* **modal:** add fixed width sizing option ([fc28893](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/fc28893))
* **radio-circle:** add disabled state ([#537](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/537)) ([5571ca5](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/5571ca5))


### BREAKING CHANGES

* **slider:** **Attention**: Import for NxSliderModule changed from '@allianz/ngx-ndbx' to '@allianz/ngx-ndbx/slider'

We moved the NxSlider into a secondary entry point because of its dependency to decimal.js. By this decimal.js is only pulled into your project if you actually use the slider.
* `NxFormfield` moved into a separate entry point. This is part of our efforts to divide the codebase into smaller chunks instead of relying on a single one (@allianz/ngx-ndbx).

You have to change the import statements if you are using NxFormfieldModule or other parts of this module:
```
// Now invalid:
// import { NxFormfieldModule } from '@allianz/ngx-ndbx';

// New import from secondary entry point
import { NxFormfieldModule } from '@allianz/ngx-ndbx/formfield';
```
* the nxFigureDirective is renamed to nxFigureComponent to reflect it is a component. nxImageDirective is deprecated - img elements inside figure[nxFigure] automatically adapt depending on parent css classes.
* **grid:** NxColDirective was renamed to NxColComponent
NxRowDirective was renamed to NxRowComponent
NxGridDirective was renamed to NxGridComponent
* **NxList:** `NxListDirective` name changde to `NxListComponent` to reflect
that it's a component now.
* the NxHeadlineDirective was renamed to NxHeadlineComponent. The module name `NxHeadlineModule` stays the same.
* **grid:** **Attention**: Import changed from '@allianz/ngx-ndbx' to '@allianz/ngx-ndbx/grid'

We moved the NxGrid into a secondary entry point in preparation for the slider secondary entry point as ng-packagr currently doesn't support importing modules from the main entry point into a second entry point.
* NxButtonDirective was renamed to NxButtonComponent. The module name `NxButtonModule`
stays the same so we don't expect many people to be affected.
* NxIconModule moved into separate entry point.

You have to change the import statements if you are using NxIconModule:
```
// Now invalid:
// import { NxIconModule } from '@allianz/ngx-ndbx';

// New import from secondary entry point
import { NxIconModule } from '@allianz/ngx-ndbx/icon';
```

This change was required to use the icon in other secondary entry points like the Datepicker in `@allianz/ngx-ndbx/datefield`.
* NxDatefieldDirective's nxDisabled renamed to disable.

We had to rename the property as it conflicts with the nxInput Directive where it is named 'disabled' only.
* Default import of `NxMomentDateModule` removed.

This change will allow to chose between different implementations and reduce the bundle size in case you are not using Moment.js

You now have to import it manually in your app root otherwise you get a missign provider error. You can now choose between the compact `NxNativeDateModule` and `NxMomentDateModule`. You won't have no advanced parsing support with the native date adapter so we suggest to use the `NxMomentDateModule`. Import it from `@allianz/ngx-ndbx/moment-date-adapter`.
* `NxInput` was moved into a separate entry point. This is part of our efforts to divide the codebase into smaller chunks instead of relying on a single one (@allianz/ngx-ndbx).

You have to change the import statements if you are using NxInputModule or other parts of this module:
```
// Now invalid:
// import { NxInputModule } from '@allianz/ngx-ndbx';

// New import from secondary entry point
import { NxInputModule } from '@allianz/ngx-ndbx/input';
```
* **copytext:** NxCopytextDirective was renamed to NxCopytextComponent. The module name stays the same so you are only affected if you used NxCopytextDirective directly in your code.


<a name="3.2.1"></a>
## [3.2.1](https://github.developer.allianz.io/ilt/ngx-ndbx/compare/v3.2.0...v3.2.1) (2018-03-28)



<a name="3.2.0"></a>
# [3.2.0](https://github.developer.allianz.io/ilt/ngx-ndbx/compare/v3.1.3...v3.2.0) (2018-03-27)


### Bug Fixes

* dropdown now renders correctly with disabled = false + change event handling ([#332](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/332)) ([8ade3c1](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/8ade3c1))
* nx-icon change size autosize to auto ([#336](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/336)) ([1fb0988](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/1fb0988))
* radio circle svg IE hover not working ([#318](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/318)) ([4db4085](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/4db4085))


### Features

* Add pagination component ([#240](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/240)) ([10d88fd](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/10d88fd))
* autocomplete model sync with input ([#319](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/319)) ([d9051d1](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/d9051d1))
* multi dropdown ([#302](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/302)) ([2d58a6a](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/2d58a6a))
* release plan and manifest (unlinked) ([#298](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/298)) ([d0a06ee](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/d0a06ee))



<a name="3.1.3"></a>
## [3.1.3](https://github.developer.allianz.io/ilt/ngx-ndbx/compare/v3.1.2...v3.1.3) (2018-03-22)


### Bug Fixes

* fixed angular.cli configuration issue ([#323](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/323)) ([b05c63b](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/b05c63b))



<a name="3.1.2"></a>
## [3.1.2](https://github.developer.allianz.io/ilt/ngx-ndbx/compare/v3.1.1...v3.1.2) (2018-03-21)


### Bug Fixes

* formfield prefix and suffix styling ([#304](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/304)) ([0e78b30](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/0e78b30))



<a name="3.1.0"></a>
# [3.1.0](https://github.developer.allianz.io/ilt/ngx-ndbx/compare/v3.0.6...v3.1.0) (2018-03-20)


### Features

* add closing variants for nxPopover for feature request [#196](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/196) ([#264](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/264)) ([820dc26](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/820dc26))



<a name="3.0.6"></a>
## [3.0.6](https://github.developer.allianz.io/ilt/ngx-ndbx/compare/v3.0.5...v3.0.6) (2018-03-19)



<a name="3.0.5"></a>
## [3.0.5](https://github.developer.allianz.io/ilt/ngx-ndbx/compare/v3.0.4...v3.0.5) (2018-03-19)



<a name="3.0.4"></a>
## [3.0.4](https://github.developer.allianz.io/ilt/ngx-ndbx/compare/v3.0.3...v3.0.4) (2018-03-14)



<a name="3.0.1"></a>
## [3.0.1](https://github.developer.allianz.io/ilt/ngx-ndbx/compare/v3.0.0...v3.0.1) (2018-03-13)



<a name="3.0.0"></a>
# [3.0.0](https://github.developer.allianz.io/ilt/ngx-ndbx/compare/v2.7.0...v3.0.0) (2018-03-13)


### Bug Fixes

* color fields with errors red again ([#248](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/248)) ([6cf020a](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/6cf020a)), closes [#243](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/243)
* Datefield as Secondary Entry, soften moment.js dependency ([#266](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/266)) ([fb889f9](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/fb889f9))
* Datefield secondary entry (BREAKING) ([#272](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/272)) ([cddc4c8](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/cddc4c8))
* Radio Circle with svgs - hoverState is incorrect [#253](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/253) ([#261](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/261)) ([7d16cc5](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/7d16cc5))


### BREAKING CHANGES

* **Attention**: Import changed from '@allianz/ngx-ndbx' to '@allianz/ngx-ndbx/datefield'

We moved the NxDatefield into a scondary entry point to relax the dependency on moment. Before moment was pulled into the main entry and was therefore required even without using the NxDatefield. See the related [issue](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/260)

**Important:** You need `typescript >= 2.6.x` when using this feature. This is related to the separate entry point. TS 2.6 is fully supported starting with Angular 5.2. For details why TS 2.6 is required see [here](https://github.com/dherges/ng-packagr/issues/677)



<a name="2.7.0"></a>
# [2.7.0](https://github.developer.allianz.io/ilt/ngx-ndbx/compare/v2.6.3...v2.7.0) (2018-03-12)


### Features

* number-stepper ([#182](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/182)) ([09d10da](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/09d10da))
* process rating ([#259](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/259)) ([58bfebf](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/58bfebf))



<a name="2.6.3"></a>
## [2.6.3](https://github.developer.allianz.io/ilt/ngx-ndbx/compare/v2.6.2...v2.6.3) (2018-03-12)


### Bug Fixes

* fixed issue in dropdown with content projection rendering. not the projected text will be used as label for the dropdown ([#263](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/263)) ([8573097](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/8573097))
* wrong css in formfield and input ([#254](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/254)) ([d080def](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/d080def))



<a name="2.6.2"></a>
## [2.6.2](https://github.developer.allianz.io/ilt/ngx-ndbx/compare/v2.6.1...v2.6.2) (2018-03-06)



<a name="2.6.1"></a>
## [2.6.1](https://github.developer.allianz.io/ilt/ngx-ndbx/compare/v2.6.0...v2.6.1) (2018-03-06)


### Bug Fixes

* AOT build errors ([#245](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/245)) ([4de3d05](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/4de3d05))
* Double Scrolling in docs fixed ([5d88248](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/5d88248))
* Number.parseInt vs window.parseInt ([fa13baa](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/fa13baa))



<a name="2.6.0"></a>
# [2.6.0](https://github.developer.allianz.io/ilt/ngx-ndbx/compare/v2.5.0...v2.6.0) (2018-03-05)


### Bug Fixes

* changed dropdown touched handling to provide better integration into natural language form ([#237](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/237)) ([bcec68e](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/bcec68e))


### Features

* page search ([#230](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/230)) ([8388dab](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/8388dab))



<a name="2.5.0"></a>
# [2.5.0](https://github.developer.allianz.io/ilt/ngx-ndbx/compare/v2.4.3...v2.5.0) (2018-03-02)


### Features

* NxMessage component ([6b3101a](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/6b3101a))



<a name="2.4.3"></a>
## [2.4.3](https://github.developer.allianz.io/ilt/ngx-ndbx/compare/v2.4.2...v2.4.3) (2018-03-01)



<a name="2.4.2"></a>
## [2.4.2](https://github.developer.allianz.io/ilt/ngx-ndbx/compare/v2.4.1...v2.4.2) (2018-03-01)



<a name="2.4.1"></a>
## [2.4.1](https://github.developer.allianz.io/ilt/ngx-ndbx/compare/v2.4.0...v2.4.1) (2018-03-01)



<a name="2.4.0"></a>
# [2.4.0](https://github.developer.allianz.io/ilt/ngx-ndbx/compare/v2.3.0...v2.4.0) (2018-02-28)


### Features

* autocomplete ([5fcdf89](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/5fcdf89))



<a name="2.3.0"></a>
# [2.3.0](https://github.developer.allianz.io/ilt/ngx-ndbx/compare/v2.2.3...v2.3.0) (2018-02-27)


### Features

* Modal dispatches a close event now ([1b91cfd](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/1b91cfd))



<a name="2.2.3"></a>
## [2.2.3](https://github.developer.allianz.io/ilt/ngx-ndbx/compare/v2.2.2...v2.2.3) (2018-02-26)


### Bug Fixes

* fixed wrong import for checkbox circle in demo ([#212](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/212)) ([5930b9d](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/5930b9d))



<a name="2.2.2"></a>
## [2.2.2](https://github.developer.allianz.io/ilt/ngx-ndbx/compare/v2.2.1...v2.2.2) (2018-02-26)



<a name="2.2.1"></a>
## [2.2.1](https://github.developer.allianz.io/ilt/ngx-ndbx/compare/v2.2.0...v2.2.1) (2018-02-22)


### Bug Fixes

* the modal dialog now allow clicking on custom controls within the dialog ([56cda70](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/56cda70))



<a name="2.2.0"></a>
# [2.2.0](https://github.developer.allianz.io/ilt/ngx-ndbx/compare/v2.1.2...v2.2.0) (2018-02-21)


### Bug Fixes

* dont overwrite classes in div element with grid directives. Fix [#188](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/188) ([5bbaa15](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/5bbaa15))


### Features

* NxDatefield with documentation added ([55135c8](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/55135c8))



<a name="2.1.0"></a>
# [2.1.0](https://github.developer.allianz.io/ilt/ngx-ndbx/compare/v2.0.2...v2.1.0) (2018-02-20)


### Bug Fixes

* Fixes [#167](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/167). Allows 1, 2, 3 or 4 parameters in directives like nxRowJustify in the grid component. ([856898d](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/856898d))
* removed radio circle margin on the right side ([#163](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/163)) ([360b53b](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/360b53b))


### Features

* dropdown ([#169](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/169)) ([6648cde](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/6648cde))



<a name="2.0.0"></a>
# [2.0.0](https://github.developer.allianz.io/ilt/ngx-ndbx/compare/v1.18.0...v2.0.0) (2018-02-16)


### Features

* nx-link component refactoring ([f025293](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/f025293))


### BREAKING CHANGES

* the directive nxLink was replaced by a component nx-link.
All CSS is bundled with the component and class prefixes were changed from "c-" to "nx-"
in order to avoid conflicts with the global stylesheet.

You can achieve the same effect as before (i.e. application of NDBX conformant styling)
by wrapping the anchor element the wrapper component nx-link.
To migrate the code follow the example below:

Before:

<a nxLink="black">link</a>

After:

<nx-link nxStyle="black">
    <a>link</a>
</nx-link>



<a name="1.18.0"></a>
# [1.18.0](https://github.developer.allianz.io/ilt/ngx-ndbx/compare/v1.17.0...v1.18.0) (2018-02-15)


### Bug Fixes

* make methods which are called from template public ([10d1c03](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/10d1c03))


### Features

* Video Player ([7390a66](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/7390a66))



<a name="1.17.0"></a>
# [1.17.0](https://github.developer.allianz.io/ilt/ngx-ndbx/compare/v1.16.5...v1.17.0) (2018-02-13)


### Bug Fixes

* fixed issue in radio circle component regarding ngFor + model update issue ([#144](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/144)) ([27e9a35](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/27e9a35))


### Features

* Improve Slider a11y ([c2ddc00](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/c2ddc00))
* improved ndbx conformity ([93b2374](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/93b2374))
* increase size for custom SVG to improve ndbx conformity ([75e37c2](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/75e37c2))
* switcher includes all relevant patternlab CSS ([b250249](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/b250249))



<a name="1.16.5"></a>
## [1.16.5](https://github.developer.allianz.io/ilt/ngx-ndbx/compare/v1.16.4...v1.16.5) (2018-02-08)



<a name="1.16.4"></a>
## [1.16.4](https://github.developer.allianz.io/ilt/ngx-ndbx/compare/v1.16.3...v1.16.4) (2018-02-07)


### Bug Fixes

* Put radio-circle back in list of exported modules ([ae4f903](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/ae4f903))
* replace button element with the original div, because of issues with the delete link in Firefox ([80c8e49](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/80c8e49))



<a name="1.16.2"></a>
## [1.16.2](https://github.developer.allianz.io/ilt/ngx-ndbx/compare/v1.16.1...v1.16.2) (2018-02-06)



<a name="1.16.1"></a>
## [1.16.1](https://github.developer.allianz.io/ilt/ngx-ndbx/compare/v1.16.0...v1.16.1) (2018-02-05)


### Bug Fixes

* AOT metdata error fixed by making paths to barrel files more explicit. ([844db68](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/844db68))



<a name="1.16.0"></a>
# [1.16.0](https://github.developer.allianz.io/ilt/ngx-ndbx/compare/v1.15.0...v1.16.0) (2018-02-02)


### Features

* Image atom ([2192006](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/2192006))



<a name="1.15.0"></a>
# [1.15.0](https://github.developer.allianz.io/ilt/ngx-ndbx/compare/v1.14.0...v1.15.0) (2018-02-01)


### Features

* popover ([a9d588f](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/a9d588f))
* Tag filter ([#100](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/100)) ([eebd519](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/eebd519))



<a name="1.14.0"></a>
# [1.14.0](https://github.developer.allianz.io/ilt/ngx-ndbx/compare/v1.13.5...v1.14.0) (2018-02-01)


### Features

* export modal service because it might be useful in some advanced use cases ([#116](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/116)) ([7e332ce](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/7e332ce))



<a name="1.13.5"></a>
## [1.13.5](https://github.developer.allianz.io/ilt/ngx-ndbx/compare/v1.13.4...v1.13.5) (2018-01-31)


### Bug Fixes

* convert nxValue to a number in case it gets initialized with a string rather than as a binding to a number ([#113](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/113)) ([b2067f4](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/b2067f4))



<a name="1.13.4"></a>
## [1.13.4](https://github.developer.allianz.io/ilt/ngx-ndbx/compare/v1.13.3...v1.13.4) (2018-01-31)


### Bug Fixes

* bugfix and test for an issue with setting the initial radio group value in reactive forms ([#107](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/107)) ([12086ee](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/12086ee))



<a name="1.13.2"></a>
## [1.13.2](https://github.developer.allianz.io/ilt/ngx-ndbx/compare/v1.13.1...v1.13.2) (2018-01-29)



<a name="1.13.1"></a>
## [1.13.1](https://github.developer.allianz.io/ilt/ngx-ndbx/compare/v1.13.0...v1.13.1) (2018-01-29)


### Bug Fixes

* Give icon an auto size option so it won't interfere when used in other components ([d2460d8](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/d2460d8)), closes [#25](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/25) [#85](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/85)
* Lifecycle issue in radio toggle / radio circle / checkbox-circle fixed ([f3530fa](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/f3530fa)), closes [#80](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/80) [#82](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/82)



<a name="1.13.0"></a>
# [1.13.0](https://github.developer.allianz.io/ilt/ngx-ndbx/compare/v1.12.2...v1.13.0) (2018-01-24)


### Bug Fixes

* Do not adapt Formfield to the parent text alignment ([e13f41e](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/e13f41e))


### Features

* Add Switcher Component ([#77](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/77)) ([20a89a7](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/20a89a7))



<a name="1.12.2"></a>
## [1.12.2](https://github.developer.allianz.io/ilt/ngx-ndbx/compare/v1.12.1...v1.12.2) (2018-01-24)



<a name="1.12.1"></a>
## [1.12.1](https://github.developer.allianz.io/ilt/ngx-ndbx/compare/v1.12.0...v1.12.1) (2018-01-23)


### Bug Fixes

* Add correct dependencies in package.json  ([7cc229a](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/7cc229a))


### Features

* remove unnecessary change detection handling ([#81](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/81)) ([a75116c](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/a75116c))



<a name="1.11.5"></a>
## [1.11.5](https://github.developer.allianz.io/ilt/ngx-ndbx/compare/v1.11.4...v1.11.5) (2018-01-23)



<a name="1.11.4"></a>
## [1.11.4](https://github.developer.allianz.io/ilt/ngx-ndbx/compare/v1.11.3...v1.11.4) (2018-01-22)


### Bug Fixes

* add modal module to public-api ([#69](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/69)) ([fa34330](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/fa34330))
* fixed missing svg in checkbox-circle component demo ([a38f11e](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/a38f11e))
* specific type AnimationReferenceMetadata for aot build ([#70](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/70)) ([45e9f3f](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/45e9f3f))



<a name="1.11.1"></a>
## [1.11.1](https://github.developer.allianz.io/ilt/ngx-ndbx/compare/v1.11.0...v1.11.1) (2018-01-19)


### Bug Fixes

* work around missing IE feature ([#65](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/65)) ([8f25701](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/8f25701))


### Features

* Add slider component ([5ea34cd](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/5ea34cd))
* Circle checkbox ([6266256](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/6266256))
* spinner component added ([be8bfea](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/be8bfea))



<a name="1.9.0"></a>
# [1.9.0](https://github.developer.allianz.io/ilt/ngx-ndbx/compare/v1.8.3...v1.9.0) (2018-01-18)


### Bug Fixes

* Bugfixes nxRadioToggle ([5085890](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/5085890)), closes [#51](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/51) [#52](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/52)


### Features

* Formfield with nxInput directive added ([2185fd8](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/2185fd8))



<a name="1.8.3"></a>
## [1.8.3](https://github.developer.allianz.io/ilt/ngx-ndbx/compare/v1.8.2...v1.8.3) (2018-01-16)



<a name="1.7.13"></a>
## [1.7.13](https://github.developer.allianz.io/ilt/ngx-ndbx/compare/v1.7.12...v1.7.13) (2018-01-16)


### Bug Fixes

* changes from MR for radio-circle atom ([43b5808](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/43b5808))


### Features

* radio circle component ([251a270](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/251a270))



<a name="1.7.11"></a>
## [1.7.11](https://github.developer.allianz.io/ilt/ngx-ndbx/compare/v1.7.10...v1.7.11) (2018-01-12)


### Bug Fixes

* Handle undefined values in nx-textfield properly' ([b7fb843](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/b7fb843)), closes [#38](https://github.developer.allianz.io/ilt/ngx-ndbx/issues/38)



<a name="1.7.6"></a>
## [1.7.6](https://github.developer.allianz.io/ilt/ngx-ndbx/compare/v1.7.5...v1.7.6) (2018-01-10)


### Reverts

* remove recent hmr changes ([bd73866](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/bd73866))



<a name="1.7.5"></a>
## [1.7.5](https://github.developer.allianz.io/ilt/ngx-ndbx/compare/v1.7.4...v1.7.5) (2018-01-09)



<a name="1.7.4"></a>
## [1.7.4](https://github.developer.allianz.io/ilt/ngx-ndbx/compare/v1.7.3...v1.7.4) (2018-01-09)



<a name="1.7.3"></a>
## [1.7.3](https://github.developer.allianz.io/ilt/ngx-ndbx/compare/v1.7.2...v1.7.3) (2018-01-09)



<a name="1.7.2"></a>
## [1.7.2](https://github.developer.allianz.io/ilt/ngx-ndbx/compare/v1.7.1...v1.7.2) (2018-01-09)



<a name="1.7.0"></a>
# [1.7.0](https://github.developer.allianz.io/ilt/ngx-ndbx/compare/v1.6.0...v1.7.0) (2018-01-09)


### Features

* enable HMR for dev web server ([524aca9](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/524aca9))



<a name="1.5.5"></a>
## [1.5.5](https://github.developer.allianz.io/ilt/ngx-ndbx/compare/v1.5.4...v1.5.5) (2018-01-09)



<a name="1.5.4"></a>
## [1.5.4](https://github.developer.allianz.io/ilt/ngx-ndbx/compare/v1.5.3...v1.5.4) (2018-01-09)



<a name="1.5.3"></a>
## [1.5.3](https://github.developer.allianz.io/ilt/ngx-ndbx/compare/v1.5.2...v1.5.3) (2018-01-09)



<a name="1.5.2"></a>
## [1.5.2](https://github.developer.allianz.io/ilt/ngx-ndbx/compare/v1.5.1...v1.5.2) (2018-01-09)



<a name="1.5.1"></a>
## [1.5.1](https://github.developer.allianz.io/ilt/ngx-ndbx/compare/v1.5.0...v1.5.1) (2018-01-09)


### Features

* radio toggle component with content projection ([de2caf9](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/de2caf9))
* Textfield can now be negative ([1b5c3c9](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/1b5c3c9))


### Reverts

* removed type information for NodeListOf because subsequent forEach on the node list would require "dom.iterable" in tsconfig.json, which does not play well with ng-packagr ([7421ff9](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/7421ff9))



<a name="1.3.5"></a>
## [1.3.5](https://github.developer.allianz.io/ilt/ngx-ndbx/compare/v1.3.4...v1.3.5) (2018-01-08)



<a name="1.3.4"></a>
## [1.3.4](https://github.developer.allianz.io/ilt/ngx-ndbx/compare/v1.3.3...v1.3.4) (2018-01-08)


### Features

* radio toggle component ([15b3f47](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/15b3f47))



<a name="1.1.6"></a>
## [1.1.6](https://github.developer.allianz.io/ilt/ngx-ndbx/compare/v1.1.5...v1.1.6) (2018-01-04)



<a name="1.1.3"></a>
## [1.1.3](https://github.developer.allianz.io/ilt/ngx-ndbx/compare/v1.1.2...v1.1.3) (2018-01-04)



<a name="1.1.2"></a>
## [1.1.2](https://github.developer.allianz.io/ilt/ngx-ndbx/compare/v1.1.1...v1.1.2) (2017-12-29)



<a name="1.0.25"></a>
## [1.0.25](https://github.developer.allianz.io/ilt/ngx-ndbx/compare/v1.0.24...v1.0.25) (2017-12-21)



<a name="1.0.24"></a>
## [1.0.24](https://github.developer.allianz.io/ilt/ngx-ndbx/compare/v1.0.23...v1.0.24) (2017-12-21)



<a name="1.0.23"></a>
## [1.0.23](https://github.developer.allianz.io/ilt/ngx-ndbx/compare/v1.0.22...v1.0.23) (2017-12-21)


### Bug Fixes

* remove unnecessary test ([385c860](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/385c860))
* set radioGroup on radio component in ngAfterContentInit in order to avoid circular dependency ([ae6a9df](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/ae6a9df))
* the markdown interpreter in gitlab doesn't seem to like this syntax (don't know about github though). maybe write it like this? ([0a981b2](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/0a981b2))


### Features

* add required input ([c43565a](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/c43565a))
* basic radio group component ([bc9c9e1](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/bc9c9e1))
* changing a child radio causes the parent group to emit a change event ([80b41af](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/80b41af))
* child radio components inherit disabled state from radio group ([f80d984](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/f80d984))
* child radio names are managed by group ([9e4f932](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/9e4f932))
* formally implement controlValueAccessor interface ([a2ac68d](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/a2ac68d))
* implement essential methods from controlValueAccessor interface ([554c0ba](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/554c0ba))
* NxRadioComponent emits an event on input change ([1f12d5f](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/1f12d5f))
* radio group assigns the same name to all child radios ([b402219](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/b402219))
* radio group sets the initial state of child radios from [ngModel] input ([21b4fa1](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/21b4fa1))
* radio group works within components that use ChangeDetectionStrategy.OnPush ([7a30d17](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/7a30d17))
* radios in the same group can be alternately selected; the state of all radio components in the group is kept consistent ([20bce5c](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/20bce5c))
* stop event propagation on input click ([50269f8](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/50269f8))



<a name="1.0.22"></a>
## [1.0.22](https://github.developer.allianz.io/ilt/ngx-ndbx/compare/v1.0.21...v1.0.22) (2017-12-13)



<a name="1.0.20"></a>
## [1.0.20](https://github.developer.allianz.io/ilt/ngx-ndbx/compare/v1.0.19...v1.0.20) (2017-12-13)


### Bug Fixes

* update API doc according to API refactoring ([7fb703e](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/7fb703e))



<a name="1.0.19"></a>
## [1.0.19](https://github.developer.allianz.io/ilt/ngx-ndbx/compare/v1.0.18...v1.0.19) (2017-12-13)



<a name="1.0.18"></a>
## [1.0.18](https://github.developer.allianz.io/ilt/ngx-ndbx/compare/v1.0.17...v1.0.18) (2017-12-12)


### Bug Fixes

* there is no inline modifier ([5d29eec](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/5d29eec))


### Features

* restrict nx-link selector to a tags ([5a061e5](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/5a061e5))



<a name="1.0.14"></a>
## [1.0.14](https://github.developer.allianz.io/ilt/ngx-ndbx/compare/v1.0.13...v1.0.14) (2017-12-11)


### Bug Fixes

* repair spec ([60e9b03](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/60e9b03))
* rxjs error with 5.5.3 ([b10e8dd](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/b10e8dd))


### Features

* Added AXE for automated accessibility testing ([4e93dec](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/4e93dec))
* basic implementation and documentation for link component ([201ce04](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/201ce04))
* basic radio button functionality in template driven forms ([82f53a9](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/82f53a9))
* Checkbox implementation completed ([cddef06](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/cddef06))
* color update ([893dae6](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/893dae6))
* Implementation of copytext ([b7d17d9](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/b7d17d9))
* link includes the bem block element ([804bcb4](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/804bcb4))
* link supports the modifier "black" ([0e365c5](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/0e365c5))
* link supports the modifier "negative" ([a9603cb](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/a9603cb))
* nx-link can be nested within text ([e91e4c8](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/e91e4c8))
* nx-link supports block modifier ([5ecb7a7](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/5ecb7a7))
* NxRadioComponent implementation (WIP) ([83bd1e1](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/83bd1e1))
* reset text-decoration which was set to "underline" by clarity stylesheet ([df27e5d](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/df27e5d))
* very basic impl of radio button component and demo ([b403da1](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/b403da1))


### Reverts

* cli changes what input ([5787259](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/5787259))



<a name="1.0.12"></a>
## [1.0.12](https://github.developer.allianz.io/ilt/ngx-ndbx/compare/v1.0.11...v1.0.12) (2017-11-30)



<a name="1.0.11"></a>
## [1.0.11](https://github.developer.allianz.io/ilt/ngx-ndbx/compare/v1.0.10...v1.0.11) (2017-11-30)



<a name="1.0.10"></a>
## [1.0.10](https://github.developer.allianz.io/ilt/ngx-ndbx/compare/v1.0.9...v1.0.10) (2017-11-30)



<a name="1.0.9"></a>
## [1.0.9](https://github.developer.allianz.io/ilt/ngx-ndbx/compare/v1.0.8...v1.0.9) (2017-11-30)



<a name="1.0.8"></a>
## [1.0.8](https://github.developer.allianz.io/ilt/ngx-ndbx/compare/v1.0.7...v1.0.8) (2017-11-28)



<a name="1.0.7"></a>
## [1.0.7](https://github.developer.allianz.io/ilt/ngx-ndbx/compare/v1.0.6...v1.0.7) (2017-11-28)



<a name="1.0.6"></a>
## [1.0.6](https://github.developer.allianz.io/ilt/ngx-ndbx/compare/v1.0.5...v1.0.6) (2017-11-28)



<a name="1.0.5"></a>
## [1.0.5](https://github.developer.allianz.io/ilt/ngx-ndbx/compare/v1.0.4...v1.0.5) (2017-11-28)



<a name="1.0.4"></a>
## [1.0.4](https://github.developer.allianz.io/ilt/ngx-ndbx/compare/v1.0.3...v1.0.4) (2017-11-28)



<a name="1.0.3"></a>
## [1.0.3](https://github.developer.allianz.io/ilt/ngx-ndbx/compare/v1.0.2...v1.0.3) (2017-11-27)


### Features

* Add new Icon component with updated styles plus font ([72e0c45](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/72e0c45))



<a name="1.0.2"></a>
## [1.0.2](https://github.developer.allianz.io/ilt/ngx-ndbx/compare/v1.0.1...v1.0.2) (2017-11-27)


### Features

* Typography Demo container added ([fd15414](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/fd15414))



<a name="1.0.1"></a>
## [1.0.1](https://github.developer.allianz.io/ilt/ngx-ndbx/compare/1c9770f...v1.0.1) (2017-11-27)


### Features

* Add real button examples ([1c9770f](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/1c9770f))
* Added Popover component ([5829563](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/5829563))
* Added textfield component ([4f42176](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/4f42176))
* Component Status and Headline Component ([bcdb3ab](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/bcdb3ab))
* Provide  a proof of concept for the checkbox ([23c7f21](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/23c7f21))
* Working Datefield component added ([86b6bfc](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/86b6bfc))
* Working patternlab integration as a local example ([9c7e3cc](https://github.developer.allianz.io/ilt/ngx-ndbx/commit/9c7e3cc))
