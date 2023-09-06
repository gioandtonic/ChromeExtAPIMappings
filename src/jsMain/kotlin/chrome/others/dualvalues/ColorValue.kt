package chrome.others.dualvalues

sealed class ColorValue {
    data class HexValue(val color: String) : ColorValue()
    data class ColorArray(val color: chrome.browserAction.ColorArray) : ColorValue()
}