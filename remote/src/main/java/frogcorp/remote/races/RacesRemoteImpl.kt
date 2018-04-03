package frogcorp.remote.races

import frogcorp.data.races.model.RaceEntity
import frogcorp.data.races.repository.RacesRemote
import frogcorp.remote.ApiService
import frogcorp.remote.races.mapper.toRaceEntity
import io.reactivex.Single
import javax.inject.Inject

class RacesRemoteImpl @Inject constructor(private val apiService: ApiService) : RacesRemote{

    override fun getRace(name: String): Single<RaceEntity> {
        return apiService.getRace(name).map {
            it.toRaceEntity()
        }
    }
}