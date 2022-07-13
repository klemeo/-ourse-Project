package com.example.data

import com.example.data.mapper.*
import kotlinx.coroutines.flow.Flow
import com.example.data.model.result.Characters
import com.example.data.model.result.Character
import com.example.data.model.result.Episodes
import com.example.data.model.result.Episode
import com.example.data.model.result.Locations
import com.example.data.model.result.Location
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


    override fun getCharacters(page: Int?): Flow<Characters> =
        apiResponseDataSource.getCharacters(page).map {
            charactersDataMapper.map(it)
        }

    override fun getCharacter(id: Int): Flow<Character> =
        apiResponseDataSource.getCharacter(id).map {
            characterDataMapper.map(it)
        }

    override fun getLocations(page: Int?): Flow<Locations> =
        apiResponseDataSource.getLocations(page).map {
            locationsDataMapper.map(it)
        }

    override fun getLocation(id: Int): Flow<Location> =
        apiResponseDataSource.getLocation(id).map {
            locationDataMapper.map(it)
        }

    override fun getEpisodes(page: Int?): Flow<Episodes> =
        apiResponseDataSource.getEpisodes(page).map {
            episodesDataMapper.map(it)
        }

    override fun getEpisode(id: Int): Flow<Episode> =
        apiResponseDataSource.getEpisode(id).map {
            episodeDataMapper.map(it)
        }

}