package com.example.courseprojectrickandmorty.state

import com.example.domain.model.Locations

sealed class LocationsVS {
    class AddLocations(val locationsVM: Locations) : LocationsVS()
    class Error(val message: String?) : LocationsVS()
    class ShowLoader(val showLoader: Boolean) : LocationsVS()
}