package com.example.domain.interactor

import com.example.base.interactor.Interactor
import com.example.base.models.Episode
import kotlinx.coroutines.flow.Flow
import com.example.domain.ApiRepository

class EpisodeInteractor(
    private val apiRepository: ApiRepository
) : Interactor<EpisodeInteractor.Params, Flow<Episode>> {

    override fun execute(params: Params): Flow<Episode> {
        return apiRepository.getEpisode(
            id = params.id
        )
    }

    data class Params(
        val id: Int
    )

}