@file:JsQualifier("chrome.action")

package chrome.action

import chrome.browserAction.ColorArray
import chrome.others.dualvalues.ImageDataValue
import chrome.browserAction.TabDetails
import chrome.events.Event
import chrome.others.JsNumber
import chrome.others.dualvalues.ColorValue
import chrome.others.dualvalues.PathValue
import chrome.tabs.Tab
import kotlin.js.Promise

external interface OpenPopupOptions {
    var windowId: JsNumber?
}

external interface BadgeColorOptions {
    var color: ColorValue
    var tabId: JsNumber?
}

external interface BadgeTextDetails {
    var tabId: JsNumber?
    var text: String?
}

external interface PopupDetails {
    var popup: String
    var tabId: JsNumber?
}

external interface TitleDetails {
    var tabId: JsNumber?
    var title: String
}

external interface IconDetails {
    var imageData: ImageDataValue?
    var path: PathValue?
    var tabId: JsNumber?
}

external interface TabDetails {
    var tabId: JsNumber?
}

external interface UserSettings {
    var isOnToolbar: Boolean?
}

external fun disable(tabId: JsNumber?): Promise<Unit>
external fun enable(tabId: JsNumber?): Promise<Unit>
external fun getBadgeBackgroundColor(details: TabDetails): Promise<ColorArray>
external fun getBadgeText(details: TabDetails): Promise<String>
external fun getBadgeTextColor(details: TabDetails): Promise<ColorArray>
external fun getPopup(details: TabDetails): Promise<String>
external fun getTitle(details: TabDetails): Promise<String>
external fun getUserSettings(): Promise<UserSettings>
external fun isEnabled(tabId: JsNumber?): Promise<Boolean>
external fun openPopup(options: OpenPopupOptions?): Promise<Unit>
external fun setBadgeBackgroundColor(details: BadgeColorOptions): Promise<Unit>
external fun setBadgeText(details: BadgeTextDetails): Promise<Unit>
external fun setBadgeTextColor(details: BadgeColorOptions): Promise<Unit>
external fun setIcon(details: IconDetails): Promise<Unit>
external fun setPopup(details: PopupDetails): Promise<Unit>
external fun setTitle(details: TitleDetails): Promise<Unit>

/**
 *  https://developer.chrome.com/docs/extensions/reference/action/#event-onClicked
 *
 *  Should use onClicked.addListener(Callback<tabs.Tab>)
 */
external var onClicked: Event<Tab>


