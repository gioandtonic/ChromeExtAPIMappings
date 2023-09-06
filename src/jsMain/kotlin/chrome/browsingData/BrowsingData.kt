@file:JsQualifier("chrome.browsingData")

package chrome.browsingData

import chrome.others.JsNumber
import kotlin.js.Promise

external interface DataTypeSet {
    var appcache: Boolean?
    var cache: Boolean?
    var cacheStorage: Boolean?
    var cookies: Boolean?
    var downloads: Boolean?
    var fileSystems: Boolean?
    var formData: Boolean?
    var history: Boolean?
    var indexedDB: Boolean?
    var localStorage: Boolean?
    var passwords: Boolean?
    var serviceWorkers: Boolean?
    var webSQL: Boolean?
}

external interface OriginTypesOptions {
    var extension: Boolean?
    var protectedWeb: Boolean?
    var unprotectedWeb: Boolean?
}

external interface RemovalOptions {
    var excludeOrigins: List<String>?
    var originTypes: OriginTypesOptions?
    var origins: List<String>?
    var since: JsNumber?
}

external interface SettingsOptions {
    var dataRemovalPermitted: DataTypeSet
    var dataToRemove: DataTypeSet
    var options: RemovalOptions
}

external fun remove(options: RemovalOptions, dataToRemove: DataTypeSet): Promise<Unit>
external fun removeAppcache(options: RemovalOptions): Promise<Unit>
external fun removeCache(options: RemovalOptions): Promise<Unit>
external fun removeCacheStorage(options: RemovalOptions): Promise<Unit>
external fun removeCookies(options: RemovalOptions): Promise<Unit>
external fun removeDownloads(options: RemovalOptions): Promise<Unit>
external fun removeFileSystems(options: RemovalOptions): Promise<Unit>
external fun removeFormData(options: RemovalOptions): Promise<Unit>
external fun removeHistory(options: RemovalOptions): Promise<Unit>
external fun removeIndexedDB(options: RemovalOptions): Promise<Unit>
external fun removeLocalStorage(options: RemovalOptions): Promise<Unit>
external fun removePasswords(options: RemovalOptions): Promise<Unit>
external fun removeServiceWorkers(options: RemovalOptions): Promise<Unit>
external fun removeWebSQL(options: RemovalOptions): Promise<Unit>
external fun settings(): Promise<SettingsOptions>