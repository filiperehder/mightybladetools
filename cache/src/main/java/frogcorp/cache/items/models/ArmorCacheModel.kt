package frogcorp.cache.items.models

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

@Entity(tableName = "armors")
data class ArmorCacheModel (
        @PrimaryKey
        val id: Int,

        val name: String,
        val defense: Int,
        val price: Int,
        val weight: Double,
        val fn: Int)