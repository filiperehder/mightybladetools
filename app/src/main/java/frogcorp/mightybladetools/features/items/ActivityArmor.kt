package frogcorp.mightybladetools.features.items

import android.os.Bundle
import android.util.Log
import dagger.android.support.DaggerAppCompatActivity
import frogcorp.mightybladetools.R
import frogcorp.presentation.items.ItemsArmorContract
import frogcorp.presentation.items.model.ArmorItemView
import javax.inject.Inject

class ActivityArmor : DaggerAppCompatActivity(), ItemsArmorContract.ArmorView {

    @Inject lateinit var presenter : ItemsArmorContract.Presenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        presenter.onStart()
    }

    override fun onDestroy() {
        super.onDestroy()
        presenter.onStop()
    }

    override fun showArmorDetail(item: ArmorItemView) {
        Log.d("detail", item.toString())
    }

    override fun showArmorList(list: List<ArmorItemView>) {
        Log.d("items", list.toString())
    }


}