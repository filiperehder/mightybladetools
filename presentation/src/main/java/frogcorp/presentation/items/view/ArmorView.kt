package frogcorp.presentation.items.view

import frogcorp.presentation.items.model.ArmorItemView

interface ArmorView {

    fun showArmorList() : List<ArmorItemView>
    fun showArmorDetail() : ArmorItemView

}