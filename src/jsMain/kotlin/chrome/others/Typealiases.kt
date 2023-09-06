package chrome.others

import chrome.runtime.Port

typealias Callback<T> = (input: T) -> Unit
typealias VoidCallback = () -> Unit
typealias MessageCallback = (message: dynamic, port: Port) -> Unit
typealias JsNumber = Double

