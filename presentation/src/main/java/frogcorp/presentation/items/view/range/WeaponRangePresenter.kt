package frogcorp.presentation.items.view.range

import android.util.Log
import frogcorp.domain.items.interactor.GetWeaponRange
import frogcorp.domain.items.model.WeaponRange
import frogcorp.domain.usecase.SingleUseCase
import frogcorp.presentation.items.mapper.toWeaponRangeView
import io.reactivex.observers.DisposableSingleObserver
import javax.inject.Inject

class WeaponRangePresenter @Inject constructor(val view: WeaponRangeContract.WeaponRangeView,
                                               private val getWeaponRangeUseCase: SingleUseCase<List<WeaponRange>, Void?>) : WeaponRangeContract.Presenter {

    override fun onStart() {
        onViewReady()
    }

    override fun onStop() {
        getWeaponRangeUseCase.dispose()
    }

    override fun onViewReady() {
        getWeaponRangeUseCase.execute(WeaponRangeSubscriber())
    }

    inner class WeaponRangeSubscriber : DisposableSingleObserver<List<WeaponRange>>() {

        override fun onSuccess(t: List<WeaponRange>) {
            view.showWeaponRangedList(t.map { it.toWeaponRangeView() })
        }

        override fun onError(e: Throwable) {
            Log.d("Error: ", e.message)
        }

    }
}