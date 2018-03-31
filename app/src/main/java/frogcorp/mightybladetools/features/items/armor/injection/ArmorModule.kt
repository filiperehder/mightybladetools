package frogcorp.mightybladetools.features.items.armor.injection

import dagger.Module
import dagger.Provides
import frogcorp.domain.items.interactor.GetArmors
import frogcorp.mightybladetools.features.items.armor.FragmentArmor
import frogcorp.presentation.items.view.armor.ItemsArmorContract
import frogcorp.presentation.items.view.armor.ItemsArmorPresenter

@Module
class ArmorModule {

    @Provides
    fun providePresenter(view: ItemsArmorContract.ArmorView,
                         getArmors: GetArmors) : ItemsArmorContract.Presenter {
        return ItemsArmorPresenter(view, getArmors)
    }

    @Provides
    fun provideView(view: FragmentArmor) : ItemsArmorContract.ArmorView = view
}