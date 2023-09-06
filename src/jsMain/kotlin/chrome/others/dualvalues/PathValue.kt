package chrome.others.dualvalues

sealed class PathValue {
    data class Single(val path: String) : PathValue()
    data class Dictionary(val path: Map<Int, String>) : PathValue()
}