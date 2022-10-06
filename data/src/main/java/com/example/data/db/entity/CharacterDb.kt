package com.example.data.db.entity

class CharacterDb(
    val created: String? = null,
    val episode: List<String>? = null,
    val gender: String? = null,
    val id: Int? = null,
    val image: String? = null,
    val location: LocationDb? = null,
    val name: String? = null,
    val origin: OriginDb? = null,
    val species: String? = null,
    val status: String? = null,
    val type: String? = null,
    val url: String? = null
)