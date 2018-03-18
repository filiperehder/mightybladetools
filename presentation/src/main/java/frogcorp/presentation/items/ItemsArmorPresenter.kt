package frogcorp.presentation.items

import android.util.Log
import frogcorp.domain.items.model.Armor
import frogcorp.domain.usecase.SingleUseCase
import frogcorp.presentation.items.mapper.toArmorView
import io.reactivex.observers.DisposableSingleObserver
import javax.inject.Inject

class ItemsArmorPresenter @Inject constructor(val view: ItemsArmorContract.ArmorView,
                                              private val getArmorsUseCase: SingleUseCase<List<Armor>, Void?>) : ItemsArmorContract.Presenter {

    override fun onStart() {
        onViewReady()
    }

    override fun onStop() {
        getArmorsUseCase.dispose()
    }

    override fun onViewReady() {
        getArmorsUseCase.execute(ArmorSubscriber())
    }

    inner class ArmorSubscriber : DisposableSingleObserver<List<Armor>>() {

        override fun onError(e: Throwable) {
            Log.d("error", e.message)
        }

        override fun onSuccess(t: List<Armor>) {
            view.showArmorList(t.map {it.toArmorView()})
        }
    }
}