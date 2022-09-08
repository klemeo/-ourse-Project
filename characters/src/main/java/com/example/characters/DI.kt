package com.example.characters

import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val charactersModule = module {

    viewModel {
        CharactersViewModel(
            charactersInteractor = get()
        )
    }

}