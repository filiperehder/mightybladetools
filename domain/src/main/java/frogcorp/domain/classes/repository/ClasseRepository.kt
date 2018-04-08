package frogcorp.domain.classes.repository

import frogcorp.domain.classes.model.Classe
import frogcorp.domain.classes.model.ClasseSkill
import io.reactivex.Completable
import io.reactivex.Single

interface ClasseRepository {
    fun getClasses(name: String) : Single<Classe>
    fun getSkills(name: String) : Single<List<ClasseSkill>>
}