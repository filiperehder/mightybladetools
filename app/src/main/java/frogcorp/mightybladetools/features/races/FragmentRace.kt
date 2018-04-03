package frogcorp.mightybladetools.features.races

import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import dagger.android.support.DaggerFragment
import frogcorp.mightybladetools.R
import kotlinx.android.synthetic.main.fragment_race.*

class FragmentRace : DaggerFragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_race, container, false)
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initView()
        initValues()
    }

    private fun initView() {
        rvRaces.layoutManager = LinearLayoutManager(this.activity)
    }

    private fun initValues() {
        val racesList = listOf(
            "Aesir",
            "Elfo",
            "Faen",
            "Fauno",
            "Fira",
            "Humano",
            "Juban",
            "Levent",
            "Mahok",
            "Tailox"
        )

        rvRaces.adapter = AdapterRace(this.activity, racesList)
    }

}