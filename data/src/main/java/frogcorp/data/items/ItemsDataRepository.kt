package frogcorp.data.items

import frogcorp.data.items.mapper.toArmor
import frogcorp.data.items.source.ItemsDataStoreFactory
import frogcorp.domain.items.model.Armor
import frogcorp.domain.items.repository.ItemsRepository
import io.reactivex.Single
import javax.inject.Inject

class ItemsDataRepository @Inject constructor(private val factory: ItemsDataStoreFactory) : ItemsRepository {

    override fun getArmors(): Single<List<Armor>> {
        return factory.retrieveItemsApiDataStore().getArmors().map {
            it.map {
                it.toArmor()
            }
        }
    }

}