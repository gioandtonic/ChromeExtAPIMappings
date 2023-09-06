@file:JsQualifier("chrome.commands")

package chrome.commands

import chrome.events.Event
import kotlin.js.Promise

external interface Command {
    var description: String?
    var name: String?
    var shortcut: String?
}

@JsName("getAll")
external fun getAllCommands(): Promise<List<Command>>

/**
 *  https://developer.chrome.com/docs/extensions/reference/commands/#event-onCommand
 *
 *  Should use onClicked.addListener(CommandCallback)
 */
external var onCommand: Event<Unit>