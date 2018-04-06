package frogcorp.presentation.classes.view

import frogcorp.presentation.BasePresenter
import frogcorp.presentation.BaseView
import frogcorp.presentation.classes.model.ClasseItemView

interface ClasseContract {

    interface ClasseView : BaseView {
        fun showClasse(item: ClasseItemView)
        fun showError()
    }

    interface Presenter : BasePresenter {
        fun onChosedClasse(name: String)
    }
}