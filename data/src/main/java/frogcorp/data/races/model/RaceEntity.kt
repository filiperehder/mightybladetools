package frogcorp.data.races.model

data class RaceEntity(
    val name: String,
    val str: Int,
    val dex: Int,
    val int: Int,
    val wis: Int,
    val common: String,
    val skill_name: String,
    val skill_type: String,
    val skill_descr: String,
    val skill_special: String?
)
