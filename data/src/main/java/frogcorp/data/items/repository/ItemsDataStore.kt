package frogcorp.data.items.repository

import frogcorp.data.items.model.ArmorEntity
import frogcorp.data.items.model.WeaponRangeEntity
import io.reactivex.Single

interface ItemsDataStore {

    fun getArmors() : Single<List<ArmorEntity>>
    fun getRangedWeapons() : Single<List<WeaponRangeEntity>>
}