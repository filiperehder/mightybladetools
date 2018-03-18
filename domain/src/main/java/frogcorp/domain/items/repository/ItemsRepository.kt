package frogcorp.domain.items.repository

import frogcorp.domain.items.model.Armors
import io.reactivex.Single

interface ItemsRepository {
    fun getArmors() : Single<List<Armors>>
}