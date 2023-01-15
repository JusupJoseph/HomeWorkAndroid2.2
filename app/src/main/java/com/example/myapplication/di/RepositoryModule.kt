package com.example.myapplication.di

import com.example.myapplication.data.repositories.RickAndMortyRepositoriesImpl
import com.example.myapplication.domain.repositories.RickAndMortyRepositories
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
interface RepositoryModule {

    @Binds
    fun bindCharacterRepository(rickAndMortyRepositories: RickAndMortyRepositoriesImpl):RickAndMortyRepositories
}