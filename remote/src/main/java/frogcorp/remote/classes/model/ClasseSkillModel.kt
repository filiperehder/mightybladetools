package frogcorp.remote.classes.model

data class ClasseSkillModel(
    val name: String,
    val type: String,
    val descr: String,
    val mana: Int?,
    val requires: String?,
    val special: String?,
    val notes: String?
)