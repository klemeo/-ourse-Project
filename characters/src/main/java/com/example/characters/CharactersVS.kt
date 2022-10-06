package com.example.characters

import com.friendly.universal_recycler.WidgetItem

sealed class CharactersVS {

    class Content(
        val items: MutableList<WidgetItem>,
        val size: Int
    ) : CharactersVS()

    class Error(
        val message: String?
    ) : CharactersVS()

    object ShowLoader : CharactersVS()

}
