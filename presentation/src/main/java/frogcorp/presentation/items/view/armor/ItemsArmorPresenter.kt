package frogcorp.presentation.items.view.armor

import frogcorp.domain.items.model.Armor
import frogcorp.domain.usecase.SingleUseCase
import frogcorp.presentation.items.mapper.toArmorView
import io.reactivex.observers.DisposableSingleObserver
import javax.inject.Inject

class ItemsArmorPresenter @Inject constructor(val view: ItemsArmorContract.ArmorView,
                                              private val getArmorsUseCase: SingleUseCase<List<Armor>, Void?>) : ItemsArmorContract.Presenter {

    override fun onStart() {
        view.showProgressBar()
        getArmorsUseCase.execute(ArmorSubscriber())
    }

    override fun onStop() = getArmorsUseCase.dispose()

    inner class ArmorSubscriber : DisposableSingleObserver<List<Armor>>() {

        override fun onError(e: Throwable) {
            view.hideProgressBar()
            view.showError()
        }

        override fun onSuccess(t: List<Armor>) {
            view.hideProgressBar()
            view.showArmorList(t.map {it.toArmorView()})
        }
    }
}