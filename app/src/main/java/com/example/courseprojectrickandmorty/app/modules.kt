package com.example.courseprojectrickandmorty.app

import com.example.data.ApiRepositoryImpl
import com.example.data.PostResponseDataSource
import com.example.domain.ApiRepository
import com.example.domain.interactor.*
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

val modules = listOf(postModule)