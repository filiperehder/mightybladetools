package frogcorp.mightybladetools.injection.module

import dagger.Module
import dagger.android.ContributesAndroidInjector
import frogcorp.mightybladetools.features.classes.FragmentClasse
import frogcorp.mightybladetools.features.classes.FragmentClasseSkill
import frogcorp.mightybladetools.features.classes.di.ClassesModule
import frogcorp.mightybladetools.features.classes.di.ClassesSkillsModule
import frogcorp.mightybladetools.features.home.ActivityHome
import frogcorp.mightybladetools.features.items.armor.FragmentArmor
import frogcorp.mightybladetools.features.items.armor.injection.ArmorModule
import frogcorp.mightybladetools.features.items.injection.ItemsModule
import frogcorp.mightybladetools.features.races.FragmentRace
import frogcorp.mightybladetools.features.races.ActivityRaceDetail
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
    internal abstract fun bindDetailRaceFragment(): ActivityRaceDetail

    @ContributesAndroidInjector
    internal abstract fun bindRaceFragment() : FragmentRace

    @ContributesAndroidInjector(modules = [ClassesModule::class])
    internal abstract fun bindClasseFragment() : FragmentClasse

    @ContributesAndroidInjector(modules = [ClassesModule::class, ClassesSkillsModule::class])
    internal abstract fun bindClasseSkillFragment() : FragmentClasseSkill

}