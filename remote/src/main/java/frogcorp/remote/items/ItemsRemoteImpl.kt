package frogcorp.remote.items

import frogcorp.data.items.model.ArmorEntity
import frogcorp.data.items.model.WeaponRangeEntity
import frogcorp.data.items.repository.ItemsRemote
import frogcorp.remote.ApiService
import frogcorp.remote.items.mapper.toArmorsEntity
import frogcorp.remote.items.mapper.toWeaponRangeEntity
import io.reactivex.Single
import javax.inject.Inject

class ItemsRemoteImpl @Inject constructor(private val apiService: ApiService) : ItemsRemote {

    override fun getRangedWeapons(): Single<List<WeaponRangeEntity>> = apiService.getRangedWeapons().map {
        it.data.map {
            it.toWeaponRangeEntity()
        }
    }

    override fun getArmors(): Single<List<ArmorEntity>> = apiService.getArmors().map {
        it.data.map {
            it.toArmorsEntity()
        }
    }
}