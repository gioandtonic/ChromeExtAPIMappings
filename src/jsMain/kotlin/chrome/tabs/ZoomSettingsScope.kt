package chrome.tabs

sealed class ZoomSettingsScope(val value: String) {
    object PerOrigin : ZoomSettingsScope("per-origin")
    object PerTab : ZoomSettingsScope("per-tab")
}
