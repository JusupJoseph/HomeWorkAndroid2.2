package com.example.myapplication.domain.repositories

import com.example.myapplication.data.remote.dtos.RickAndMortyModel
import com.example.myapplication.domain.either.Either
import com.example.myapplication.domain.models.CharactersModel
import kotlinx.coroutines.flow.Flow

interface RickAndMortyRepositories {
    fun getRickAndMortyList(): Flow<Either<String, List<CharactersModel>>>
}