package com.example.data.model.responses

import com.google.gson.annotations.SerializedName

class InfoResponse(
    @SerializedName("count")
    val count: Int? = null,
    @SerializedName("next")
    val next: String? = null,
    @SerializedName("pages")
    val pages: Int? = null,
    @SerializedName("prev")
    val prev: Any? = null
)