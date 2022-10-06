package com.example.data.model.responses

import com.google.gson.annotations.SerializedName

class LocationsResponse(
    @SerializedName("info")
    val info: InfoResponse? = null,
    @SerializedName("results")
    val results: List<LocationResponse>? = null
)