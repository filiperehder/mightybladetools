package frogcorp.remote.classes.mapper

import frogcorp.data.classes.model.ClasseSkillEntity
import frogcorp.data.classes.model.ClassesEntity
import frogcorp.remote.classes.model.ClasseModel
import frogcorp.remote.classes.model.ClasseSkillModel

fun ClasseModel.toClasseEntity() : ClassesEntity {
    return ClassesEntity(name, int, dex, str, wis, default_skill_name, default_skill_type, default_skill_descr, default_skill_special)
}

fun ClasseSkillModel.toClasseSkillEntity() : ClasseSkillEntity {
    return ClasseSkillEntity(name, type, descr, mana, requires, special, notes)
}