package com.example.domain.interactor

import com.example.base.interactor.Interactor
import kotlinx.coroutines.flow.Flow
import com.example.domain.ApiRepository
import com.example.base.models.Character

class CharacterInteractor(
    private val apiRepository: ApiRepository
) : Interactor<CharacterInteractor.Params, Flow<Character>> {

    override fun execute(params: Params): Flow<Character> {
        return apiRepository.getCharacter(
            id = params.id
        )
    }

    data class Params(
        val id: Int
    )

}