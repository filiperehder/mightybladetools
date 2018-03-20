package frogcorp.mightybladetools.features.items.injection

import dagger.Module
import dagger.Provides
import frogcorp.data.items.ItemsDataRepository
import frogcorp.data.items.repository.ItemsRemote
import frogcorp.data.items.source.ItemsDataStoreFactory
import frogcorp.domain.items.interactor.GetArmors
import frogcorp.domain.items.repository.ItemsRepository
import frogcorp.mightybladetools.features.items.armor.ActivityArmor
import frogcorp.presentation.items.view.armor.ItemsArmorContract
import frogcorp.presentation.items.view.armor.ItemsArmorPresenter
import frogcorp.remote.ApiService
import frogcorp.remote.items.ItemsRemoteImpl

@Module
class ItemsModule {

    @Provides
    fun providesRepository(factory: ItemsDataStoreFactory) : ItemsRepository {
        return ItemsDataRepository(factory)
    }

    @Provides
    fun provideItemsRemote(service: ApiService) : ItemsRemote {
        return ItemsRemoteImpl(service)
    }
}