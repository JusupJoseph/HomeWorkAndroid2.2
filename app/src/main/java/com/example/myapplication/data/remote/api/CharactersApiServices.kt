package com.example.myapplication.data.remote.api

import com.example.myapplication.data.remote.dtos.RickAndMortyResponse
import retrofit2.http.GET

interface CharactersApiServices {
    @GET("character")
    suspend fun fetchCharacters(): RickAndMortyResponse
}