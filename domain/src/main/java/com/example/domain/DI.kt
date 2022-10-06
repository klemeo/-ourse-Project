package com.example.domain

import org.koin.dsl.module

val apiModule = module {

    single<ApiRepository> {
        ApiRepositoryImpl(
            apiResponseDataSource = get()
        )
    }

}