package frogcorp.mightybladetools.injection.module

import dagger.Module
import dagger.android.ContributesAndroidInjector
import frogcorp.mightybladetools.features.items.armor.ActivityArmor
import frogcorp.mightybladetools.features.items.armor.injection.ArmorModule
import frogcorp.mightybladetools.features.items.injection.ItemsModule
import frogcorp.mightybladetools.features.items.range.ActivityWeaponRange
import frogcorp.mightybladetools.features.items.range.injection.WeaponRangeModule

@Module
abstract class ActivityBuilder {

    @ContributesAndroidInjector(modules = [ItemsModule::class, ArmorModule::class])
    internal abstract fun bindArmorActivity(): ActivityArmor

    @ContributesAndroidInjector(modules = [ItemsModule::class, WeaponRangeModule::class])
    internal abstract fun bindWeaponRangeActivity() : ActivityWeaponRange
}