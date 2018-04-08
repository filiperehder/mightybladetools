package frogcorp.data.classes.model

data class ClasseSkillEntity(
    val name: String,
    val type: String,
    val descr: String,
    val mana: Int?,
    val requires: String?,
    val special: String?,
    val notes: String?
)