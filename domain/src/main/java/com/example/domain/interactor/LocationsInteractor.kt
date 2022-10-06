package com.example.domain.interactor

import com.example.base.interactor.Interactor
import com.example.base.models.Locations
import kotlinx.coroutines.flow.Flow
import com.example.domain.ApiRepository

class LocationsInteractor(
    private val apiRepository: ApiRepository
) : Interactor<LocationsInteractor.Params, Flow<Locations>> {

    override fun execute(params: Params): Flow<Locations> {
        return apiRepository.getLocations(params.page)
    }

    data class Params(
        val page: Int?
    )

}