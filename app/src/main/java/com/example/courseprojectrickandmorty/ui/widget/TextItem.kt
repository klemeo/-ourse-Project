package com.example.courseprojectrickandmorty.ui.widget

import com.example.courseprojectrickandmorty.R
import com.friendly.universal_recycler.ItemData
import com.friendly.universal_recycler.WidgetItem

class TextItem (override val itemData: ItemData) :
    WidgetItem {
    override val res = R.layout.i_text
}