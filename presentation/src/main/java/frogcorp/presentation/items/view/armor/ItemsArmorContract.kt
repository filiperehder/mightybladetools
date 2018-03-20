package frogcorp.presentation.items.view.armor

import frogcorp.presentation.BasePresenter
import frogcorp.presentation.BaseView
import frogcorp.presentation.items.model.ArmorItemView

interface ItemsArmorContract {

    interface ArmorView : BaseView {
        fun showArmorList(list : List<ArmorItemView>)
        fun showArmorDetail(item: ArmorItemView)
    }

    interface Presenter : BasePresenter {
        fun onViewReady()
    }
}