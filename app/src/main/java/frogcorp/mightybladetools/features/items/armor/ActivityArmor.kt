package frogcorp.mightybladetools.features.items.armor

import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.util.Log
import dagger.android.support.DaggerAppCompatActivity
import frogcorp.mightybladetools.R
import frogcorp.presentation.items.view.armor.ItemsArmorContract
import frogcorp.presentation.items.model.ArmorItemView
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class ActivityArmor : DaggerAppCompatActivity(), ItemsArmorContract.ArmorView {

    @Inject lateinit var presenter : ItemsArmorContract.Presenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initView()
    }

    override fun onDestroy() {
        super.onDestroy()
        presenter.onStop()
    }

    override fun showArmorDetail(item: ArmorItemView) {
        Log.d("detail", item.toString())
    }

    private fun initView() {
        rvArmors.layoutManager = LinearLayoutManager(this)
        presenter.onStart()
    }


    override fun showArmorList(list: List<ArmorItemView>) {
        rvArmors.adapter = AdapterArmor(this, list)
    }
}