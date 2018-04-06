package frogcorp.data.classes.model

data class ClassesEntity(
    val name: String,
    val int: Int,
    val dex: Int,
    val str: Int,
    val wis: Int,
    val skillName: String,
    val skillType: String,
    val skillDescr: String,
    val skillSpecial: String?
)