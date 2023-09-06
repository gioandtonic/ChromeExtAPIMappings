@file:JsQualifier("chrome.browserAction")

package chrome.browserAction

import chrome.events.Event
import chrome.others.Callback
import chrome.others.JsNumber
import chrome.others.dualvalues.ImageDataValue
import chrome.others.dualvalues.PathValue
import chrome.tabs.Tab
import org.w3c.dom.ImageData
import kotlin.js.Promise

external class ColorArray(jsArray: Array<JsNumber>) {
    val r: JsNumber
    val g: JsNumber
    val b: JsNumber
    val a: JsNumber
}

external class ImageDataType : ImageData

external interface TabDetails {
    var tabId: JsNumber?
}

external interface BackgroundColorDetails {
    var color: ColorArray
    var tabId: JsNumber?
}

external interface BadgeTextDetails {
    var tabId: JsNumber?
    var text: String?
}

external interface IconDetails {
    var imageData: ImageDataValue?
    var path: PathValue?
    var tabId: JsNumber?
}

external interface PopupDetails {
    var popup: String
    var tabId: JsNumber?
}

external interface TitleDetails {
    var tabId: JsNumber?
    var title: String
}

external fun disable(tabId: JsNumber?): Promise<Unit>
external fun enable(tabId: JsNumber?): Promise<Unit>

external fun getBadgeBackgroundColor(details: TabDetails): Promise<ColorArray>

external fun getBadgeText(details: TabDetails): Promise<String>

external fun getPopup(details: TabDetails): Promise<String>
external fun getTitle(details: TabDetails): Promise<String>

external fun setBadgeBackgroundColor(details: BackgroundColorDetails): Promise<Unit>

external fun setBadgeText(details: BadgeTextDetails): Promise<Unit>

external fun setIcon(details: IconDetails): Promise<Unit>

external fun setPopup(details: PopupDetails): Promise<Unit>

external fun setTitle(details: TitleDetails): Promise<Unit>

/**
 *  https://developer.chrome.com/docs/extensions/reference/browserAction/#event-onClicked
 *
 *  Should use onClicked.addListener(Callback<tabs.Tab>)
 */
external var onClicked: Event<Tab>


