package com.example.domain.interactor

import com.example.base.interactor.Interactor
import com.example.base.models.Characters
import kotlinx.coroutines.flow.Flow
import com.example.domain.ApiRepository

class CharactersInteractor(
    private val apiRepository: ApiRepository
) : Interactor<CharactersInteractor.Params, Flow<Characters>> {

    override fun execute(params: Params): Flow<Characters> {
        return apiRepository.getCharacters(params.page)
    }

    data class Params(
        val page: Int?
    )

}