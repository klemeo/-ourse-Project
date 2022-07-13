package com.example.data

import com.example.data.model.character_data.CharacterResponsesBodyData
import com.example.data.model.character_data.CharacterResultResponsesBodyData
import com.example.data.model.episode_data.EpisodeResponsesBodyData
import com.example.data.model.episode_data.EpisodeResultResponsesBodyData
import com.example.data.model.location_responses.LocationResponsesBodyData
import com.example.data.model.location_responses.LocationResultResponsesBodyData
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class PostResponseDataSource {

    fun getCharacters(page: Int?): Flow<CharacterResponsesBodyData> = flow {
        emit(
            PostApiClient.getApiClient().getCharacters(page)
        )
    }

    fun getCharacter(id: Int): Flow<CharacterResultResponsesBodyData> = flow {
        emit(
            PostApiClient.getApiClient().getCharacter(id)
        )
    }

    fun getLocations(page: Int?): Flow<LocationResponsesBodyData> = flow {
        emit(
            PostApiClient.getApiClient().getLocations(page)
        )
    }

    fun getLocation(id: Int): Flow<LocationResultResponsesBodyData> = flow {
        emit(
            PostApiClient.getApiClient().getLocation(id)
        )
    }

    fun getEpisodes(page: Int?): Flow<EpisodeResponsesBodyData> = flow {
        emit(
            PostApiClient.getApiClient().getEpisodes(page)
        )
    }

    fun getEpisode(id: Int): Flow<EpisodeResultResponsesBodyData> = flow {
        emit(
            PostApiClient.getApiClient().getEpisode(id)
        )
    }

}