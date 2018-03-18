package frogcorp.presentation.items

import frogcorp.presentation.BasePresenter
import frogcorp.presentation.BaseView
import frogcorp.presentation.items.model.ArmorItemView

interface ItemsArmorContract {

    interface ArmorView : BaseView<Presenter> {
        fun showArmorList(list : List<ArmorItemView>)
        fun showArmorDetail() : ArmorItemView
    }

    interface Presenter : BasePresenter {
        fun retrieveArmor()
    }
}