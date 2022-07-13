package com.example.data.model.character_data


import com.google.gson.annotations.SerializedName

class CharacterResponsesBodyData(
    @SerializedName("info")
    val info: InfoResponsesBodyData?,
    @SerializedName("results")
    val results: List<CharacterResultResponsesBodyData>?
)