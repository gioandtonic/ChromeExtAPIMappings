package chrome.others

import chrome.bookmarks.*
import chrome.runtime.Port
import chrome.tabs.Tab

typealias Callback<T> = (input: T) -> Unit
typealias VoidCallback = () -> Unit
typealias MessageCallback = (message: String, port: Port) -> Unit
typealias BookmarkChangeCallback = (id: String, changeInfo: ChangeInfo) -> Unit
typealias BookmarkChildrenReorderedCallback = (id: String, reorderInfo: ReorderInfo) -> Unit
typealias BookmarkCreatedCallback = (id: String, bookmark: BookmarkTreeNode) -> Unit
typealias BookmarkMovedCallback = (id: String, moveInfo: MoveInfo) -> Unit
typealias BookmarkRemovedCallback = (id: String, removeInfo: RemoveInfo) -> Unit
typealias CommandCallback = (command: String, tab: Tab) -> Unit
typealias JsNumber = Double

