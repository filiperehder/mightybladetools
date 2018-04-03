package frogcorp.presentation.races.view

import android.util.Log
import frogcorp.domain.races.model.Race
import frogcorp.domain.usecase.SingleUseCase
import io.reactivex.observers.DisposableSingleObserver
import javax.inject.Inject

class RacesPresenter @Inject constructor(val view: RaceContract.RaceView,
                                         private val getRacesUseCase: SingleUseCase<Race, String>) : RaceContract.Presenter {

    override fun onStart() {
        getRacesUseCase.execute(RaceSubscriber(), "humano")
    }

    override fun onStop() {
        getRacesUseCase.dispose()
    }

    inner class RaceSubscriber : DisposableSingleObserver<Race>() {

        override fun onSuccess(t: Race) {
            Log.d("RACE", t.toString())
        }

        override fun onError(e: Throwable) {
            Log.d("RACE", e.message)
        }

    }
}