package frogcorp.mightybladetools.features.items.armor

import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import dagger.android.support.DaggerFragment
import frogcorp.mightybladetools.R
import frogcorp.presentation.items.model.ArmorItemView
import frogcorp.presentation.items.view.armor.ItemsArmorContract
import io.reactivex.Single
import kotlinx.android.synthetic.main.fragment_armor.*
import retrofit2.HttpException
import java.net.ConnectException
import javax.inject.Inject

class FragmentArmor : DaggerFragment(), ItemsArmorContract.ArmorView {

    @Inject lateinit var presenter : ItemsArmorContract.Presenter

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        return inflater.inflate(R.layout.fragment_armor, container, false)
    }

    override fun showProgressBar() {
        progressBar.visibility = View.VISIBLE
    }

    override fun hideProgressBar() {
        progressBar.visibility = View.GONE
    }

    private fun initView() {
        rvArmors.layoutManager = LinearLayoutManager(this.activity)
        presenter.onStart()
    }
    override fun showError() {
        // TODO
    }

    override fun onDestroy() {
        super.onDestroy()
        presenter.onStop()
    }

    override fun showArmorList(list: List<ArmorItemView>) {
        rvArmors.adapter = AdapterArmor(this.activity, list)
    }
}