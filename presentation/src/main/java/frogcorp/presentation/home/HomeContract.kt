package frogcorp.presentation.home

import android.app.Activity
import frogcorp.presentation.BaseView

interface HomeContract {
    interface HomeView : BaseView {
        fun showMenu()
        fun hideMenu()

        fun openActivity(activity: Activity)
    }
}