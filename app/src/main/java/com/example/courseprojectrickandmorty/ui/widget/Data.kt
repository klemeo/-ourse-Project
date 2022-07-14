package com.example.courseprojectrickandmorty.ui.widget

import com.example.courseprojectrickandmorty.widgets.ItemData

class TextPresModel(
    val id: Int,
    val text: String,
) : ItemData {
    var onClick: (TextPresModel) -> Unit = {}
}
