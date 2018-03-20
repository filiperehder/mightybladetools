package frogcorp.data.items.mapper

import frogcorp.data.items.model.ArmorEntity
import frogcorp.data.items.model.WeaponRangeEntity
import frogcorp.domain.items.model.Armor
import frogcorp.domain.items.model.WeaponRange

fun ArmorEntity.toArmor() : Armor = Armor(name, defense, price, weight, fn)
fun WeaponRangeEntity.toWeaponRange() : WeaponRange = WeaponRange(name, type, damage, distance, minstr, notes, price, weight)