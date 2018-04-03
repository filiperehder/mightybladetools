package frogcorp.data.races

import frogcorp.data.races.mapper.toRace
import frogcorp.data.races.source.RacesDataStoreFactory
import frogcorp.domain.races.model.Race
import frogcorp.domain.races.repository.RacesRepository
import io.reactivex.Single
import javax.inject.Inject

class RacesDataRepository @Inject constructor(private val factory: RacesDataStoreFactory) : RacesRepository {


    override fun getRace(name: String): Single<Race> {
        return factory.retrieveRacesRemoteDataStore().getRace(name).map {
            it.toRace()
        }
    }
}