package frogcorp.remote.races.models

data class RaceModel(
    val name: String,
    val str: Int,
    val dex: Int,
    val int: Int,
    val wis: Int,
    val common: String,
    val default_skill_name: String,
    val default_skill_type: String,
    val default_skill_descr: String,
    val default_skill_special: String?
)