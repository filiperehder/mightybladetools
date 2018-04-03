package frogcorp.mightybladetools.features.races

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import dagger.android.support.DaggerFragment
import frogcorp.mightybladetools.R
import frogcorp.presentation.races.model.RaceItemView
import frogcorp.presentation.races.view.RaceContract
import javax.inject.Inject

class FragmentRace : DaggerFragment(), RaceContract.RaceView {

    @Inject lateinit var presenter: RaceContract.Presenter

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_race, container, false)
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        presenter.onStart()
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

    override fun showRace(name: String): RaceItemView {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}