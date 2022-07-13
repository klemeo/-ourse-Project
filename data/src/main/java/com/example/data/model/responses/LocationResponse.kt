package com.example.data.model.responses

import com.google.gson.annotations.SerializedName

class LocationResponse(
    @SerializedName("created")
    val created: String? = null,
    @SerializedName("dimension")
    val dimension: String? = null,
    @SerializedName("id")
    val id: Int? = null,
    @SerializedName("name")
    val name: String? = null,
    @SerializedName("residents")
    val residents: List<String>? = null,
    @SerializedName("type")
    val type: String? = null,
    @SerializedName("url")
    val url: String? = null
)