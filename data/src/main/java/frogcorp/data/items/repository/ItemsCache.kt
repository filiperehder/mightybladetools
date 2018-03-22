package frogcorp.data.items.repository

import frogcorp.data.items.model.ArmorEntity
import io.reactivex.Completable
import io.reactivex.Single

interface ItemsCache {
    fun clearArmors(): Completable
    fun saveArmors(armors: List<ArmorEntity>): Completable
    fun getArmors() : Single<List<ArmorEntity>>
    fun isCached() : Boolean
    fun isExpired() : Boolean
}