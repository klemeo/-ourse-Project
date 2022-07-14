package com.example.courseprojectrickandmorty.ui.episodes

import com.example.base.mapper.Mapper
import com.example.domain.model.Episode

class EpisodeMapper : Mapper<Episode, EpisodePresModel> {

    override fun map(origin: Episode) = EpisodePresModel(
        id = origin.id ?: 0,
        text = origin.name ?: ""
    )

}