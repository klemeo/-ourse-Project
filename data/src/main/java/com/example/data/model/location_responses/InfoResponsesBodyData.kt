package com.example.data.model.location_responses

import com.google.gson.annotations.SerializedName

class InfoResponsesBodyData(
    @SerializedName("count")
    val count: Int?,
    @SerializedName("next")
    val next: String?,
    @SerializedName("pages")
    val pages: Int?,
    @SerializedName("prev")
    val prev: Any?
)