package com.example.data.model.location_responses

import com.google.gson.annotations.SerializedName

class LocationResponsesBodyData(
    @SerializedName("info")
    val info: InfoResponsesBodyData?,
    @SerializedName("results")
    val results: List<LocationResultResponsesBodyData>?
)