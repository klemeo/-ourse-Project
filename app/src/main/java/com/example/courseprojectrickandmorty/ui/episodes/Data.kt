package com.example.courseprojectrickandmorty.ui.episodes

import com.example.courseprojectrickandmorty.widgets.ItemData

class EpisodePresModel(
    val id: Int,
    val text: String,
) : ItemData {
    var onClick: (EpisodePresModel) -> Unit = {}
}