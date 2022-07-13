package com.example.data

import com.example.data.model.character_body.CharacterResponsesBody
import com.example.data.model.character_body.CharacterResultResponsesBody
import com.example.data.model.episode_body.EpisodeResponsesBody
import com.example.data.model.episode_body.EpisodeResultResponsesBody
import com.example.data.model.location_body.LocationResponsesBody
import com.example.data.model.location_body.LocationResultResponsesBody
import kotlinx.coroutines.flow.Flow

interface ApiRepository {

    fun getCharacters(page: Int?): Flow<CharacterResponsesBody>

    fun getCharacter(id: Int): Flow<CharacterResultResponsesBody>

    fun getLocations(page: Int?): Flow<LocationResponsesBody>

    fun getLocation(id: Int): Flow<LocationResultResponsesBody>

    fun getEpisodes(page: Int?): Flow<EpisodeResponsesBody>

    fun getEpisode(id: Int): Flow<EpisodeResultResponsesBody>

}