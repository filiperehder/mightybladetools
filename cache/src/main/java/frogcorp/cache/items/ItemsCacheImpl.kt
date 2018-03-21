package frogcorp.cache.items

import frogcorp.cache.items.dao.ArmorDao
import frogcorp.cache.items.mapper.toArmorsCache
import frogcorp.cache.items.mapper.toArmorsEntity
import frogcorp.data.items.model.ArmorEntity
import frogcorp.data.items.repository.ItemsCache
import io.reactivex.Observable
import io.reactivex.Single
import javax.inject.Inject

class ItemsCacheImpl @Inject constructor(private val armorDao: ArmorDao) : ItemsCache {

    override fun clearArmors(): Observable<Boolean> {
        return Observable.just(true)
    }

    override fun saveArmors(armors: List<ArmorEntity>): Observable<Boolean> {
        armorDao.insertAll(armors.map { it.toArmorsCache() })
        return Observable.just(true)
    }

    override fun getArmors(): Single<List<ArmorEntity>> {
        return Single.fromCallable({ armorDao.loadAll().map { it.toArmorsEntity() } })
    }
}