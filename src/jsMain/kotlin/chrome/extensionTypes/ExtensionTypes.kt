@file:JsQualifier("chrome.extensionTypes")

package chrome.extensionTypes

import chrome.others.JsNumber

external interface ImageDetails{
    var format: ImageFormat?
    var quality: JsNumber?
}