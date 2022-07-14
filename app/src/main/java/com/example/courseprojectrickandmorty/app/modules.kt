package com.example.courseprojectrickandmorty.app

import com.example.courseprojectrickandmorty.ui.characters.CharactersViewModel
import com.example.data.ApiRepositoryImpl
import com.example.data.PostResponseDataSource
import com.example.data.db.*
import com.example.domain.ApiRepository
import com.example.domain.interactor.*
import org.koin.android.ext.koin.androidContext
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

private val postModule = module {

    single {
        CharactersInteractor(
            apiRepository = get()
        )
    }
    single {
        CharacterInteractor(
            apiRepository = get()
        )
    }
    single {
        EpisodesInteractor(
            apiRepository = get()
        )
    }
    single {
        EpisodeInteractor(
            apiRepository = get()
        )
    }
    single {
        LocationsInteractor(
            apiRepository = get()
        )
    }
    single {
        LocationInteractor(
            apiRepository = get()
        )
    }

    single<ApiRepository> {
        ApiRepositoryImpl(
            apiResponseDataSource = get()
        )
    }

    single {
        PostResponseDataSource()
    }

}

private val viewModule = module {

    viewModel {
        CharactersViewModel(
            charactersInteractor = get()
        )
    }

}

private val databaseModule = module {

    single {
        Database.build(androidContext())
    }

    single {
        get<ProjectDatabase>().charactersDao()
    }

    single {
        get<ProjectDatabase>().episodesDao()
    }

    single {
        get<ProjectDatabase>().locationsDao()
    }
}

val modules = listOf(postModule, databaseModule, viewModule)