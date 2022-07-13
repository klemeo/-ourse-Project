package com.example.courseprojectrickandmorty.state

import com.example.domain.model.Episodes

sealed class EpisodesVS {
    class AddEpisodes(val episodesVM: Episodes) : EpisodesVS()
    class Error(val message: String?) : EpisodesVS()
    class ShowLoader(val showLoader: Boolean) : EpisodesVS()
}
