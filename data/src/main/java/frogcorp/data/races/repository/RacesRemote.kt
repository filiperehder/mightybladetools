package frogcorp.data.races.repository

import frogcorp.data.races.model.RaceEntity
import io.reactivex.Single

interface RacesRemote {

    fun getRace(name: String) : Single<RaceEntity>
}