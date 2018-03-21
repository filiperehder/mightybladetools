package frogcorp.mightybladetools.injection.module

import android.arch.persistence.room.Room
import dagger.Module
import dagger.Provides
import frogcorp.cache.AppDatabase
import frogcorp.mightybladetools.MbToolsApplication
import javax.inject.Singleton

@Module
class CacheModule {

    @Provides
    @Singleton
    fun provideDataBase(context: MbToolsApplication) : AppDatabase {
        return Room.databaseBuilder(context.applicationContext, AppDatabase::class.java, "TEMPDB").build()
    }

}