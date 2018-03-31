package frogcorp.data.items

import android.util.Log
import frogcorp.data.items.mapper.toArmor
import frogcorp.data.items.mapper.toWeaponRange
import frogcorp.data.items.model.ArmorEntity
import frogcorp.data.items.repository.ItemsCache
import frogcorp.data.items.repository.ItemsDataStore
import frogcorp.data.items.source.ItemsCacheDataStore
import frogcorp.data.items.source.ItemsDataStoreFactory
import frogcorp.data.items.source.ItemsRemoteDataStore
import frogcorp.domain.items.model.Armor
import frogcorp.domain.items.model.WeaponRange
import frogcorp.domain.items.repository.ItemsRepository
import io.reactivex.Completable
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
        val dataStore = factory.retrieveDataStore()

        return dataStore.getArmors()
                .flatMap {
                    if (dataStore is ItemsRemoteDataStore) {
                        saveArmorsEntities(it).toSingle { it.map { it.toArmor() } }
                    } else {
                        Single.just(it.map { it.toArmor() })
                    }
                }
    }

    private fun saveArmorsEntities(armors: List<ArmorEntity>) : Completable {
        return factory.retrieveItemsCacheDataStore().saveArmors(armors)
    }
}