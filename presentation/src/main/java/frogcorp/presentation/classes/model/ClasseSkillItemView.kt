package frogcorp.presentation.classes.model

data class ClasseSkillItemView(
    val name: String,
    val type: String,
    val descr: String,
    val mana: String?,
    val requires: String?,
    val special: String?,
    val notes: String?
)