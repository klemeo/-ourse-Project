package com.example.data.mapper

import com.example.base.mapper.Mapper
import com.example.base.models.*
import com.example.data.model.responses.CharactersResponse

class CharactersDataMapper :
    Mapper<CharactersResponse, Characters> {

    override fun map(origin: CharactersResponse) = Characters(
        info = origin.info.let { infoData ->
            Info(
                count = infoData?.count,
                next = infoData?.next,
                pages = infoData?.pages,
                prev = infoData?.prev,
            )
        },
        results = origin.results?.map { resultData ->
            Character(
                created = resultData.created,
                episode = resultData.episode,
                gender = resultData.gender,
                id = resultData.id,
                image = resultData.image,
                location = resultData.location.let { locationData ->
                    Location(
                        name = locationData?.name,
                        url = locationData?.url
                    )
                },
                name = resultData.name,
                origin = resultData.origin.let { originData ->
                    Origin(
                        name = originData?.name,
                        url = originData?.url
                    )
                },
                species = resultData.species,
                status = resultData.status,
                type = resultData.type,
                url = resultData.url,
            )
        }
    )
}