package com.example.data

import com.example.data.model.character_data.CharacterResponsesBodyData
import com.example.data.model.character_data.CharacterResultResponsesBodyData
import com.example.data.model.episode_data.EpisodeResponsesBodyData
import com.example.data.model.episode_data.EpisodeResultResponsesBodyData
import com.example.data.model.location_responses.LocationResponsesBodyData
import com.example.data.model.location_responses.LocationResultResponsesBodyData
import retrofit2.http.*

interface ApiServices {

    @GET("character")
    suspend fun getCharacters(
        @Query("page") page: Int?
    ): CharacterResponsesBodyData

    @GET("character/{id}")
    suspend fun getCharacter(
        @Path("id") id: Int
    ): CharacterResultResponsesBodyData

    @GET("location")
    suspend fun getLocations(
        @Query("page") page: Int?
    ): LocationResponsesBodyData

    @GET("location/{id}")
    suspend fun getLocation(
        @Path("id") id: Int
    ): LocationResultResponsesBodyData

    @GET("episode")
    suspend fun getEpisodes(
        @Query("page") page: Int?
    ): EpisodeResponsesBodyData

    @GET("episode/{id}")
    suspend fun getEpisode(
        @Path("id") id: Int
    ): EpisodeResultResponsesBodyData

}