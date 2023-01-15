package com.example.myapplication.data.remote.dtos

import com.google.gson.annotations.SerializedName

data class RickAndMortyResponse(
    @SerializedName("info")
    val info: Info,
    @SerializedName("results")
    val results: List<RickAndMortyModel>,
    @SerializedName("id")
    val id: Int,
    @SerializedName("name")
    val name: String,
    @SerializedName("status")
    val status: String,
    @SerializedName("species")
    val species: String,
    @SerializedName("type")
    val type: String,
    @SerializedName("gender")
    val gender: String,
    @SerializedName("image")
    val image: String,
)
