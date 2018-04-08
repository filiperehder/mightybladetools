package frogcorp.mightybladetools.features.classes.di

import dagger.Module
import dagger.Provides
import frogcorp.domain.classes.interactor.GetSkillsClasse
import frogcorp.mightybladetools.features.classes.FragmentClasseSkill
import frogcorp.presentation.classes.view.skills.ClasseSkillContract
import frogcorp.presentation.classes.view.skills.ClasseSkillPresenter

@Module
class ClassesSkillsModule {

    @Provides
    fun providePresenter(view: ClasseSkillContract.ClasseView, getSkillsClasse: GetSkillsClasse) : ClasseSkillContract.Presenter {
        return ClasseSkillPresenter(view, getSkillsClasse)
    }

    @Provides
    fun provideView(view: FragmentClasseSkill) : ClasseSkillContract.ClasseView {
        return view
    }

}