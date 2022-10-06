package com.example.location

import com.example.base.models.Location

sealed class LocationVS {

    class Content(
        val item: Location
    ) : LocationVS()

    class Error(
        val message: String?
    ) : LocationVS()

    object ShowLoader : LocationVS()

}
