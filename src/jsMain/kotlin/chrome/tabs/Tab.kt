@file:JsQualifier("chrome.tabs")

package chrome.tabs

import chrome.extensionTypes.ImageDetails
import chrome.others.JsNumber
import chrome.runtime.Port
import kotlin.js.Promise

external val MAX_CAPTURE_VISIBLE_TAB_CALLS_PER_SECOND: JsNumber
external val TAB_ID_NONE: JsNumber

external interface MutedInfo{
    var extensionId: String?
    var muted: Boolean
    var reason:MutedInfoReason?
}

external interface Tab {
    var active: Boolean
    var audible: Boolean?
    var autoDiscardable: Boolean
    var discarded: Boolean
    var favIconUrl: String?
    var groupId: JsNumber
    var height: JsNumber?
    var highlighted: Boolean
    var id: JsNumber?
    var incognito: Boolean
    var index: JsNumber
    var mutedInfo: MutedInfo?
    var openerTabId: JsNumber?
    var pendingUrl: String?
    var pinned: Boolean
    var sessionId: String?
    var status: TabStatus?
    var title: String?
    var url: String?
    var width: JsNumber?
    var windowId: JsNumber
}

external interface ZoomSettings {
    var defaultZoomFactor: JsNumber?
    var mode: ZoomSettingsMode?
    var scope: ZoomSettingsScope?
}

external fun captureVisibleTab(windowId: JsNumber?, options: ImageDetails?): Promise<String>
external interface ConnectInfoObject {
    var documentId: String?
    var frameId: JsNumber?
    var name: String?
}

external fun connect(tabId: JsNumber, connectInfo: ConnectInfoObject?): Port