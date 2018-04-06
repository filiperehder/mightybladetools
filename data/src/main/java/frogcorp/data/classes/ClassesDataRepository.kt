package frogcorp.data.classes

import frogcorp.data.classes.mapper.toClasse
import frogcorp.data.classes.source.ClassesDataStoreFactory
import frogcorp.domain.classes.model.Classe
import frogcorp.domain.classes.repository.ClasseRepository
import io.reactivex.Single
import javax.inject.Inject

class ClassesDataRepository @Inject constructor(private val factory: ClassesDataStoreFactory) : ClasseRepository {

    override fun getClasses(name: String): Single<Classe> {
        return factory.retrieveRemoteDataStore().getClasses(name).map {
            it.toClasse()
        }
    }
}