package com.example.courseprojectrickandmorty.ui.locations

import com.example.base.mapper.Mapper
import com.example.courseprojectrickandmorty.ui.widget.TextPresModel
import com.example.domain.model.Location

class LocationMapper : Mapper<Location, TextPresModel> {

    override fun map(origin: Location) = TextPresModel(
        id = origin.id ?: 0,
        text = origin.name ?: ""
    )

}