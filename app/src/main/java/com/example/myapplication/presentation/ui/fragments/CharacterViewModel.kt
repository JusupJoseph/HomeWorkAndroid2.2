package com.example.myapplication.presentation.ui.fragments

import androidx.lifecycle.ViewModel
import com.example.myapplication.domain.usecases.GetCharacterDataUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class CharacterViewModel @Inject constructor(
    private val getCharacterDataUseCase: GetCharacterDataUseCase
): ViewModel(){
    fun getCharacters() = getCharacterDataUseCase()
}