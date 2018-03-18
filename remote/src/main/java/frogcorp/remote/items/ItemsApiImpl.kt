package frogcorp.remote.items

import frogcorp.data.items.model.ArmorEntity
import frogcorp.data.items.repository.ItemsApi
import frogcorp.remote.ApiService
import frogcorp.remote.items.mapper.toArmorsEntity
import io.reactivex.Single
import javax.inject.Inject

class ItemsApiImpl @Inject constructor(private val apiService: ApiService) : ItemsApi {

    override fun getArmors(): Single<ArmorEntity> = apiService.getArmors().map { it.toArmorsEntity() }
}