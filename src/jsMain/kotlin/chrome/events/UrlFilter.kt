package chrome.events

import chrome.others.JsNumber

external interface UrlFilter {
    val hostContains: String?
    val hostEquals: String?
    val hostPrefix: String?
    val hostSuffix: String?
    val originAndPathMatches: String?
    val pathContains: String?
    val pathEquals: String?
    val pathPrefix: String?
    val pathSuffix: String?
    val ports: Ports?
    val queryContains: String?
    val queryEquals: String?
    val queryPrefix: String?
    val querySuffix: String?
    val schemes: List<String>?
    val urlContains: String?
    val urlEquals: String?
    val urlMatches: String?
    val urlPrefix: String?
    val urlSuffix: String?
}

sealed class PortElement {
    class Single(val value: JsNumber) : PortElement()
    class Multiple(val values: Array<JsNumber>) : PortElement() {
        override fun equals(other: Any?): Boolean {
            if (this === other) return true
            if (other == null || this::class.js != other::class.js) return false

            other as Multiple

            return values.contentEquals(other.values)
        }

        override fun hashCode(): Int {
            return values.contentHashCode()
        }
    }
}

typealias Ports = Array<PortElement>