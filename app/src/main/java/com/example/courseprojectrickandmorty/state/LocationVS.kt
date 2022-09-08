package com.example.courseprojectrickandmorty.state

import com.example.domain.model.Location

sealed class LocationVS {

    class Content(
        val item: Location
    ) : LocationVS()

    class Error(
        val message: String?
    ) : LocationVS()

    object ShowLoader : LocationVS()

}
