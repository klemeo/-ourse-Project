package com.example.data

import com.example.data.db.Database
import com.example.data.db.ProjectDatabase
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module

val databaseModule = module {

    single {
        PostResponseDataSource()
    }

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