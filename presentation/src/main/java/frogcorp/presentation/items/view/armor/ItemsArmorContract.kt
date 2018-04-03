package frogcorp.presentation.items.view.armor

import frogcorp.presentation.BasePresenter
import frogcorp.presentation.BaseView
import frogcorp.presentation.items.model.ArmorItemView

interface ItemsArmorContract {

    interface ArmorView : BaseView {
        fun showArmorList(list : List<ArmorItemView>)
        fun showError()
    }

    interface Presenter : BasePresenter {
    }
}