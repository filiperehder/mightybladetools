package frogcorp.data.items.mapper

import frogcorp.data.items.model.ArmorEntity
import frogcorp.domain.items.model.Armor

fun ArmorEntity.toArmor() : Armor = Armor(name, defense, price, weight, fn)