package frogcorp.data.items.source

import frogcorp.data.items.repository.ItemsDataStore
import javax.inject.Inject

class ItemsDataStoreFactory @Inject constructor(private val itemsApiDataStore: ItemsApiDataStore) {

    fun retrieveItemsApiDataStore()  : ItemsDataStore = itemsApiDataStore
}