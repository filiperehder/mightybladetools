package frogcorp.domain.items.repository

import frogcorp.domain.items.model.Armor
import io.reactivex.Single

interface ItemsRepository {
    fun getArmors() : Single<List<Armor>>
}