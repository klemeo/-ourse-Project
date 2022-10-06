package com.example.character

import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val characterModule = module {

    viewModel {
        CharacterViewModel()
    }

}