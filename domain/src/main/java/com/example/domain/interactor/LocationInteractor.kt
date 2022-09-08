package com.example.domain.interactor

import com.example.base.interactor.Interactor
import com.example.base.models.Location
import kotlinx.coroutines.flow.Flow
import com.example.domain.ApiRepository

class LocationInteractor(
    private val apiRepository: ApiRepository
) : Interactor<LocationInteractor.Params, Flow<Location>> {

    override fun execute(params: Params): Flow<Location> {
        return apiRepository.getLocation(
            id = params.id
        )
    }

    data class Params(
        val id: Int
    )

}