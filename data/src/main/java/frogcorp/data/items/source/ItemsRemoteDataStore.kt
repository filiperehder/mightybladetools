package frogcorp.data.items.source

import frogcorp.data.items.model.ArmorEntity
import frogcorp.data.items.repository.ItemsRemote
import frogcorp.data.items.repository.ItemsDataStore
import io.reactivex.Single
import javax.inject.Inject

class ItemsRemoteDataStore @Inject constructor(private val remote: ItemsRemote) : ItemsDataStore {

    override fun getArmors(): Single<List<ArmorEntity>> = remote.getArmors()
}