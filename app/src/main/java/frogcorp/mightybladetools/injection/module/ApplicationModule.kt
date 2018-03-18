package frogcorp.mightybladetools.injection.module

import android.app.Application
import dagger.Binds
import dagger.Module

@Module
abstract class ApplicationModule {

    @Binds
    internal abstract fun provideApplication(application: Application): Application
}