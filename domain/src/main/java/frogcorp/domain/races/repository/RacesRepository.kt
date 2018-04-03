package frogcorp.domain.races.repository

import frogcorp.domain.races.model.Race
import io.reactivex.Single

interface RacesRepository {
    fun getRace(name: String): Single<Race>
}