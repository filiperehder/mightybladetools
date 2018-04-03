package frogcorp.presentation.races.view

import frogcorp.presentation.BasePresenter
import frogcorp.presentation.BaseView
import frogcorp.presentation.races.model.RaceItemView
import io.reactivex.Single

interface RaceContract {


    interface RaceView : BaseView {
        fun showRace(name: String) : RaceItemView
    }

    interface Presenter : BasePresenter
}