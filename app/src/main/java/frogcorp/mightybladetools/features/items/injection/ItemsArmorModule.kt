package frogcorp.mightybladetools.features.items.injection

import dagger.Module
import dagger.Provides
import frogcorp.data.items.ItemsDataRepository
import frogcorp.data.items.repository.ItemsRemote
import frogcorp.data.items.source.ItemsDataStoreFactory
import frogcorp.domain.items.interactor.GetArmors
import frogcorp.domain.items.repository.ItemsRepository
import frogcorp.mightybladetools.features.items.ActivityArmor
import frogcorp.presentation.items.ItemsArmorContract
import frogcorp.presentation.items.ItemsArmorPresenter
import frogcorp.remote.ApiService
import frogcorp.remote.items.ItemsRemoteImpl

@Module
class ItemsArmorModule {

    @Provides
    fun providePresenter(view: ItemsArmorContract.ArmorView,
                         getArmors: GetArmors) : ItemsArmorContract.Presenter {
        return ItemsArmorPresenter(view, getArmors)
    }

    @Provides
    fun provideView(view: ActivityArmor) : ItemsArmorContract.ArmorView = view

    @Provides
    fun providesRepository(factory: ItemsDataStoreFactory) : ItemsRepository {
        return ItemsDataRepository(factory)
    }

    @Provides
    fun provideItemsRemote(service: ApiService) : ItemsRemote {
        return ItemsRemoteImpl(service)
    }
}