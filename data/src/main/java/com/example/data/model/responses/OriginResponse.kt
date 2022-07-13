package com.example.data.model.responses

import com.google.gson.annotations.SerializedName

class OriginResponse(
    @SerializedName("name")
    val name: String? = null,
    @SerializedName("url")
    val url: String? = null
)