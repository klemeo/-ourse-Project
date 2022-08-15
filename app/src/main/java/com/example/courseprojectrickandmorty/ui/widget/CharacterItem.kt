package com.example.courseprojectrickandmorty.ui.widget

import com.friendly.universal_recycler.ItemData
import com.friendly.universal_recycler.WidgetItem
import com.example.courseprojectrickandmorty.R

class CharacterItem (override val itemData: ItemData) :
    WidgetItem {
    override val res = R.layout.i_character
}