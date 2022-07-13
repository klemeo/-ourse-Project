package com.example.domain

import com.example.domain.model.*
import kotlinx.coroutines.flow.Flow

interface ApiRepository {

    fun getCharacters(page: Int?): Flow<Characters>

    fun getCharacter(id: Int): Flow<Character>

    fun getLocations(page: Int?): Flow<Locations>

    fun getLocation(id: Int): Flow<Location>

    fun getEpisodes(page: Int?): Flow<Episodes>

    fun getEpisode(id: Int): Flow<Episode>

}