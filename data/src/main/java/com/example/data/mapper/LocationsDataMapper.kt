package com.example.data.mapper

import com.example.base.mapper.Mapper
import com.example.base.models.Locations
import com.example.base.models.Location
import com.example.data.model.responses.LocationsResponse
import com.example.base.models.Info

class LocationsDataMapper :
    Mapper<LocationsResponse, Locations> {

    override fun map(origin: LocationsResponse) = Locations(
        info = origin.info.let { info ->
            Info(
                count = info?.count,
                next = info?.next,
                pages = info?.pages,
                prev = info?.prev,
            )
        },
        results = origin.results?.map { result ->
            Location(
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