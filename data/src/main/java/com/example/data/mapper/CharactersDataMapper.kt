package com.example.data.mapper

import com.example.base.mapper.Mapper
import com.example.data.model.character_body.*
import com.example.data.model.character_data.CharacterResponsesBodyData

class CharactersDataMapper :
    Mapper<CharacterResponsesBodyData, CharacterResponsesBody> {

    override fun map(origin: CharacterResponsesBodyData) = CharacterResponsesBody(
        info = origin.info.let { infoData ->
            InfoResponsesBody(
                count = infoData?.count,
                next = infoData?.next,
                pages = infoData?.pages,
                prev = infoData?.prev,
            )
        },
        results = origin.results?.map { resultData ->
            CharacterResultResponsesBody(
                created = resultData.created,
                episode = resultData.episode,
                gender = resultData.gender,
                id = resultData.id,
                image = resultData.image,
                location = resultData.location.let { locationData ->
                    LocationResponsesBody(
                        name = locationData?.name,
                        url = locationData?.url
                    )
                },
                name = resultData.name,
                origin = resultData.origin.let { originData ->
                    OriginResponsesBody(
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