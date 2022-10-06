package com.example.domain.interactor

import com.example.base.interactor.Interactor
import com.example.base.models.Episodes
import kotlinx.coroutines.flow.Flow
import com.example.domain.ApiRepository

class EpisodesInteractor(
    private val apiRepository: ApiRepository
) : Interactor<EpisodesInteractor.Params, Flow<Episodes>> {

    override fun execute(params: Params): Flow<Episodes> {
        return apiRepository.getEpisodes(params.page)
    }

    data class Params(
        val page: Int?
    )

}