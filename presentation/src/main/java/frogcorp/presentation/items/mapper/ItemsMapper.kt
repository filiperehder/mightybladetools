package frogcorp.presentation.items.mapper

import frogcorp.domain.items.model.Armor
import frogcorp.domain.items.model.WeaponRange
import frogcorp.presentation.items.model.ArmorItemView
import frogcorp.presentation.items.model.WeaponRangeItemView

fun Armor.toArmorView() : ArmorItemView = ArmorItemView(name, defense, price, weight, fn)
fun WeaponRange.toWeaponRangeView() : WeaponRangeItemView = WeaponRangeItemView(name, type, damage, distance, minstr, notes, price, weight)