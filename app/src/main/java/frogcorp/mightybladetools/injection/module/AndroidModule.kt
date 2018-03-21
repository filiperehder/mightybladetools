package frogcorp.mightybladetools.injection.module

import android.app.Application
import android.content.Context
import dagger.Module
import dagger.Provides
import io.reactivex.Scheduler
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers
import javax.inject.Named


@Module
class AndroidModule {

    @Provides
    @Named("AndroidScheduler")
    fun provideMainScheduler(): Scheduler {
        return AndroidSchedulers.mainThread()
    }

    @Provides
    @Named("SchedulerIO")
    fun provideIoScheduler(): Scheduler {
        return Schedulers.io()
    }

    @Provides
    @Named("CompositeDisposable" )
    fun provideCompositeDisposable() : CompositeDisposable {
        return CompositeDisposable()
    }
}