package frogcorp.domain.items.model

data class WeaponRange(val name: String,
                       val type: String,
                       val damage: String,
                       val distance: String,
                       val minstr: Int,
                       val notes: String?,
                       val price: Int,
                       val weight: Double)