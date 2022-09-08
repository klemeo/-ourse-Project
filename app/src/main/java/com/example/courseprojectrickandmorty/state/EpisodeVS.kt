package com.example.courseprojectrickandmorty.state

import com.example.domain.model.Episode

sealed class EpisodeVS {

    class Content(
        val item: Episode
    ) : EpisodeVS()

    class Error(
        val message: String?
    ) : EpisodeVS()

    object ShowLoader : EpisodeVS()
}
