package frogcorp.mightybladetools.features.home

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import frogcorp.mightybladetools.MainActivity
import frogcorp.mightybladetools.R
import frogcorp.mightybladetools.features.items.armor.ActivityArmor
import frogcorp.mightybladetools.features.items.range.ActivityWeaponRange
import frogcorp.presentation.home.HomeContract
import kotlinx.android.synthetic.main.activity_home.*

class ActivityHome : AppCompatActivity(), HomeContract.HomeView {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        initView()
    }

    private fun initView() {
        buttonArmor.setOnClickListener {
            openArmorActivity()
        }

        buttonWeapon.setOnClickListener {
            openWeaponRangeActivity()
        }
    }

    private fun openArmorActivity() {
        val intentToLaunch = Intent(applicationContext, ActivityArmor::class.java)
        startActivity(intentToLaunch)
    }

    private fun openWeaponRangeActivity() {
        val intentToLaunch = Intent(applicationContext, ActivityWeaponRange::class.java)
        startActivity(intentToLaunch)
    }
}