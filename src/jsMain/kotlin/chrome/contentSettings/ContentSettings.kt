@file:JsQualifier("chrome.contentSettings")

package chrome.contentSettings

import kotlin.js.Promise

external interface ContentSettingClearDetails {
    var scope: Scope?
}

external interface ContentSettingGetDetails {
    var incognito: Boolean?
    var primaryUrl: String
    var resourceIdentifier: ResourceIdentifier?
    var secondaryUrl: String?
}

external interface ContentSettingsSetDetails<T> {
    var primaryPattern: String
    var resourceIdentifier: ResourceIdentifier?
    var scope: Scope?
    var secondaryPattern: String?
    var setting: T
}

external interface ContentSettingsDetails {
    var setting: IContentSetting
}

// AutoVerifyContentSetting is defined in ContentSettingsEnums.kt

// CameraContentSetting is defined in ContentSettingsEnums.kt

external interface ContentSetting<IContentSetting> {
    fun clear(details: ContentSettingClearDetails): Promise<Unit>

    @JsName("get")
    fun getContentSetting(details: ContentSettingGetDetails): Promise<ContentSettingsDetails>
    fun getResourceIdentifiers(): Promise<List<ResourceIdentifier>>

    @JsName("set")
    fun setContentSetting(details: ContentSettingsSetDetails<IContentSetting>): Promise<Unit>
}

// CookiesContentSetting is defined in ContentSettingsEnums.kt
// FullscreenContentSetting is defined in ContentSettingsEnums.kt
// ImagesContentSetting is defined in ContentSettingsEnums.kt
// JavascriptContentSetting is defined in ContentSettingsEnums.kt
// LocationContentSetting is defined in ContentSettingsEnums.kt
// MicrophoneContentSetting is defined in ContentSettingsEnums.kt
// MouselockContentSetting is defined in ContentSettingsEnums.kt
// MultipleAutomaticDownloadsContentSetting is defined in ContentSettingsEnums.kt
// NotificationsContentSetting is defined in ContentSettingsEnums.kt
// PluginsContentSetting is defined in ContentSettingsEnums.kt
// PopupsContentSetting is defined in ContentSettingsEnums.kt
// PpapiBrokerContentSetting is defined in ContentSettingsEnums.kt

external interface ResourceIdentifier {
    var description: String?
    var id: String
}

// Scope is defined in ContentSettingsEnums.kt

external var automaticDownloads: ContentSetting<MultipleAutomaticDownloadsContentSetting>
external var autoVerify: ContentSetting<AutoVerifyContentSetting>
external var camera: ContentSetting<CameraContentSetting>
external var cookies: ContentSetting<CookiesContentSetting>
external var fullscreen: ContentSetting<FullscreenContentSetting>
external var images: ContentSetting<ImagesContentSetting>
external var javascript: ContentSetting<JavascriptContentSetting>
external var location: ContentSetting<LocationContentSetting>
external var microphone: ContentSetting<MicrophoneContentSetting>
external var mouselock: ContentSetting<MouselockContentSetting>
external var notifications: ContentSetting<NotificationsContentSetting>
@Deprecated("Deprecated")
external var plugins: ContentSetting<PluginsContentSetting>
external var popups: ContentSetting<PopupsContentSetting>
external var unsandboxedPlugins: ContentSetting<PpapiBrokerContentSetting>