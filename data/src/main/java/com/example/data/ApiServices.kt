package com.example.data

import com.example.data.model.responses.CharactersResponse
import com.example.data.model.responses.CharacterResponse
import com.example.data.model.responses.EpisodesResponse
import com.example.data.model.responses.EpisodeResponse
import com.example.data.model.responses.LocationsResponse
import com.example.data.model.responses.LocationResponse
import retrofit2.http.*

interface ApiServices {

    @GET("character")
    suspend fun getCharacters(
        @Query("page") page: Int?
    ): CharactersResponse

    @GET("character/{id}")
    suspend fun getCharacter(
        @Path("id") id: Int
    ): CharacterResponse

    @GET("location")
    suspend fun getLocations(
        @Query("page") page: Int?
    ): LocationsResponse

    @GET("location/{id}")
    suspend fun getLocation(
        @Path("id") id: Int
    ): LocationResponse

    @GET("episode")
    suspend fun getEpisodes(
        @Query("page") page: Int?
    ): EpisodesResponse

    @GET("episode/{id}")
    suspend fun getEpisode(
        @Path("id") id: Int
    ): EpisodeResponse

}