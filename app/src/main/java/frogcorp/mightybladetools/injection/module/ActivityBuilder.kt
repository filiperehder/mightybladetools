package frogcorp.mightybladetools.injection.module

import dagger.Module
import dagger.android.ContributesAndroidInjector
import frogcorp.mightybladetools.features.items.ActivityArmor
import frogcorp.mightybladetools.features.items.injection.ItemsModule

@Module
abstract class ActivityBuilder {

    @ContributesAndroidInjector(modules = [(ItemsModule::class)])
    internal abstract fun bindArmorActivity(): ActivityArmor
}