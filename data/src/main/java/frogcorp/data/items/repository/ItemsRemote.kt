package frogcorp.data.items.repository

import frogcorp.data.items.model.ArmorEntity
import io.reactivex.Single

interface ItemsRemote {

    fun getArmors() : Single<List<ArmorEntity>>
}