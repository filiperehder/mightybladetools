package frogcorp.remote.items.mapper

import frogcorp.data.items.model.ArmorEntity
import frogcorp.data.items.model.WeaponRangeEntity
import frogcorp.remote.items.models.ArmorsModel
import frogcorp.remote.items.models.ArmorsResponse
import frogcorp.remote.items.models.WeaponRangeModel

fun ArmorsModel.toArmorsEntity() = ArmorEntity(id, name, defense, price, weight, fn)
fun WeaponRangeModel.toWeaponRangeEntity() = WeaponRangeEntity(name, type, damage, distance, minstr, notes, price, weight)