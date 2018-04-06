package frogcorp.domain.classes.repository

import frogcorp.domain.classes.model.Classe
import io.reactivex.Completable
import io.reactivex.Single

interface ClasseRepository {
    fun getClasses(name: String) : Single<Classe>
}