package frogcorp.mightybladetools.features.races

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import dagger.android.support.DaggerFragment
import frogcorp.mightybladetools.R
import frogcorp.presentation.races.model.RaceItemView
import frogcorp.presentation.races.view.RaceContract
import kotlinx.android.synthetic.main.fragment_race.*
import javax.inject.Inject

class FragmentRace : DaggerFragment(), RaceContract.RaceView {

    @Inject lateinit var presenter: RaceContract.Presenter

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_race, container, false)
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        presenter.onRaceChosed("humano")
    }

    override fun onDestroy() {
        super.onDestroy()
        presenter.onStop()
    }

    override fun showProgressBar() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun hideProgressBar() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun showRace(race: RaceItemView) {
        txtName.text = race.name

        txtFor.text = race.str.toString()
        txtAgi.text = race.dex.toString()
        txtInt.text = race.int.toString()
        txtVon.text = race.wis.toString()

        txtSkillName.text = race.skill_name
        txtSkillDescr.text = race.skill_descr
        txtSkillType.text = race.skill_type
    }
}