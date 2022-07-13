package com.example.courseprojectrickandmorty.state

import com.example.domain.model.Location

sealed class LocationVS {
    class AddLocation(val locationsVM: Location) : LocationVS()
    class Error(val message: String?) : LocationVS()
    class ShowLoader(val showLoader: Boolean) : LocationVS()
}
