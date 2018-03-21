package frogcorp.cache.items.dao

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert
import android.arch.persistence.room.OnConflictStrategy
import android.arch.persistence.room.Query
import frogcorp.cache.items.models.ArmorCacheModel

@Dao
interface ArmorDao {

    @Query("SELECT * FROM armors")
    fun loadAll() : List<ArmorCacheModel>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAll(armors: List<ArmorCacheModel>)
}