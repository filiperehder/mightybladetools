package frogcorp.data.races.mapper

import frogcorp.data.races.model.RaceEntity
import frogcorp.domain.races.model.Race

fun RaceEntity.toRace() : Race = Race(name, str, dex, int, wis, common, skill_name, skill_type, skill_descr, skill_special)