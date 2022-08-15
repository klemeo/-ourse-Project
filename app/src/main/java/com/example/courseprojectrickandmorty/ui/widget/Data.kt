package com.example.courseprojectrickandmorty.ui.widget

import com.friendly.universal_recycler.ItemData

class TextPresModel(
    val id: Int,
    val text: String? = null,
    val date: String? = null,
    val episode: String? = null
) : ItemData {
    var onClick: (TextPresModel) -> Unit = {}
}
