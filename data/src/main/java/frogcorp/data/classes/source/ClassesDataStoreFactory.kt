package frogcorp.data.classes.source

import frogcorp.data.classes.repository.ClasseDataStore
import javax.inject.Inject

class ClassesDataStoreFactory @Inject constructor(private val classesRemoteDataStore: ClassesRemoteDataStore) {


    fun retrieveRemoteDataStore() : ClasseDataStore {
         return classesRemoteDataStore
    }
}