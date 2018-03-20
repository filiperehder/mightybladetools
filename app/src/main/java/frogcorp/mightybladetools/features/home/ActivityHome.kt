package frogcorp.mightybladetools.features.home

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import frogcorp.mightybladetools.MainActivity
import frogcorp.mightybladetools.R
import frogcorp.mightybladetools.features.items.armor.ActivityArmor
import frogcorp.presentation.home.HomeContract
import kotlinx.android.synthetic.main.activity_home.*

class ActivityHome : AppCompatActivity(), HomeContract.HomeView {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        buttonArmor.setOnClickListener {
            val intentToLaunch = Intent(applicationContext, ActivityArmor::class.java)
            startActivity(intentToLaunch)
        }
    }

    override fun showMenu() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun hideMenu() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun openActivity(activity: Activity) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}