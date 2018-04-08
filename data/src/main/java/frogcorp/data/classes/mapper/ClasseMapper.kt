package frogcorp.data.classes.mapper

import frogcorp.data.classes.model.ClasseSkillEntity
import frogcorp.data.classes.model.ClassesEntity
import frogcorp.domain.classes.model.Classe
import frogcorp.domain.classes.model.ClasseSkill

fun ClassesEntity.toClasse(): Classe = Classe(
    name,
    int,
    dex,
    str,
    wis,
    skillName,
    skillType,
    skillDescr,
    skillSpecial
)

fun ClasseSkillEntity.toClasseSkill() : ClasseSkill = ClasseSkill(
    name,
    type,
    descr,
    mana,
    requires,
    special,
    notes
)
