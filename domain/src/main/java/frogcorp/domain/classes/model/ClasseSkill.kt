package frogcorp.domain.classes.model

data class ClasseSkill(
    val name: String,
    val type: String,
    val descr: String,
    val mana: Int?,
    val requires: String?,
    val special: String?,
    val notes: String?
)