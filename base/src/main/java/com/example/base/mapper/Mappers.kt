package com.example.base.mapper

import com.example.base.models.CharacterPresModel
import com.example.base.models.Episode
import com.example.base.models.Location
import com.example.base.models.Character
import com.example.base.models.TextPresModel

fun Character.map() = CharacterPresModel(
    id = id ?: 0,
    name = name ?: "",
    image = image ?: "",
    location = location?.name ?: "",
    origin = origin?.name ?: "",
    status = status ?: ""
)

fun Episode.map() = TextPresModel(
    id = id ?: 0,
    text = name,
    date = airDate,
    episode = episode
)

fun Location.map() = TextPresModel(
    id = id ?: 0,
    text = name ?: ""
)