package frogcorp.presentation.classes.view.skills

import frogcorp.presentation.BasePresenter
import frogcorp.presentation.BaseView
import frogcorp.presentation.classes.model.ClasseSkillItemView

interface ClasseSkillContract {

    interface ClasseView : BaseView {
        fun showSkillsFromClass(item: List<ClasseSkillItemView>)
        fun showError()
    }

    interface Presenter : BasePresenter {
        fun onChosedClasse(name: String)
    }
}