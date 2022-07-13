package com.example.data.mapper

import com.example.base.mapper.Mapper
import com.example.domain.model.Location
import com.example.data.model.responses.LocationResponse

class LocationDataMapper :
    Mapper<LocationResponse, Location> {

    override fun map(origin: LocationResponse) = Location(
        created = origin.created,
        dimension = origin.dimension,
        id = origin.id,
        name = origin.name,
        residents = origin.residents,
        type = origin.type,
        url = origin.url
    )
}