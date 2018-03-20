package frogcorp.domain.items.repository

import frogcorp.domain.items.model.Armor
import frogcorp.domain.items.model.WeaponRange
import io.reactivex.Single

interface ItemsRepository {
    fun getArmors() : Single<List<Armor>>
    fun getRangeWeapon() : Single<List<WeaponRange>>
}