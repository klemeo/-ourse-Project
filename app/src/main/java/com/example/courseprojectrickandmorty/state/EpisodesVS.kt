package com.example.courseprojectrickandmorty.state

import com.friendly.universal_recycler.WidgetItem

sealed class EpisodesVS {
    class AddEpisodes(val items: MutableList<WidgetItem>, val size: Int) : EpisodesVS()
    class Error(val message: String?) : EpisodesVS()
    object ShowLoader : EpisodesVS()
}
