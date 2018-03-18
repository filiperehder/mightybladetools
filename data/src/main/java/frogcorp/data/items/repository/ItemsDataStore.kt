package frogcorp.data.items.repository

import frogcorp.data.items.model.ArmorEntity
import io.reactivex.Single

interface ItemsDataStore {

    fun getArmors() : Single<ArmorEntity>
}