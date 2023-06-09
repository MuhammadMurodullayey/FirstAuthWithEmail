package uz.gita.myemailauthentificationapp1.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import uz.gita.myemailauthentificationapp1.domain.AppRepository
import uz.gita.myemailauthentificationapp1.domain.impl.AppRepositoryImpl
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
interface RepositoryModule {
    @[Singleton Binds]
    fun getRepository(impl: AppRepositoryImpl) : AppRepository



}