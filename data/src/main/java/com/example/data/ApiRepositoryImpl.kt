package com.example.data

import com.example.data.mapper.*
import kotlinx.coroutines.flow.Flow
import com.example.data.model.character_body.CharacterResponsesBody
import com.example.data.model.character_body.CharacterResultResponsesBody
import com.example.data.model.episode_body.EpisodeResponsesBody
import com.example.data.model.episode_body.EpisodeResultResponsesBody
import com.example.data.model.location_body.LocationResponsesBody
import com.example.data.model.location_body.LocationResultResponsesBody
import kotlinx.coroutines.flow.map

class ApiRepositoryImpl(
    private val apiResponseDataSource: PostResponseDataSource
) : ApiRepository {

    private val charactersDataMapper by lazy { CharactersDataMapper() }
    private val characterDataMapper by lazy { CharacterDataMapper() }

    private val episodesDataMapper by lazy { EpisodesDataMapper() }
    private val episodeDataMapper by lazy { EpisodeDataMapper() }

    private val locationsDataMapper by lazy { LocationsDataMapper() }
    private val locationDataMapper by lazy { LocationDataMapper() }


    override fun getCharacters(page: Int?): Flow<CharacterResponsesBody> =
        apiResponseDataSource.getCharacters(page).map {
            charactersDataMapper.map(it)
        }

    override fun getCharacter(id: Int): Flow<CharacterResultResponsesBody> =
        apiResponseDataSource.getCharacter(id).map {
            characterDataMapper.map(it)
        }

    override fun getLocations(page: Int?): Flow<LocationResponsesBody> =
        apiResponseDataSource.getLocations(page).map {
            locationsDataMapper.map(it)
        }

    override fun getLocation(id: Int): Flow<LocationResultResponsesBody> =
        apiResponseDataSource.getLocation(id).map {
            locationDataMapper.map(it)
        }

    override fun getEpisodes(page: Int?): Flow<EpisodeResponsesBody> =
        apiResponseDataSource.getEpisodes(page).map {
            episodesDataMapper.map(it)
        }

    override fun getEpisode(id: Int): Flow<EpisodeResultResponsesBody> =
        apiResponseDataSource.getEpisode(id).map {
            episodeDataMapper.map(it)
        }

}