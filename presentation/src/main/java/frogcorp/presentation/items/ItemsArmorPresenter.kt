package frogcorp.presentation.items

import frogcorp.domain.items.model.Armor
import frogcorp.domain.usecase.SingleUseCase
import frogcorp.presentation.items.mapper.toArmorView
import io.reactivex.observers.DisposableSingleObserver
import javax.inject.Inject

class ItemsArmorPresenter @Inject constructor(val view: ItemsArmorContract.ArmorView,
                                              private val getArmorsUseCase: SingleUseCase<List<Armor>, Void?>) : ItemsArmorContract.Presenter {

    init {
        view.setPresenter(this)
    }

    override fun onStart() {
        retrieveArmor()
    }

    override fun onStop() {
        getArmorsUseCase.dispose()
    }

    override fun retrieveArmor() {
        getArmorsUseCase.execute(ArmorSubscriber())
    }

    inner class ArmorSubscriber : DisposableSingleObserver<List<Armor>>() {

        override fun onError(e: Throwable) {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun onSuccess(t: List<Armor>) {
            view.showArmorList(t.map {it.toArmorView()})
        }
    }
}