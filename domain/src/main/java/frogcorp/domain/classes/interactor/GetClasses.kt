package frogcorp.domain.classes.interactor

import frogcorp.domain.classes.model.Classe
import frogcorp.domain.classes.repository.ClasseRepository
import frogcorp.domain.usecase.SingleUseCase
import io.reactivex.Scheduler
import io.reactivex.Single
import io.reactivex.disposables.CompositeDisposable
import javax.inject.Inject
import javax.inject.Named

class GetClasses @Inject constructor(private val classeRepository: ClasseRepository,
                                     @Named("SchedulerIO") executorThread: Scheduler,
                                     @Named("AndroidScheduler") uiThread: Scheduler,
                                     @Named("CompositeDisposable" ) disposables: CompositeDisposable) : SingleUseCase<Classe, String>(executorThread, uiThread, disposables) {

    override fun buildUseCaseObservable(params: String?): Single<Classe> {
        return classeRepository.getClasses(params!!)
    }
}