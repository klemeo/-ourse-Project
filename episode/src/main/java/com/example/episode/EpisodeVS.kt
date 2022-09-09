package com.example.episode

import com.example.base.models.Episode

sealed class EpisodeVS {

    class Content(
        val item: Episode
    ) : EpisodeVS()

    class Error(
        val message: String?
    ) : EpisodeVS()

    object ShowLoader : EpisodeVS()
}
