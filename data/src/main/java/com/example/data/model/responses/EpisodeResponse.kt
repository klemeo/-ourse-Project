package com.example.data.model.responses

import com.google.gson.annotations.SerializedName

class EpisodeResponse(
    @SerializedName("air_date")
    val airDate: String? = null,
    @SerializedName("characters")
    val characters: List<String>? = null,
    @SerializedName("created")
    val created: String? = null,
    @SerializedName("episode")
    val episode: String? = null,
    @SerializedName("id")
    val id: Int? = null,
    @SerializedName("name")
    val name: String? = null,
    @SerializedName("url")
    val url: String? = null
)