package com.example.data.model.character_body

class CharacterResultResponsesBody(
    val created: String?,
    val episode: List<String>?,
    val gender: String?,
    val id: Int?,
    val image: String?,
    val location: LocationResponsesBody?,
    val name: String?,
    val origin: OriginResponsesBody?,
    val species: String?,
    val status: String?,
    val type: String?,
    val url: String?
)