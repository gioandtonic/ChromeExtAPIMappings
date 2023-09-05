package chrome.others

import kotlinx.coroutines.*
import org.w3c.dom.events.Event
import org.w3c.dom.events.EventTarget
import kotlin.coroutines.*
import kotlin.js.Promise

fun <T> promiseAsync(block: suspend () -> T) = Promise { resolve, reject ->
    block.startCoroutine(completion = object : Continuation<T> {
        override val context: CoroutineContext = EmptyCoroutineContext
        override fun resumeWith(result: Result<T>) {
            when (result.isSuccess) {
                true -> {
                    resolve(result.getOrElse {
                        reject(Exception("Failed getting Result"))
                    })
                }

                false -> {
                    reject(Exception("Failed getting Result"))
                }
            }
        }
    })
}

suspend fun <T> Promise<T>.await(): T = suspendCoroutine {
    then(it::resume).catch(it::resumeWithException)
}

inline fun EventTarget.onEvent(type: String, noinline listener: (Event) -> Unit) =
    addEventListener(type, listener)

@OptIn(DelicateCoroutinesApi::class)
inline fun EventTarget.onEventAsync(type: String, noinline listener: suspend (Event) -> Unit) =
    onEvent(type = type, listener = { event: Event -> GlobalScope.launch { listener(event) } })

inline fun EventTarget.onChangeEvent(noinline listener: (Event) -> Unit) =
    onEvent("change", listener)

inline fun EventTarget.onContentLoadedEventAsync(noinline listener: suspend (Event) -> Unit) =
    onEventAsync("DOMContentLoaded", listener)