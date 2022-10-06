package com.example.episode

import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val episodeModule = module {

    viewModel {
        EpisodeViewModel()
    }

}