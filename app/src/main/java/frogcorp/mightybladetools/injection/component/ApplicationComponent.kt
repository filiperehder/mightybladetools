package frogcorp.mightybladetools.injection.component

import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import frogcorp.mightybladetools.MbToolsApplication
import frogcorp.mightybladetools.injection.module.*
import javax.inject.Singleton

@Singleton
@Component(modules = ([AndroidSupportInjectionModule::class, ClientModule::class, ActivityBuilder::class,
                       ApiModule::class, ApplicationModule::class, AndroidModule::class]))

interface ApplicationComponent : AndroidInjector<MbToolsApplication> {

    override fun inject(instance: MbToolsApplication)

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun application(application: MbToolsApplication): Builder
        fun build(): ApplicationComponent
    }
}