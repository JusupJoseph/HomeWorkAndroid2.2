package com.example.myapplication.data.remote.dtos

import com.example.myapplication.domain.models.CharactersModel
import com.google.gson.annotations.SerializedName

data class RickAndMortyModel(
    @SerializedName("episode")
    val episode: List<String>,
    @SerializedName("gender")
    val gender: String,
    @SerializedName("id")
    val id: Int,
    @SerializedName("image")
    val image: String,
    @SerializedName("location")
    val location: Location,
    @SerializedName("name")
    val name: String,
    @SerializedName("origin")
    val origin: Origin,
    @SerializedName("species")
    val species: String,
    @SerializedName("status")
    val status: String,
    @SerializedName("type")
    val type: String,
    @SerializedName("url")
    val url: String
)

fun RickAndMortyModel.toDomain() = CharactersModel(
    id = id,
    name = name,
    image = image
)