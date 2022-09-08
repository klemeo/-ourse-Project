package com.example.courseprojectrickandmorty.ui.characters

import com.example.courseprojectrickandmorty.ui.widget.CharacterPresModel
import com.example.domain.model.Character

fun Character.map() = CharacterPresModel(
    id = id ?: 0,
    name = name ?: "",
    image = image ?: "",
    location = location?.name ?: "",
    origin = origin?.name ?: "",
    status = status ?: ""
)