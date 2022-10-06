package com.example.data.model.responses

import com.google.gson.annotations.SerializedName

class CharactersResponse(
    @SerializedName("info")
    val info: InfoResponse? = null,
    @SerializedName("results")
    val results: List<CharacterResponse>? = null
)