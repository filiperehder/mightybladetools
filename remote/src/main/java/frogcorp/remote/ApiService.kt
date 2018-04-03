package frogcorp.remote

import frogcorp.remote.items.models.ArmorsResponse
import frogcorp.remote.items.models.WeaponRangeResponse
import frogcorp.remote.races.models.RaceModel
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService {

    @GET("armaduras.json")
    fun getArmors() : Single<ArmorsResponse>

    @GET("/races/{name}.json")
    fun getRace(@Path("name") name: String) : Single<RaceModel>

}