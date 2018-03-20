package frogcorp.remote.items.models

data class WeaponRangeModel(val name: String,
                            val type: String,
                            val damage: String,
                            val distance: String,
                            val minstr: Int,
                            val notes: String?,
                            val price: Int,
                            val weight: Double)