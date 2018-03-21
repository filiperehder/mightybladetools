package frogcorp.mightybladetools.injection.module

import android.app.Application
import android.content.Context
import dagger.Binds
import dagger.Module

@Module
abstract class ApplicationModule {

    @Binds
    internal abstract fun provideApplication(application: Application): Application

}