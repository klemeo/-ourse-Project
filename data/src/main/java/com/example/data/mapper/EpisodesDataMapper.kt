package com.example.data.mapper

import com.example.base.mapper.Mapper
import com.example.domain.model.Episodes
import com.example.domain.model.Episode
import com.example.data.model.responses.EpisodesResponse
import com.example.domain.model.Info

class EpisodesDataMapper :
    Mapper<EpisodesResponse, Episodes> {

    override fun map(origin: EpisodesResponse) = Episodes(
        info = origin.info.let { infoData ->
            Info(
                count = infoData?.count,
                next = infoData?.next,
                pages = infoData?.pages,
                prev = infoData?.prev,
            )
        },
        results = origin.results?.map { resultData ->
            Episode(
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