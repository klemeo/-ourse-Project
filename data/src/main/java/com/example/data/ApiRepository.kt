package com.example.data

import com.example.data.model.result.Characters
import com.example.data.model.result.Character
import com.example.data.model.result.Episodes
import com.example.data.model.result.Episode
import com.example.data.model.result.Locations
import com.example.data.model.result.Location
import kotlinx.coroutines.flow.Flow

interface ApiRepository {

    fun getCharacters(page: Int?): Flow<Characters>

    fun getCharacter(id: Int): Flow<Character>

    fun getLocations(page: Int?): Flow<Locations>

    fun getLocation(id: Int): Flow<Location>

    fun getEpisodes(page: Int?): Flow<Episodes>

    fun getEpisode(id: Int): Flow<Episode>

}