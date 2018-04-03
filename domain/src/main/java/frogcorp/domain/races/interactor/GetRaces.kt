package frogcorp.domain.races.interactor

import frogcorp.domain.races.model.Race
import frogcorp.domain.races.repository.RacesRepository
import frogcorp.domain.usecase.SingleUseCase
import io.reactivex.Scheduler
import io.reactivex.Single
import io.reactivex.disposables.CompositeDisposable
import javax.inject.Inject
import javax.inject.Named

class GetRaces @Inject constructor(private val racesRepository: RacesRepository,
                                    @Named("SchedulerIO") executorThread: Scheduler,
                                    @Named("AndroidScheduler") uiThread: Scheduler,
                                    @Named("CompositeDisposable" ) disposables: CompositeDisposable) : SingleUseCase<Race, String>(executorThread, uiThread, disposables) {

    override fun buildUseCaseObservable(params: String?): Single<Race> {
        return racesRepository.getRace(params!!)
    }
}