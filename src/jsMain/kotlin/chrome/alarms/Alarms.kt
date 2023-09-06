@file:JsQualifier("chrome.alarms")

package chrome.alarms

import chrome.events.Event
import chrome.others.JsNumber
import chrome.tabs.Tab
import kotlin.js.Promise

external interface Alarm {
    var name: String
    var periodInMinutes: JsNumber?
    var scheduledTime: JsNumber
}

external interface AlarmCreateInfo {
    var delayInMinutes: JsNumber?
    var periodInMinutes: JsNumber?

    @JsName("when")
    var whenJS: JsNumber?
}

external fun clear(name: String?): Promise<Boolean>
external fun clearAll(): Promise<Boolean>
external fun create(name: String?, alarmInfo: AlarmCreateInfo): Promise<Unit>

@JsName("get")
external fun getAlarm(name: String?): Promise<Alarm?>
@JsName("getAll")
external fun getAllAlarms(): Promise<List<Alarm>>

/**
 *  https://developer.chrome.com/docs/extensions/reference/alarms/#event-onAlarm
 *
 *  Should use onClicked.addListener(Callback<Alarm>)
 */
external var onAlarm: Event<Alarm>