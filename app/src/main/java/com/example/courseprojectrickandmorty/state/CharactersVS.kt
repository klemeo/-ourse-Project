package com.example.courseprojectrickandmorty.state

import com.friendly.universal_recycler.WidgetItem

sealed class CharactersVS {
    class AddCharacters(val items: MutableList<WidgetItem>, val size: Int) : CharactersVS()
    class Error(val message: String?) : CharactersVS()
    object ShowLoader : CharactersVS()
}
