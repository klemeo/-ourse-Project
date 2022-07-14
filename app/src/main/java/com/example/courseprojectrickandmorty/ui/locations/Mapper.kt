package com.example.courseprojectrickandmorty.ui.locations

import com.example.base.mapper.Mapper
import com.example.domain.model.Location

class LocationMapper : Mapper<Location, LocationPresModel> {

    override fun map(origin: Location) = LocationPresModel(
        id = origin.id ?: 0,
        text = origin.name ?: ""
    )

}