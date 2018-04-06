package frogcorp.presentation.classes.view

import android.util.Log
import frogcorp.domain.classes.model.Classe
import frogcorp.domain.usecase.SingleUseCase
import frogcorp.presentation.classes.mapper.toClasseItemView
import io.reactivex.observers.DisposableSingleObserver
import javax.inject.Inject

class ClassePresenter @Inject constructor(private val view: ClasseContract.ClasseView,
                                          private val getClassesUseCase: SingleUseCase<Classe, String>) : ClasseContract.Presenter {

    override fun onStart() {}

    override fun onStop() {
        getClassesUseCase.dispose()
    }

    override fun onChosedClasse(name: String) {
        view.showProgressBar()
        getClassesUseCase.execute(ClasseSubscriber(), name)
    }

    inner class ClasseSubscriber : DisposableSingleObserver<Classe>() {

        override fun onError(e: Throwable) {
            view.hideProgressBar()
            Log.d("ERROR", e.message)
        }

        override fun onSuccess(item: Classe) {
            view.hideProgressBar()
            view.showClasse(item.toClasseItemView())
        }

    }
}