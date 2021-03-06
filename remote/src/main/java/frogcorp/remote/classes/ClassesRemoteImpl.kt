package frogcorp.remote.classes

import frogcorp.data.classes.model.ClasseSkillEntity
import frogcorp.data.classes.model.ClassesEntity
import frogcorp.data.classes.repository.ClasseRemote
import frogcorp.remote.ApiService
import frogcorp.remote.classes.mapper.toClasseEntity
import frogcorp.remote.classes.mapper.toClasseSkillEntity
import io.reactivex.Single
import javax.inject.Inject

class ClassesRemoteImpl @Inject constructor(private val apiService: ApiService) : ClasseRemote {

    override fun getSkillsClasse(name: String): Single<List<ClasseSkillEntity>> {
        return apiService.getSkillClasses(name).map {
            it.map {
                it.toClasseSkillEntity()
            }
        }
    }

    override fun getClasses(name: String): Single<ClassesEntity> {
        return apiService.getClasse(name).map {
            it.toClasseEntity()
        }
    }
}