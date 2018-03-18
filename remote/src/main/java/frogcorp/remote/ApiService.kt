package frogcorp.remote

import frogcorp.remote.items.models.ArmorsResponse
import io.reactivex.Single
import retrofit2.http.GET

interface ApiService {

    @GET("armaduras.json")
    fun getArmors() : Single<ArmorsResponse>
}