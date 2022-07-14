package com.example.courseprojectrickandmorty.state

import com.example.courseprojectrickandmorty.widgets.WidgetItem

sealed class LocationsVS {
    class AddLocations(val items: MutableList<WidgetItem>) : LocationsVS()
    class Error(val message: String?) : LocationsVS()
    object ShowLoader : LocationsVS()
}