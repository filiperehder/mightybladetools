package frogcorp.remote.items.mapper

import frogcorp.data.items.model.ArmorEntity
import frogcorp.remote.items.models.ArmorsResponse

fun ArmorsResponse.toArmorsEntity() = ArmorEntity(name, defense, price, weight, fn)