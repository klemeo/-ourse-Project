package com.example.data.model.episode_data

import com.google.gson.annotations.SerializedName

class EpisodeResponsesBodyData(
    @SerializedName("info")
    val info: InfoResponsesBodyData?,
    @SerializedName("results")
    val results: List<EpisodeResultResponsesBodyData>?
)