package frogcorp.domain.items.interactor

import frogcorp.domain.items.model.Armor
import frogcorp.domain.items.repository.ItemsRepository
import frogcorp.domain.usecase.SingleUseCase
import io.reactivex.Scheduler
import io.reactivex.Single
import io.reactivex.disposables.CompositeDisposable
import javax.inject.Inject
import javax.inject.Named

class GetArmors @Inject constructor(private val armorsRepository: ItemsRepository,
                                    @Named("SchedulerIO") executorThread: Scheduler,
                                    @Named("AndroidScheduler") uiThread: Scheduler,
                                    @Named("CompositeDisposable" ) disposables: CompositeDisposable) : SingleUseCase<List<Armor>, Void?>(executorThread, uiThread, disposables) {

    override fun buildUseCaseObservable(params: Void?): Single<List<Armor>> {
        return armorsRepository.getArmors()
    }

}