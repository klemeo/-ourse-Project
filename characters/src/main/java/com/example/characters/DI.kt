package com.example.characters

import com.example.domain.interactor.CharactersInteractor
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val charactersModule = module {

    viewModel {
        CharactersViewModel(
            charactersInteractor = get()
        )
    }

    single {
        CharactersInteractor(
            apiRepository = get()
        )
    }

}