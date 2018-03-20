package frogcorp.presentation.home

import frogcorp.presentation.BasePresenter
import frogcorp.presentation.BaseView

interface HomeContract {
    interface HomeView : BaseView
    interface Presenter : BasePresenter {
        fun onViewReady()
        fun onViewGone()
    }
}