package com.example.location

import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val locationModule = module {

    viewModel {
        LocationViewModel()
    }

}