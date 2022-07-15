package com.example.courseprojectrickandmorty.state

import com.example.courseprojectrickandmorty.widgets.WidgetItem

sealed class EpisodesVS {
    class AddEpisodes(val items: MutableList<WidgetItem>, val size: Int) : EpisodesVS()
    class Error(val message: String?) : EpisodesVS()
    object ShowLoader : EpisodesVS()
}
