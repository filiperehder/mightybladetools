package frogcorp.mightybladetools.features.races.di

import dagger.Module
import dagger.Provides
import frogcorp.data.races.RacesDataRepository
import frogcorp.data.races.repository.RacesRemote
import frogcorp.data.races.source.RacesDataStoreFactory
import frogcorp.domain.races.interactor.GetRaces
import frogcorp.domain.races.repository.RacesRepository
import frogcorp.mightybladetools.features.races.ActivityRaceDetail
import frogcorp.presentation.races.view.RaceContract
import frogcorp.presentation.races.view.RacesPresenter
import frogcorp.remote.ApiService
import frogcorp.remote.races.RacesRemoteImpl


@Module
class RacesModule {

    @Provides
    fun providesRepository(factory: RacesDataStoreFactory) : RacesRepository {
        return RacesDataRepository(factory)
    }

    @Provides
    fun provideRemote(apiService: ApiService) : RacesRemote {
        return RacesRemoteImpl(apiService)
    }

    @Provides
    fun providesPresenter(view: RaceContract.RaceView,
                          getRaces: GetRaces) : RaceContract.Presenter {
        return RacesPresenter(view, getRaces)
    }

    @Provides
    fun provideView(view: ActivityRaceDetail) : RaceContract.RaceView = view
}