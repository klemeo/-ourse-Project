package com.example.data.mapper

import com.example.base.mapper.Mapper
import com.example.base.models.Character
import com.example.base.models.Origin
import com.example.data.model.responses.CharacterResponse
import com.example.base.models.Location

class CharacterDataMapper :
    Mapper<CharacterResponse, Character> {

    override fun map(origin: CharacterResponse) = Character(
        created = origin.created,
        episode = origin.episode,
        gender = origin.gender,
        id = origin.id,
        image = origin.image,
        location = origin.location.let { locationData ->
            Location(
                name = locationData?.name,
                url = locationData?.url
            )
        },
        name = origin.name,
        origin = origin.origin.let { originData ->
            Origin(
                name = originData?.name,
                url = originData?.url
            )
        },
        species = origin.species,
        status = origin.status,
        type = origin.type,
        url = origin.url,
    )

}