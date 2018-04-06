package frogcorp.remote.classes.model

data class ClasseModel(
    val name: String,
    val int: Int,
    val dex: Int,
    val str: Int,
    val wis: Int,
    val default_skill_name: String,
    val default_skill_type: String,
    val default_skill_descr: String,
    val default_skill_special: String?
)