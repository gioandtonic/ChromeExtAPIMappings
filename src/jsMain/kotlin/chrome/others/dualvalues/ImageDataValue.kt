package chrome.others.dualvalues

import org.w3c.dom.ImageData

sealed class ImageDataValue {
    data class Single(val data: ImageData) : ImageDataValue()
    data class Dictionary(val map: Map<Int, ImageData>) : ImageDataValue()
}