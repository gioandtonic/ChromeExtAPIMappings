@file:Suppress("UNCHECKED_CAST_TO_EXTERNAL_INTERFACE")

package chrome.events

external interface Rule {
    var id: String?
    var priority: Int
    var tags: List<String>?
    var actions: List<Any>
    var conditions: List<Any>
}

@Suppress("UNCHECKED_CAST_TO_NATIVE_INTERFACE")
inline fun Rule(block: Rule.() -> Unit) =
    (js("{}") as Rule).apply(block)