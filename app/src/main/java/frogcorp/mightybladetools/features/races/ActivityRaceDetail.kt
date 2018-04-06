package frogcorp.mightybladetools.features.races

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import dagger.android.support.DaggerAppCompatActivity
import dagger.android.support.DaggerFragment
import frogcorp.mightybladetools.R
import frogcorp.presentation.races.model.RaceItemView
import frogcorp.presentation.races.view.RaceContract
import kotlinx.android.synthetic.main.fragment_race_detail.*
import javax.inject.Inject

class ActivityRaceDetail : DaggerAppCompatActivity(), RaceContract.RaceView {

    @Inject lateinit var presenter: RaceContract.Presenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_race_detail)

        initView()
    }

    private fun initView() {
        val race = intent.getStringExtra("race")

        presenter.OnChosedRace(race)
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