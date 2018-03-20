package frogcorp.mightybladetools.features.items.range

import android.os.Bundle
import android.util.Log
import dagger.android.support.DaggerAppCompatActivity
import frogcorp.mightybladetools.R
import frogcorp.presentation.items.model.WeaponRangeItemView
import frogcorp.presentation.items.view.range.WeaponRangeContract
import javax.inject.Inject

class ActivityWeaponRange : DaggerAppCompatActivity(), WeaponRangeContract.WeaponRangeView {

    @Inject lateinit var presenter: WeaponRangeContract.Presenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_weapon_range)

        presenter.onStart()
    }

    override fun onDestroy() {
        super.onDestroy()
        presenter.onStop()
    }

    override fun showWeaponRangedList(list: List<WeaponRangeItemView>) {
        Log.d("RangeWeapons List", list.toString())
    }

    override fun showWeaponRangedDetail(item: WeaponRangeItemView) {
        Log.d("RangeWeapons Detail", item.toString())
    }
}