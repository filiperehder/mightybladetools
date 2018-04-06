package frogcorp.remote.classes.mapper

import frogcorp.data.classes.model.ClassesEntity
import frogcorp.remote.classes.model.ClasseModel

fun ClasseModel.toClasseEntity() : ClassesEntity {
    return ClassesEntity(name, int, dex, str, wis, default_skill_name, default_skill_type, default_skill_descr, default_skill_special)
}