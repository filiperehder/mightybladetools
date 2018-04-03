package frogcorp.presentation.races.mapper

import frogcorp.domain.races.model.Race
import frogcorp.presentation.races.model.RaceItemView

fun Race.toRaceView() : RaceItemView = RaceItemView(name, str, dex, int, wis, common, skill_name, skill_type, skill_descr, skill_special)