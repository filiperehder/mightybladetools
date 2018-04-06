package frogcorp.mightybladetools.features.classes

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import dagger.android.support.DaggerFragment
import frogcorp.mightybladetools.R
import frogcorp.presentation.classes.model.ClasseItemView
import frogcorp.presentation.classes.view.ClasseContract
import kotlinx.android.synthetic.main.fragment_classe.*
import javax.inject.Inject

class FragmentClasse : DaggerFragment(), ClasseContract.ClasseView {

    @Inject lateinit var presenter : ClasseContract.Presenter

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_classe, container, false)
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        presenter.onChosedClasse("guerreiro")
    }

    override fun showProgressBar() {
        progressBar.visibility = View.VISIBLE
    }

    override fun hideProgressBar() {
        progressBar.visibility = View.GONE
    }

    override fun showClasse(item: ClasseItemView) {
        txtName.text = item.name
    }

    override fun showError() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}