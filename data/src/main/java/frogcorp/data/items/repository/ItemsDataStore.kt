package frogcorp.data.items.repository

import frogcorp.data.items.model.ArmorEntity
import frogcorp.data.items.model.WeaponRangeEntity
import io.reactivex.Completable
import io.reactivex.Observable
import io.reactivex.Single

interface ItemsDataStore {

    fun clearArmors(): Observable<Boolean>
    fun saveArmors(armors: List<ArmorEntity>): Observable<Boolean>
    fun getArmors() : Single<List<ArmorEntity>>
    fun getRangedWeapons() : Single<List<WeaponRangeEntity>>
}