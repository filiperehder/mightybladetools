package frogcorp.presentation.classes.mapper

import frogcorp.domain.classes.model.Classe
import frogcorp.domain.classes.model.ClasseSkill
import frogcorp.presentation.classes.model.ClasseItemView
import frogcorp.presentation.classes.model.ClasseSkillItemView

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

fun ClasseSkill.toClasseSkillItemView() : ClasseSkillItemView {
    return ClasseSkillItemView(
        name,
        type,
        descr,
        mana.toString(),
        requires,
        special,
        notes
    )
}