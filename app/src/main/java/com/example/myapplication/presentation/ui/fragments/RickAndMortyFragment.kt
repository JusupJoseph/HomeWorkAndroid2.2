package com.example.myapplication.presentation.ui.fragments

import android.util.Log
import androidx.fragment.app.viewModels
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.myapplication.R
import com.example.myapplication.databinding.FragmentRickAndMortyBinding
import com.example.myapplication.presentation.base.BaseFragment
import com.example.myapplication.presentation.model.toUI
import com.example.myapplication.presentation.ui.adapters.CharacterAdapter
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class RickAndMortyFragment:
BaseFragment<FragmentRickAndMortyBinding, CharacterViewModel>(R.layout.fragment_rick_and_morty) {

    override val binding by viewBinding(FragmentRickAndMortyBinding::bind)
    override val viewModel: CharacterViewModel by viewModels()
    private val characterAdapter = CharacterAdapter()

    override fun initialize() {
        setupRecyclerView()
    }

    private fun setupRecyclerView() {
        binding.rvCharacter.adapter = characterAdapter
    }

    override fun setupSubscribes() {
        viewModel.getCharacters().subscribe(
            onError = { error ->
                Log.e("RickAndMorty", "${error}", )
            },
            onSuccess ={data ->
                val mappingList = data.map { model ->
                    model.toUI()
                }
                characterAdapter.submitList(mappingList)
            }
        )
    }

}