package uz.gita.myemailauthentificationapp1.di

import android.content.Context
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import uz.gita.myemailauthentificationapp1.data.local.MySharedPref
import javax.inject.Singleton
@Module
@InstallIn(SingletonComponent::class)
class LocalModule {
    @[Provides Singleton]
    fun getPref(@ApplicationContext context: Context) = MySharedPref(context)

}