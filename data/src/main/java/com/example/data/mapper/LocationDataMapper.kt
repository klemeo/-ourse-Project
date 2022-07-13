package com.example.data.mapper

import com.example.base.mapper.Mapper
import com.example.data.model.location_body.LocationResultResponsesBody
import com.example.data.model.location_responses.LocationResultResponsesBodyData

class LocationDataMapper :
    Mapper<LocationResultResponsesBodyData, LocationResultResponsesBody> {

    override fun map(origin: LocationResultResponsesBodyData) = LocationResultResponsesBody(
        created = origin.created,
        dimension = origin.dimension,
        id = origin.id,
        name = origin.name,
        residents = origin.residents,
        type = origin.type,
        url = origin.url
    )
}