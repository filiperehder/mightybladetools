package frogcorp.presentation.items.view.range

import frogcorp.presentation.BasePresenter
import frogcorp.presentation.BaseView
import frogcorp.presentation.items.model.WeaponRangeItemView

interface WeaponRangeContract {

    interface WeaponRangeView : BaseView {
        fun showWeaponRangedList(list : List<WeaponRangeItemView>)
    }

    interface Presenter : BasePresenter {
        fun onViewReady()
        fun onViewGone()
    }
}