package com.example.data.mapper

import com.example.base.mapper.Mapper
import com.example.data.model.location_body.InfoResponsesBody
import com.example.data.model.location_body.LocationResponsesBody
import com.example.data.model.location_body.LocationResultResponsesBody
import com.example.data.model.location_responses.LocationResponsesBodyData

class LocationsDataMapper :
    Mapper<LocationResponsesBodyData, LocationResponsesBody> {

    override fun map(origin: LocationResponsesBodyData) = LocationResponsesBody(
        info = origin.info.let { info ->
            InfoResponsesBody(
                count = info?.count,
                next = info?.next,
                pages = info?.pages,
                prev = info?.prev,
            )
        },
        results = origin.results?.map { result ->
            LocationResultResponsesBody(
                created = result.created,
                dimension = result.dimension,
                id = result.id,
                name = result.name,
                residents = result.residents,
                type = result.type,
                url = result.url
            )
        }
    )
}