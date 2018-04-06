package frogcorp.data.classes.mapper

import frogcorp.data.classes.model.ClassesEntity
import frogcorp.domain.classes.model.Classe

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
