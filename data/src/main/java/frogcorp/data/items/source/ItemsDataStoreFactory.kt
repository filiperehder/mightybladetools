package frogcorp.data.items.source

import frogcorp.data.items.repository.ItemsCache
import frogcorp.data.items.repository.ItemsDataStore
import javax.inject.Inject

class ItemsDataStoreFactory @Inject constructor(
        private val itemsCache: ItemsCache,
        private val itemsRemoteDataStore: ItemsRemoteDataStore,
        private val itemsCacheDataStore: ItemsCacheDataStore) {

    fun retrieveItemsRemoteDataStore()  : ItemsDataStore = itemsRemoteDataStore

    fun retrieveItemsCacheDataStore() : ItemsDataStore = itemsCacheDataStore

    fun retrieveDataStore() : ItemsDataStore {
        return if(itemsCache.isCached() && !itemsCache.isExpired()) {
            retrieveItemsCacheDataStore()
        }
        else {
            retrieveItemsRemoteDataStore()
        }
    }
}