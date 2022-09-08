package com.example.characters

import com.friendly.universal_recycler.ItemData
import com.friendly.universal_recycler.WidgetItem

class CharacterItem(override val itemData: ItemData) : WidgetItem {
    override val res = R.layout.i_character
}