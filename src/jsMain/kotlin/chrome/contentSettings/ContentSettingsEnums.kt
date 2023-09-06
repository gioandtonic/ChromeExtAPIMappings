package chrome.contentSettings

enum class AutoVerifyContentSetting : IContentSetting {
    allow,
    block
}

enum class CameraContentSetting : IContentSetting {
    allow,
    block,
    ask
}

enum class CookiesContentSetting : IContentSetting {
    allow,
    block,
    session_only
}

enum class FullscreenContentSetting : IContentSetting {
    allow
}

enum class ImagesContentSetting : IContentSetting {
    allow,
    block
}

enum class JavascriptContentSetting : IContentSetting {
    allow,
    block
}

enum class LocationContentSetting : IContentSetting {
    allow,
    block,
    ask
}

enum class MicrophoneContentSetting : IContentSetting {
    allow,
    block,
    ask
}

enum class MouselockContentSetting : IContentSetting {
    allow
}

enum class MultipleAutomaticDownloadsContentSetting : IContentSetting {
    allow,
    block,
    ask
}

enum class NotificationsContentSetting : IContentSetting {
    allow,
    block,
    ask
}

@Deprecated("Deprecated")
enum class PluginsContentSetting : IContentSetting {
    block
}

enum class PopupsContentSetting : IContentSetting {
    allow,
    block
}

enum class PpapiBrokerContentSetting : IContentSetting {
    block
}

enum class Scope : IContentSetting {
    regular,
    incognito_session_only
}