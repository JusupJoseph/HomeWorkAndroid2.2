package com.example.myapplication.data.repositories

import com.example.myapplication.data.base.BaseRepository
import com.example.myapplication.data.remote.api.CharactersApiServices
import com.example.myapplication.data.remote.dtos.toDomain
import com.example.myapplication.domain.repositories.RickAndMortyRepositories
import javax.inject.Inject

class RickAndMortyRepositoriesImpl @Inject constructor(
    private val apiServices: CharactersApiServices
) : BaseRepository() , RickAndMortyRepositories{

    override fun getRickAndMortyList() = doRequest {
        apiServices.fetchCharacters().results.map {
            it.toDomain()
        }
    }
}