package com.example.courseprojectrickandmorty.app

import com.example.characters.charactersModule
import com.example.data.databaseModule
import com.example.domain.apiModule
import com.example.episodes.episodesModule
import com.example.locations.locationsModule

val modules = listOf(
    apiModule,
    databaseModule,
    locationsModule,
    charactersModule,
    episodesModule
)