package com.example.locations

import com.friendly.universal_recycler.WidgetItem

sealed class LocationsVS {

    class Content(
        val items: MutableList<WidgetItem>,
        val size: Int
    ) : LocationsVS()

    class Error(
        val message: String?
    ) : LocationsVS()

    object ShowLoader : LocationsVS()

}