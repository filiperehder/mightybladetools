package frogcorp.mightybladetools.injection.module

import dagger.Module
import dagger.Provides
import frogcorp.remote.ApiService
import retrofit2.Retrofit

@Module
class ApiModule {

    @Provides
    fun provideService(retrofit: Retrofit) : ApiService = retrofit.create(ApiService::class.java)
}