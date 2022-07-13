package com.example.courseprojectrickandmorty.state

import com.example.domain.model.Episode

sealed class EpisodeVS {
    class AddEpisode(val episodesVM: Episode) : EpisodeVS()
    class Error(val message: String?) : EpisodeVS()
    class ShowLoader(val showLoader: Boolean) : EpisodeVS()
}
