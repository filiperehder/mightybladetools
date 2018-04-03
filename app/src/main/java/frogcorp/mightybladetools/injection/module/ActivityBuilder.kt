package frogcorp.mightybladetools.injection.module

import dagger.Module
import dagger.android.ContributesAndroidInjector
import frogcorp.mightybladetools.features.home.ActivityHome
import frogcorp.mightybladetools.features.items.armor.FragmentArmor
import frogcorp.mightybladetools.features.items.armor.injection.ArmorModule
import frogcorp.mightybladetools.features.items.injection.ItemsModule
import frogcorp.mightybladetools.features.races.FragmentRace
import frogcorp.mightybladetools.features.races.di.RacesModule
import frogcorp.mightybladetools.injection.scope.PerFragment

@Module
abstract class ActivityBuilder {

    @PerFragment
    @ContributesAndroidInjector(modules = [ItemsModule::class, ArmorModule::class])
    internal abstract fun bindArmorFragment(): FragmentArmor

    @ContributesAndroidInjector
    internal abstract fun bindHomeActivity(): ActivityHome

    @ContributesAndroidInjector(modules = [RacesModule::class])
    internal abstract fun bindRaceFragment(): FragmentRace
}