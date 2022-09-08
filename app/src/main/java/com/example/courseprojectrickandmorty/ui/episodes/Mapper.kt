package com.example.courseprojectrickandmorty.ui.episodes

import com.example.courseprojectrickandmorty.ui.widget.TextPresModel
import com.example.domain.model.Episode

fun Episode.map() = TextPresModel(
    id = id ?: 0,
    text = name,
    date = airDate,
    episode = episode
)