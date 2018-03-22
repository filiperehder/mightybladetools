package frogcorp.data.items.source

import frogcorp.data.items.model.ArmorEntity
import frogcorp.data.items.model.WeaponRangeEntity
import frogcorp.data.items.repository.ItemsRemote
import frogcorp.data.items.repository.ItemsDataStore
import io.reactivex.Completable
import io.reactivex.Observable
import io.reactivex.Single
import javax.inject.Inject

class ItemsRemoteDataStore @Inject constructor(private val remote: ItemsRemote) : ItemsDataStore {

    override fun clearArmors(): Completable {
        throw UnsupportedOperationException()
    }

    override fun saveArmors(armors: List<ArmorEntity>): Completable {
        throw UnsupportedOperationException()
    }

    override fun getRangedWeapons(): Single<List<WeaponRangeEntity>> = remote.getRangedWeapons()

    override fun getArmors(): Single<List<ArmorEntity>> = remote.getArmors()
}