package frogcorp.mightybladetools.features.classes

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import dagger.android.support.DaggerFragment
import frogcorp.mightybladetools.R
import frogcorp.presentation.classes.model.ClasseSkillItemView
import frogcorp.presentation.classes.view.skills.ClasseSkillContract
import javax.inject.Inject

class FragmentClasseSkill : DaggerFragment(), ClasseSkillContract.ClasseView {

    @Inject lateinit var presenter: ClasseSkillContract.Presenter

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_classe, container, false)
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        presenter.onChosedClasse("bardo")
    }

    override fun showProgressBar() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun hideProgressBar() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun showSkillsFromClass(list: List<ClasseSkillItemView>) {
        Log.d("SKILLS", list.toString())
    }

    override fun showError() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}