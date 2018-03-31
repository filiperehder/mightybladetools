package frogcorp.cache.items

import frogcorp.cache.items.dao.ArmorDao
import frogcorp.cache.items.mapper.toArmorsCache
import frogcorp.cache.items.mapper.toArmorsEntity
import frogcorp.data.items.model.ArmorEntity
import frogcorp.data.items.repository.ItemsCache
import io.reactivex.Completable
import io.reactivex.Observable
import io.reactivex.Single
import javax.inject.Inject

class ItemsCacheImpl @Inject constructor(private val armorDao: ArmorDao) : ItemsCache {

    override fun clearArmors(): Completable {
        return Completable.defer {
            try {
                armorDao.deleteAll()
            } catch (ex: Exception) {
                throw ex
            }
        Completable.complete()
        }
    }

    override fun saveArmors(armors: List<ArmorEntity>): Completable {
        return Completable.defer {
            try {
                armorDao.insertAll(armors.map { it.toArmorsCache() })
            }
            catch (ex: Exception) {
                throw ex
            }
            Completable.complete()
        }
    }

    override fun getArmors(): Single<List<ArmorEntity>> {
        return Single.fromCallable({ armorDao.loadAll().map { it.toArmorsEntity() } })
    }

    override fun isEmpty():  Boolean {
        return armorDao.loadAll().isEmpty()
    }

    override fun isExpired(): Boolean {
        // To code later
        return false
    }

}