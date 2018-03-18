package frogcorp.mightybladetools

import dagger.android.AndroidInjector
import dagger.android.DaggerApplication
import frogcorp.mightybladetools.injection.component.DaggerApplicationComponent

class MbToolsApplication : DaggerApplication() {

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        val appComponent = DaggerApplicationComponent.builder().application(this).build()
        appComponent.inject(this)
        return appComponent
    }

}