package com.example.locations

import com.example.domain.interactor.LocationsInteractor
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val locationsModule = module {


    viewModel {
        LocationsViewModel(
            locationsInteractor = get()
        )
    }

    single {
        LocationsInteractor(
            apiRepository = get()
        )
    }

}