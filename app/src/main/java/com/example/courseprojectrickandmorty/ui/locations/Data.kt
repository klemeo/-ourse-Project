package com.example.courseprojectrickandmorty.ui.locations

import com.example.courseprojectrickandmorty.widgets.ItemData

class LocationPresModel(
    val id: Int,
    val text: String,
) : ItemData {
    var onClick: (LocationPresModel) -> Unit = {}
}