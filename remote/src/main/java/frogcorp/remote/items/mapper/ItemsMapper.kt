package frogcorp.remote.items.mapper

import frogcorp.data.items.model.ArmorEntity
import frogcorp.remote.items.models.ArmorsModel
import frogcorp.remote.items.models.ArmorsResponse

fun ArmorsModel.toArmorsEntity() = ArmorEntity(name, defense, price, weight, fn)