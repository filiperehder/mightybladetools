package frogcorp.cache.items.dao

import android.arch.persistence.room.*
import frogcorp.cache.items.models.ArmorCacheModel
import io.reactivex.Single

@Dao
interface ArmorDao {

    @Query("SELECT * FROM armors")
    fun loadAll() : List<ArmorCacheModel>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAll(armors: List<ArmorCacheModel>)

    @Query("DELETE FROM armors")
    fun deleteAll()
}