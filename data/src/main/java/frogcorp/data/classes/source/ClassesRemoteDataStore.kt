package frogcorp.data.classes.source

import frogcorp.data.classes.model.ClasseSkillEntity
import frogcorp.data.classes.model.ClassesEntity
import frogcorp.data.classes.repository.ClasseDataStore
import frogcorp.data.classes.repository.ClasseRemote
import io.reactivex.Single
import javax.inject.Inject

class ClassesRemoteDataStore @Inject constructor(private val remote: ClasseRemote) : ClasseDataStore {

    override fun getSkillsClasse(name: String): Single<List<ClasseSkillEntity>> {
        return remote.getSkillsClasse(name)
    }

    override fun getClasses(name: String): Single<ClassesEntity> {
        return remote.getClasses(name)
    }
}