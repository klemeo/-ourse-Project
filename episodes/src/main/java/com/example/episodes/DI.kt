package com.example.episodes

import com.example.domain.interactor.EpisodesInteractor
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val episodesModule = module {

    viewModel {
        EpisodesViewModel(
            episodesInteractor = get()
        )
    }

    single {
        EpisodesInteractor(
            apiRepository = get()
        )
    }
}