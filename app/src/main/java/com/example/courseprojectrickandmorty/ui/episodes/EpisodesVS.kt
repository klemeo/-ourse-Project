package com.example.courseprojectrickandmorty.ui.episodes

import com.friendly.universal_recycler.WidgetItem

sealed class EpisodesVS {

    class Content(
        val items: MutableList<WidgetItem>,
        val size: Int
    ) : EpisodesVS()

    class Error(
        val message: String?
    ) : EpisodesVS()

    object ShowLoader : EpisodesVS()
}
