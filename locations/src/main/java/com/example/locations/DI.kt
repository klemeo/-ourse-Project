package com.example.locations

import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val locationsModule = module {


    viewModel {
        LocationsViewModel(
            locationsInteractor = get()
        )
    }

}