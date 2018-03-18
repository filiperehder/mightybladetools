package frogcorp.data.items.source

import frogcorp.data.items.model.ArmorEntity
import frogcorp.data.items.repository.ItemsApi
import frogcorp.data.items.repository.ItemsDataStore
import io.reactivex.Single
import javax.inject.Inject

class ItemsApiDataStore @Inject constructor(private val api: ItemsApi) : ItemsDataStore {

    override fun getArmors(): Single<ArmorEntity> = api.getArmors()
}