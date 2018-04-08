package frogcorp.presentation.classes.view.skills

import android.util.Log
import frogcorp.domain.classes.model.ClasseSkill
import frogcorp.domain.usecase.SingleUseCase
import frogcorp.presentation.classes.mapper.toClasseSkillItemView
import io.reactivex.observers.DisposableSingleObserver
import javax.inject.Inject

class ClasseSkillPresenter @Inject constructor(
        private val view: ClasseSkillContract.ClasseView,
        private val getSkillClassUseCase: SingleUseCase<List<ClasseSkill>, String>
) : ClasseSkillContract.Presenter {

    override fun onStart() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onStop() {
        getSkillClassUseCase.dispose()
    }

    override fun onChosedClasse(name: String) {
        getSkillClassUseCase.execute(ClasseSkillSubscriber(), name)
    }

    inner class ClasseSkillSubscriber() : DisposableSingleObserver<List<ClasseSkill>>() {

        override fun onSuccess(t: List<ClasseSkill>) {
            view.showSkillsFromClass(t.map {
                it.toClasseSkillItemView()
            })
        }

        override fun onError(e: Throwable) {
            Log.d("ERROR", e.message)
        }
    }
}