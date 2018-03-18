package frogcorp.domain.items.interactor

import frogcorp.domain.executor.PostExecutionThread
import frogcorp.domain.executor.ThreadExecutor
import frogcorp.domain.items.model.Armors
import frogcorp.domain.items.repository.ItemsRepository
import frogcorp.domain.usecase.SingleUseCase
import io.reactivex.Single
import javax.inject.Inject

class GetArmors @Inject constructor(val armorsRepository: ItemsRepository,
                                    threadExecutor: ThreadExecutor,
                                    postExecutionThread: PostExecutionThread) : SingleUseCase<List<Armors>, Void?>(threadExecutor, postExecutionThread) {

    override fun buildUseCaseObservable(params: Void?): Single<List<Armors>> {
        return armorsRepository.getArmors()
    }

}