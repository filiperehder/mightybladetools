package frogcorp.remote

import frogcorp.remote.classes.model.ClasseModel
import frogcorp.remote.classes.model.ClasseSkillModel
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

    @GET("/classes/{name}/overview.json")
    fun getClasse(@Path("name") name: String) : Single<ClasseModel>

    @GET("/classes/{name}/skills.json")
    fun getSkillClasses(@Path("name") name: String) : Single<List<ClasseSkillModel>>

}