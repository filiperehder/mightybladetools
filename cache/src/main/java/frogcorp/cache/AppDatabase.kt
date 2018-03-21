package frogcorp.cache

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase
import frogcorp.cache.items.dao.ArmorDao
import frogcorp.cache.items.models.ArmorCacheModel

@Database(entities = [ArmorCacheModel::class], version = 1)
abstract class AppDatabase : RoomDatabase() {

    abstract fun armorDao() : ArmorDao
}