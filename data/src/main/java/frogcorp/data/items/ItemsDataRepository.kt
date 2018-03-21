package frogcorp.data.items

import android.util.Log
import frogcorp.data.items.mapper.toArmor
import frogcorp.data.items.mapper.toWeaponRange
import frogcorp.data.items.source.ItemsDataStoreFactory
import frogcorp.domain.items.model.Armor
import frogcorp.domain.items.model.WeaponRange
import frogcorp.domain.items.repository.ItemsRepository
import io.reactivex.Single
import javax.inject.Inject

class ItemsDataRepository @Inject constructor(private val factory: ItemsDataStoreFactory) : ItemsRepository {

    override fun getRangeWeapon(): Single<List<WeaponRange>> {
        return factory.retrieveItemsRemoteDataStore().getRangedWeapons().map {
            it.map {
                it.toWeaponRange()
            }
        }
    }

    override fun getArmors(): Single<List<Armor>> {
        // Needs implement getArmors to get from cache when is already cached.
        return factory.retrieveItemsRemoteDataStore().getArmors().map {
            it.map {
                it.toArmor()
            }
        }
    }

}