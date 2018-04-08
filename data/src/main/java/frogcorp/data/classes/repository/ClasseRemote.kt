package frogcorp.data.classes.repository

import frogcorp.data.classes.model.ClasseSkillEntity
import frogcorp.data.classes.model.ClassesEntity
import io.reactivex.Single

interface ClasseRemote {
    fun getClasses(name: String) : Single<ClassesEntity>
    fun getSkillsClasse(name: String) : Single<List<ClasseSkillEntity>>
}