package com.example.data.mapper

import com.example.base.mapper.Mapper
import com.example.data.model.episode_body.EpisodeResultResponsesBody
import com.example.data.model.episode_data.EpisodeResultResponsesBodyData

class EpisodeDataMapper :
    Mapper<EpisodeResultResponsesBodyData, EpisodeResultResponsesBody> {

    override fun map(origin: EpisodeResultResponsesBodyData) = EpisodeResultResponsesBody(
        airDate = origin.airDate,
        characters = origin.characters,
        created = origin.created,
        episode = origin.episode,
        id = origin.id,
        name = origin.name,
        url = origin.url
    )
}