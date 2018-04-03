package frogcorp.presentation.races.view

import android.util.Log
import frogcorp.domain.races.model.Race
import frogcorp.domain.usecase.SingleUseCase
import frogcorp.presentation.races.mapper.toRaceView
import io.reactivex.observers.DisposableSingleObserver
import javax.inject.Inject

class RacesPresenter @Inject constructor(val view: RaceContract.RaceView,
                                         private val getRacesUseCase: SingleUseCase<Race, String>) : RaceContract.Presenter {
    override fun onStart() {
    }

    override fun onStop() {
        getRacesUseCase.dispose()
    }

    override fun OnChosedRace(race: String) {
        getRacesUseCase.execute(RaceSubscriber(), race)
    }

    inner class RaceSubscriber : DisposableSingleObserver<Race>() {

        override fun onSuccess(race: Race) {
            view.showRace(race.toRaceView())
        }

        override fun onError(e: Throwable) {
            Log.d("RACE", e.message)
        }

    }
}