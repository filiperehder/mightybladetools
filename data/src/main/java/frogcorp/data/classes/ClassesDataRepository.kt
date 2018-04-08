package frogcorp.data.classes

import frogcorp.data.classes.mapper.toClasse
import frogcorp.data.classes.mapper.toClasseSkill
import frogcorp.data.classes.source.ClassesDataStoreFactory
import frogcorp.domain.classes.model.Classe
import frogcorp.domain.classes.model.ClasseSkill
import frogcorp.domain.classes.repository.ClasseRepository
import io.reactivex.Single
import javax.inject.Inject

class ClassesDataRepository @Inject constructor(private val factory: ClassesDataStoreFactory) : ClasseRepository {

    override fun getSkills(name: String): Single<List<ClasseSkill>> {
        return factory.retrieveRemoteDataStore().getSkillsClasse(name).map {
            it.map {
                it.toClasseSkill()
            }
        }
    }

    override fun getClasses(name: String): Single<Classe> {
        return factory.retrieveRemoteDataStore().getClasses(name).map {
            it.toClasse()
        }
    }
}