package frogcorp.data.races.source

import frogcorp.data.races.model.RaceEntity
import frogcorp.data.races.repository.RacesDataStore
import frogcorp.data.races.repository.RacesRemote
import io.reactivex.Single
import javax.inject.Inject

class RacesRemoteDataStore @Inject constructor(private val remote: RacesRemote) : RacesDataStore {

    override fun getRace(name: String): Single<RaceEntity> {
        return remote.getRace(name)
    }
}