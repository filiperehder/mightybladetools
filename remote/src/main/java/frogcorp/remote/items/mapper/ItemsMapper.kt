package frogcorp.remote.items.mapper

import frogcorp.data.items.model.ArmorEntity
import frogcorp.remote.items.models.ArmorsModel
import frogcorp.remote.items.models.WeaponRangeModel

fun ArmorsModel.toArmorsEntity() = ArmorEntity(id, name, defense, price, weight, fn)