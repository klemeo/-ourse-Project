package com.example.courseprojectrickandmorty.ui.widget

import com.example.courseprojectrickandmorty.R
import com.example.courseprojectrickandmorty.widgets.ItemData
import com.example.courseprojectrickandmorty.widgets.WidgetItem

class TextItem (override val itemData: ItemData) : WidgetItem {
    override val res = R.layout.i_text
}