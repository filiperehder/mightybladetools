package frogcorp.presentation.classes.mapper

import frogcorp.domain.classes.model.Classe
import frogcorp.presentation.classes.model.ClasseItemView

fun Classe.toClasseItemView() : ClasseItemView {
    return ClasseItemView(
        name, int.toString(),
        dex.toString(),
        str.toString(),
        wis.toString(),
        skillName,
        skillType,
        skillDescr,
        skillSpecial
    )
}