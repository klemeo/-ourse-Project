package com.example.data

import com.example.data.model.responses.CharactersResponse
import com.example.data.model.responses.CharacterResponse
import com.example.data.model.responses.EpisodesResponse
import com.example.data.model.responses.EpisodeResponse
import com.example.data.model.responses.LocationsResponse
import com.example.data.model.responses.LocationResponse
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class PostResponseDataSource {

    fun getCharacters(page: Int?): Flow<CharactersResponse> = flow {
        emit(
            PostApiClient.getApiClient().getCharacters(page)
        )
    }

    fun getCharacter(id: Int): Flow<CharacterResponse> = flow {
        emit(
            PostApiClient.getApiClient().getCharacter(id)
        )
    }

    fun getLocations(page: Int?): Flow<LocationsResponse> = flow {
        emit(
            PostApiClient.getApiClient().getLocations(page)
        )
    }

    fun getLocation(id: Int): Flow<LocationResponse> = flow {
        emit(
            PostApiClient.getApiClient().getLocation(id)
        )
    }

    fun getEpisodes(page: Int?): Flow<EpisodesResponse> = flow {
        emit(
            PostApiClient.getApiClient().getEpisodes(page)
        )
    }

    fun getEpisode(id: Int): Flow<EpisodeResponse> = flow {
        emit(
            PostApiClient.getApiClient().getEpisode(id)
        )
    }

}