# Chrome Extensions API mappings for Kotlin JS

## API Mappings

Conventions: ( ✅ -> Done, 🛠️ -> WIP, ❌ -> Not done)

| Name | Description | Status |
| ---- | ----------- |--------|
| [accessibilityFeatures](https://developer.chrome.com/docs/extensions/reference/accessibilityFeatures/) | - | ✅*     |
| [action](https://developer.chrome.com/docs/extensions/reference/action/) | - | ✅️*    |
| [alarms](https://developer.chrome.com/docs/extensions/reference/alarms/) | - | ✅      |
| [bookmarks](https://developer.chrome.com/docs/extensions/reference/bookmarks/) | - | ✅     |
| [browserAction](https://developer.chrome.com/docs/extensions/reference/browserAction/) | - | 🛠     |
| [browsingData](https://developer.chrome.com/docs/extensions/reference/browsingData/) | - | ❌      |
| [commands](https://developer.chrome.com/docs/extensions/reference/commands/) | - | ❌      |
| [contentSettings](https://developer.chrome.com/docs/extensions/reference/contentSettings/) | - | ❌      |
| [contextMenus](https://developer.chrome.com/docs/extensions/reference/contextMenus/) | - | ❌      |
| [cookies](https://developer.chrome.com/docs/extensions/reference/cookies/) | - | ❌      |
| [debugger](https://developer.chrome.com/docs/extensions/reference/debugger/) | - | ❌      |
| [declarativeContent](https://developer.chrome.com/docs/extensions/reference/declarativeContent/) | - | ❌      |
| [declarativeNetRequest](https://developer.chrome.com/docs/extensions/reference/declarativeNetRequest/) | - | ❌      |
| [desktopCapture](https://developer.chrome.com/docs/extensions/reference/desktopCapture/) | - | ❌      |
| [devtools.inspectedWindow](https://developer.chrome.com/docs/extensions/reference/devtools_inspectedWindow/) | - | ❌      |
| [devtools.network](https://developer.chrome.com/docs/extensions/reference/devtools_network/) | - | ❌      |
| [devtools.panels](https://developer.chrome.com/docs/extensions/reference/devtools_panels/) | - | ❌      |
| [devtools.recorder](https://developer.chrome.com/docs/extensions/reference/devtools_recorder/) | - | ❌      |
| [dom](https://developer.chrome.com/docs/extensions/reference/dom/) | - | ❌      |
| [downloads](https://developer.chrome.com/docs/extensions/reference/downloads/) | - | ❌      |
| [enterprise.hardwarePlatform](https://developer.chrome.com/docs/extensions/reference/enterprise_hardwarePlatform/) | - | ❌      |
| [enterprise.platformKeys](https://developer.chrome.com/docs/extensions/reference/enterprise_platformKeys/) | - | ❌      |
| [events](https://developer.chrome.com/docs/extensions/reference/events/) | - | 🛠️    |
| [extension](https://developer.chrome.com/docs/extensions/reference/extension/) | - | ❌      |
| [extensionTypes](https://developer.chrome.com/docs/extensions/reference/extensionTypes/) | - | 🛠     |
| [fontSettings](https://developer.chrome.com/docs/extensions/reference/fontSettings/) | - | ❌      |
| [gcm](https://developer.chrome.com/docs/extensions/reference/gcm/) | - | ❌      |
| [history](https://developer.chrome.com/docs/extensions/reference/history/) | - | ❌      |
| [i18n](https://developer.chrome.com/docs/extensions/reference/i18n/) | - | ❌      |
| [identity](https://developer.chrome.com/docs/extensions/reference/identity/) | - | ❌      |
| [idle](https://developer.chrome.com/docs/extensions/reference/idle/) | - | ❌      |
| [input.ime](https://developer.chrome.com/docs/extensions/reference/input_ime/) | - | ❌      |
| [instanceID](https://developer.chrome.com/docs/extensions/reference/instanceID/) | - | ❌      |
| [management](https://developer.chrome.com/docs/extensions/reference/management/) | - | ❌      |
| [notifications](https://developer.chrome.com/docs/extensions/reference/notifications/) | - | ❌      |
| [offscreen](https://developer.chrome.com/docs/extensions/reference/offscreen/) | - | ❌      |
| [omnibox](https://developer.chrome.com/docs/extensions/reference/omnibox/) | - | ❌      |
| [pageAction](https://developer.chrome.com/docs/extensions/reference/pageAction/) | - | ❌      |
| [pageCapture](https://developer.chrome.com/docs/extensions/reference/pageCapture/) | - | ❌      |
| [permissions](https://developer.chrome.com/docs/extensions/reference/permissions/) | - | ❌      |
| [power](https://developer.chrome.com/docs/extensions/reference/power/) | - | ❌      |
| [printerProvider](https://developer.chrome.com/docs/extensions/reference/printerProvider/) | - | ❌      |
| [privacy](https://developer.chrome.com/docs/extensions/reference/privacy/) | - | ❌      |
| [proxy](https://developer.chrome.com/docs/extensions/reference/proxy/) | - | ❌      |
| [runtime](https://developer.chrome.com/docs/extensions/reference/runtime/) | - | 🛠     |
| [scripting](https://developer.chrome.com/docs/extensions/reference/scripting/) | - | ❌      |
| [search](https://developer.chrome.com/docs/extensions/reference/search/) | - | ❌      |
| [sessions](https://developer.chrome.com/docs/extensions/reference/sessions/) | - | ❌      |
| [sidePanel](https://developer.chrome.com/docs/extensions/reference/sidePanel/) | - | ❌      |
| [storage](https://developer.chrome.com/docs/extensions/reference/storage/) | - | ❌      |
| [system.cpu](https://developer.chrome.com/docs/extensions/reference/system_cpu/) | - | ❌      |
| [system.display](https://developer.chrome.com/docs/extensions/reference/system_display/) | - | ❌      |
| [system.memory](https://developer.chrome.com/docs/extensions/reference/system_memory/) | - | ❌      |
| [system.storage](https://developer.chrome.com/docs/extensions/reference/system_storage/) | - | ❌      |
| [tabCapture](https://developer.chrome.com/docs/extensions/reference/tabCapture/) | - | ❌      |
| [tabGroups](https://developer.chrome.com/docs/extensions/reference/tabGroups/) | - | ❌      |
| [tabs](https://developer.chrome.com/docs/extensions/reference/tabs/) | - | 🛠     |
| [topSites](https://developer.chrome.com/docs/extensions/reference/topSites/) | - | ❌      |
| [tts](https://developer.chrome.com/docs/extensions/reference/tts/) | - | ❌      |
| [ttsEngine](https://developer.chrome.com/docs/extensions/reference/ttsEngine/) | - | ❌      |
| [types](https://developer.chrome.com/docs/extensions/reference/types/) | - | ✅️*    |
| [webAuthenticationProxy](https://developer.chrome.com/docs/extensions/reference/webAuthenticationProxy/) | - | ❌      |
| [webNavigation](https://developer.chrome.com/docs/extensions/reference/webNavigation/) | - | ❌      |
| [webRequest](https://developer.chrome.com/docs/extensions/reference/webRequest/) | - | ❌      |
| [windows](https://developer.chrome.com/docs/extensions/reference/windows/) | - | ❌      |


## Chrome Extensions Documentation

- https://developer.chrome.com/docs/extensions/

## API Reference

- https://developer.chrome.com/docs/extensions/reference/

## Calling JavaScript from Kotlin

- https://kotlinlang.org/docs/reference/js-interop.html

## Kotlin Dynamic type

- https://kotlinlang.org/docs/reference/dynamic-type.html

## Kotlin Frontend Gradle plugin

- https://github.com/Kotlin/kotlin-frontend-plugin
