package frogcorp.mightybladetools.features.classes.di

import dagger.Module
import dagger.Provides
import frogcorp.data.classes.ClassesDataRepository
import frogcorp.data.classes.repository.ClasseRemote
import frogcorp.data.classes.source.ClassesDataStoreFactory
import frogcorp.domain.classes.interactor.GetClasses
import frogcorp.domain.classes.repository.ClasseRepository
import frogcorp.mightybladetools.features.classes.FragmentClasse
import frogcorp.presentation.classes.view.ClasseContract
import frogcorp.presentation.classes.view.ClassePresenter
import frogcorp.remote.ApiService
import frogcorp.remote.classes.ClassesRemoteImpl

@Module
class ClassesModule {

    @Provides
    fun providesRepository(factory: ClassesDataStoreFactory) : ClasseRepository {
        return ClassesDataRepository(factory)
    }

    @Provides
    fun provideRemote(apiService: ApiService) : ClasseRemote {
        return ClassesRemoteImpl(apiService)
    }

    @Provides
    fun providePresenter(view: ClasseContract.ClasseView, getClasses: GetClasses) : ClasseContract.Presenter {
        return ClassePresenter(view, getClasses)
    }

    @Provides
    fun provideView(view: FragmentClasse) : ClasseContract.ClasseView {
        return view
    }


}