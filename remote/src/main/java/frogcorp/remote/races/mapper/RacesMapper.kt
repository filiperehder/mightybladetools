package frogcorp.remote.races.mapper

import frogcorp.data.races.model.RaceEntity
import frogcorp.remote.races.models.RaceModel

fun RaceModel.toRaceEntity() = RaceEntity(name, str, dex, int, wis, common, default_skill_name, default_skill_type, default_skill_descr, default_skill_special)