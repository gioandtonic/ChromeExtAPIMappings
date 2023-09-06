package chrome.others.dualvalues

sealed class ValueOrValueList<T> {
    data class Single<T>(val value: T) : ValueOrValueList<T>()
    data class List<T>(val values: Array<ValueOrValueList<T>>) : ValueOrValueList<T>() {
        override fun equals(other: Any?): Boolean {
            if (this === other) return true
            if (other == null || this::class.js != other::class.js) return false

            other as List<*>

            return values.contentEquals(other.values)
        }

        override fun hashCode(): Int {
            return values.contentHashCode()
        }
    }
}

sealed class SingleOrList<T> {
    data class Single<T>(val id: T) : SingleOrList<T>()
    data class List<T>(val ids: Array<T>) : SingleOrList<T>() {
        override fun equals(other: Any?): Boolean {
            if (this === other) return true
            if (other == null || this::class.js != other::class.js) return false

            other as List<*>

            return ids.contentEquals(other.ids)
        }

        override fun hashCode(): Int {
            return ids.contentHashCode()
        }
    }
}