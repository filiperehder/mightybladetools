package frogcorp.domain.classes.interactor

import frogcorp.domain.classes.model.ClasseSkill
import frogcorp.domain.classes.repository.ClasseRepository
import frogcorp.domain.usecase.SingleUseCase
import io.reactivex.Scheduler
import io.reactivex.Single
import io.reactivex.disposables.CompositeDisposable
import javax.inject.Inject
import javax.inject.Named

class GetSkillsClasse @Inject constructor(
    private val classeRepository: ClasseRepository,
    @Named("SchedulerIO") executorThread: Scheduler,
    @Named("AndroidScheduler") uiThread: Scheduler,
    @Named("CompositeDisposable" ) disposables: CompositeDisposable
) : SingleUseCase<List<ClasseSkill>, String>(executorThread, uiThread, disposables) {

    override fun buildUseCaseObservable(params: String?): Single<List<ClasseSkill>> {
        return classeRepository.getSkills(params!!)
    }
}