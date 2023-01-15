package com.example.myapplication.presentation.model

import com.example.myapplication.domain.models.CharactersModel
import com.example.myapplication.presentation.base.IBaseDiffModel

data class CharacterModelUI(
    override val id: Int,
    val name: String,
    val image: String

):IBaseDiffModel<Int>

fun CharactersModel.toUI() = CharacterModelUI(
    id = id,
    name = name,
    image = image
)
