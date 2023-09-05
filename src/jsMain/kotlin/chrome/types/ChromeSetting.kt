package chrome.types

import chrome.events.Event
import chrome.others.Callback

external interface ChromeSetting<T> {
    fun get(details: dynamic, callback: Callback<T>)
    fun set(details: dynamic, callback: Callback<Unit>)
    fun clear(details: dynamic, callback: Callback<Unit>)

    /**
     *  https://developer.chrome.com/docs/extensions/reference/types/#ChromeSetting
     *
     *  Should use onChange.addListener(ChromeSettingDetails<T>)
     */
    var onChange: Event<T>
}

external interface ChromeSettingDetails<T> {
    var incognitoSpecific: Boolean?
    var levelOfControl: LevelOfControl
    var value: T
}
