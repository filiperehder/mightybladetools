package frogcorp.cache.items.mapper

import frogcorp.cache.items.models.ArmorCacheModel
import frogcorp.data.items.model.ArmorEntity

fun ArmorCacheModel.toArmorsEntity() = ArmorEntity(id, name, defense, price, weight, fn)
fun ArmorEntity.toArmorsCache() = ArmorCacheModel(id, name, defense, price, weight, fn)
