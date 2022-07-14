package com.example.courseprojectrickandmorty.ui.characters

import com.example.courseprojectrickandmorty.widgets.ItemData

class CharacterPresModel(
    val id: Int,
    val name: String,
    val image: String,
    val location: String,
    val origin: String,
    val status: String,
) : ItemData {
    var onClick: (CharacterPresModel) -> Unit = {}
}