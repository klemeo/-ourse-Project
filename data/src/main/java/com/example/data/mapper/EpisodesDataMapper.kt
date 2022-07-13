package com.example.data.mapper

import com.example.base.mapper.Mapper
import com.example.data.model.episode_body.EpisodeResponsesBody
import com.example.data.model.episode_body.InfoResponsesBody
import com.example.data.model.episode_body.EpisodeResultResponsesBody
import com.example.data.model.episode_data.EpisodeResponsesBodyData

class EpisodesDataMapper :
    Mapper<EpisodeResponsesBodyData, EpisodeResponsesBody> {

    override fun map(origin: EpisodeResponsesBodyData) = EpisodeResponsesBody(
        info = origin.info.let { infoData ->
            InfoResponsesBody(
                count = infoData?.count,
                next = infoData?.next,
                pages = infoData?.pages,
                prev = infoData?.prev,
            )
        },
        results = origin.results?.map { resultData ->
            EpisodeResultResponsesBody(
                airDate = resultData.airDate,
                characters = resultData.characters,
                created = resultData.created,
                episode = resultData.episode,
                id = resultData.id,
                name = resultData.name,
                url = resultData.url
            )
        }
    )
}