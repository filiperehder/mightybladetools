package frogcorp.data.races.source

import frogcorp.data.races.repository.RacesDataStore
import javax.inject.Inject

class RacesDataStoreFactory @Inject constructor(private val racesRemoteDataStore: RacesRemoteDataStore) {

    fun retrieveRacesRemoteDataStore()  : RacesDataStore = racesRemoteDataStore
}