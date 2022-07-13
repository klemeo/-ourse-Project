package com.example.data.model.location_body

data class LocationResponsesBody(
    val info: InfoResponsesBody?,
    val results: List<LocationResultResponsesBody>?
)