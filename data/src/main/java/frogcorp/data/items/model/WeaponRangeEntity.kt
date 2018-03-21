package frogcorp.data.items.model

data class WeaponRangeEntity(
        val name: String,
        val type: String,
        val damage: String,
        val distance: String,
        val minstr: Int,
        val notes: String?,
        val price: Int,
        val weight: Double)