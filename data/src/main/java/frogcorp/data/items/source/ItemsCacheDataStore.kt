package frogcorp.data.items.source

import frogcorp.data.items.model.ArmorEntity
import frogcorp.data.items.repository.ItemsCache
import frogcorp.data.items.repository.ItemsDataStore
import io.reactivex.Completable
import io.reactivex.Single
import javax.inject.Inject

class ItemsCacheDataStore @Inject constructor(private val itemsCache: ItemsCache) : ItemsDataStore {

    override fun clearArmors(): Completable {
        return itemsCache.clearArmors()
    }

    override fun saveArmors(armors: List<ArmorEntity>): Completable  {
        return itemsCache.saveArmors(armors).doOnComplete { /* Need code when save */ }
    }

    override fun getArmors(): Single<List<ArmorEntity>> = itemsCache.getArmors()

}