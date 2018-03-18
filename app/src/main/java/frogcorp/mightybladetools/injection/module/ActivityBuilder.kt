package frogcorp.mightybladetools.injection.module

import dagger.Module
import dagger.android.ContributesAndroidInjector
import frogcorp.mightybladetools.features.items.ActivityArmor
import frogcorp.mightybladetools.features.items.injection.ItemsArmorModule

@Module
abstract class ActivityBuilder {

    @ContributesAndroidInjector(modules = [(ItemsArmorModule::class)])
    internal abstract fun bindArmorActivity(): ActivityArmor
}