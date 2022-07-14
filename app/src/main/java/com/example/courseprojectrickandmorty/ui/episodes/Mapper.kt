package com.example.courseprojectrickandmorty.ui.episodes

import com.example.base.mapper.Mapper
import com.example.courseprojectrickandmorty.ui.widget.TextPresModel
import com.example.domain.model.Episode

class EpisodeMapper : Mapper<Episode, TextPresModel> {

    override fun map(origin: Episode) = TextPresModel(
        id = origin.id ?: 0,
        text = origin.name ?: ""
    )

}