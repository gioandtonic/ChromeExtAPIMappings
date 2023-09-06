package chrome.others.dualvalues

sealed class SearchStringOrObject {
    data class SearchString(val query: String) : SearchStringOrObject()
    class SearchObject(val query: String?, val title: String?, val url: String?) : SearchStringOrObject()
}