@file:JsQualifier("chrome.bookmarks")

package chrome.bookmarks

import chrome.alarms.Alarm
import chrome.events.Event
import chrome.others.Callback
import chrome.others.JsNumber
import chrome.others.dualvalues.SearchStringOrObject
import chrome.others.dualvalues.SingleOrList
import kotlin.js.Promise

external interface BookmarkTreeNode {
    var children: BookmarkTreeNode?
    var dateAdded: JsNumber?
    var dateGroupModified: JsNumber?
    var dateLastUsed: JsNumber?
    var id: String
    var index: JsNumber?
    var parentId: String?
    var title: String
    var unmodifiable: String?
    var url: String?
}

external val BookmarkTreeNodeUnmodifiable: String = definedExternally

external interface CreateDetails {
    var index: JsNumber?
    var parentId: String?
    var title: String?
    var url: String?
}

external interface DestinationDetails {
    var index: JsNumber?
    var parentId: String?
}

external interface UpdateDetails {
    var title: String?
    var url: String?
}

external interface ChangeInfo {
    var title: String
    var url: String?
}

external interface ReorderInfo {
    var childIds: List<String>
}

external interface MoveInfo {
    var index: JsNumber
    var oldIndex: JsNumber
    var oldParentId: String
    var parentId: String
}

external interface RemoveInfo {
    var index: JsNumber
    var node: BookmarkTreeNode
    var parentId: String
}

external fun create(bookmark: CreateDetails): Promise<BookmarkTreeNode>

@JsName("get")
external fun getBookmark(idOrIdList: SingleOrList<String>): Promise<List<BookmarkTreeNode>>
external fun getChildren(id: String): Promise<List<BookmarkTreeNode>>
external fun getRecent(numberOfItems: JsNumber): Promise<List<BookmarkTreeNode>>
external fun getSubTree(id: String): Promise<List<BookmarkTreeNode>>
external fun getTree(): Promise<List<BookmarkTreeNode>>
external fun move(id: String, destination: DestinationDetails): Promise<BookmarkTreeNode>
external fun remove(id: String): Promise<Unit>
external fun removeTree(id: String): Promise<Unit>
external fun search(query: SearchStringOrObject): Promise<List<BookmarkTreeNode>>
external fun update(id: String, changes: UpdateDetails): Promise<BookmarkTreeNode>

/**
 *  https://developer.chrome.com/docs/extensions/reference/bookmarks/#event-onChanged
 *
 *  Should use onClicked.addListener(BookmarkChangeCallback)
 */
external var onChanged: Event<Unit>

/**
 *  https://developer.chrome.com/docs/extensions/reference/bookmarks/#event-onChildrenReordered
 *
 *  Should use onClicked.addListener(BookmarkChildrenReorderedCallback)
 */
external var onChildrenReordered: Event<Unit>

/**
 *  https://developer.chrome.com/docs/extensions/reference/bookmarks/#event-onCreated
 *
 *  Should use onClicked.addListener(BookmarkCreatedCallback)
 */
external var onCreated: Event<Unit>

/**
 *  https://developer.chrome.com/docs/extensions/reference/bookmarks/#event-onCreated
 *
 *  Should use onClicked.addListener(VoidCallback)
 */
external var onImportBegan: Event<Unit>

/**
 *  https://developer.chrome.com/docs/extensions/reference/bookmarks/#event-onImportEnded
 *
 *  Should use onClicked.addListener(VoidCallback)
 */
external var onImportEnded: Event<Unit>

/**
 *  https://developer.chrome.com/docs/extensions/reference/bookmarks/#event-onMoved
 *
 *  Should use onClicked.addListener(BookmarkMovedCallback)
 */
external var onMoved: Event<Unit>

/**
 *  https://developer.chrome.com/docs/extensions/reference/bookmarks/#event-onRemoved
 *
 *  Should use onClicked.addListener(BookmarkRemovedCallback)
 */
external var onRemoved: Event<Unit>
