@file:JsQualifier("chrome.runtime")

package chrome.runtime

import chrome.events.Event
import chrome.others.Callback
import chrome.others.JsNumber
import chrome.others.MessageCallback
import chrome.tabs.Tab

external interface Port{
    var name: String
    /**
     * https://developer.chrome.com/docs/extensions/reference/runtime/#type-Port
     *
     *  Should use onDisconnect.addListener()
     */
    var onDisconnect: Event<Callback<Port>>

    var onMessage: Event<MessageCallback>

    var sender: MessageSender?
}

external interface MessageSender{
    var documentId: String?
    var documentLifecycle: String?
    var frameId: JsNumber?
    var id: String?
    var nativeApplication: String?
    var origin: String?
    var tab: Tab?
    var tlsChannelId: String?
    var url: String?
}