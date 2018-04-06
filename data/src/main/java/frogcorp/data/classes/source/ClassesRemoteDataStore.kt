package frogcorp.data.classes.source

import frogcorp.data.classes.model.ClassesEntity
import frogcorp.data.classes.repository.ClasseDataStore
import frogcorp.data.classes.repository.ClasseRemote
import io.reactivex.Single
import javax.inject.Inject

class ClassesRemoteDataStore @Inject constructor(private val remote: ClasseRemote) : ClasseDataStore {

    override fun getClasses(name: String): Single<ClassesEntity> {
        return remote.getClasses(name)
    }
}