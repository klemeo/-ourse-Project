package com.example.data.model.character_data

import com.google.gson.annotations.SerializedName

class OriginResponsesBodyData(
    @SerializedName("name")
    val name: String?,
    @SerializedName("url")
    val url: String?
)