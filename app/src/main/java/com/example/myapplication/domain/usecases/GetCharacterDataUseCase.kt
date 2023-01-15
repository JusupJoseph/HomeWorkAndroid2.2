package com.example.myapplication.domain.usecases

import com.example.myapplication.domain.repositories.RickAndMortyRepositories
import javax.inject.Inject

class GetCharacterDataUseCase @Inject constructor(
    private val repositories: RickAndMortyRepositories
) {
    operator fun invoke() = repositories.getRickAndMortyList()
}