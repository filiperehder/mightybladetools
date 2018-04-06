package frogcorp.presentation.classes.model

data class ClasseItemView(
    val name: String,
    val int: String,
    val dex: String,
    val str: String,
    val wis: String,
    val skillName: String,
    val skillType: String,
    val skillDescr: String,
    val skillSpecial: String?
)