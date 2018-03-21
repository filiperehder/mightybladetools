package frogcorp.data.items.repository

import frogcorp.data.items.model.ArmorEntity
import io.reactivex.Observable
import io.reactivex.Single

interface ItemsCache {
    fun clearArmors(): Observable<Boolean>
    fun saveArmors(armors: List<ArmorEntity>): Observable<Boolean>
    fun getArmors() : Single<List<ArmorEntity>>
}