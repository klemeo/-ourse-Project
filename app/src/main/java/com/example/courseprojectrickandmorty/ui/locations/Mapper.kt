package com.example.courseprojectrickandmorty.ui.locations

import com.example.courseprojectrickandmorty.ui.widget.TextPresModel
import com.example.domain.model.Location

fun Location.map() = TextPresModel(
    id = id ?: 0,
    text = name ?: ""
)