package frogcorp.mightybladetools.features.items.range.injection

import dagger.Module
import dagger.Provides
import frogcorp.domain.items.interactor.GetWeaponRange
import frogcorp.mightybladetools.features.items.range.ActivityWeaponRange
import frogcorp.presentation.items.view.range.WeaponRangeContract
import frogcorp.presentation.items.view.range.WeaponRangePresenter

@Module
class WeaponRangeModule {

    @Provides
    fun providePresenter(view: WeaponRangeContract.WeaponRangeView,
                         getWeaponRange: GetWeaponRange) : WeaponRangeContract.Presenter {
        return WeaponRangePresenter(view, getWeaponRange)
    }

    @Provides
    fun provideView(view: ActivityWeaponRange) : WeaponRangeContract.WeaponRangeView = view
}