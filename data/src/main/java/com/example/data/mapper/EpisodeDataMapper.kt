package com.example.data.mapper

import com.example.base.mapper.Mapper
import com.example.data.model.result.Episode
import com.example.data.model.responses.EpisodeResponse

class EpisodeDataMapper :
    Mapper<EpisodeResponse, Episode> {

    override fun map(origin: EpisodeResponse) = Episode(
        airDate = origin.airDate,
        characters = origin.characters,
        created = origin.created,
        episode = origin.episode,
        id = origin.id,
        name = origin.name,
        url = origin.url
    )
}