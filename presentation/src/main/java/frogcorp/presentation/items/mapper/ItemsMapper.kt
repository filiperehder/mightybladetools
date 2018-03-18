package frogcorp.presentation.items.mapper

import frogcorp.domain.items.model.Armor
import frogcorp.presentation.items.model.ArmorItemView

fun Armor.toArmorView() : ArmorItemView = ArmorItemView(name, defense, price, weight, fn)