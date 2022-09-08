package com.example.episodes

import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val episodesModule = module {

    viewModel {
        EpisodesViewModel(
            episodesInteractor = get()
        )
    }
}