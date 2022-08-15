package com.example.courseprojectrickandmorty.ui.locations

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.base.utils.io
import com.example.base.utils.ui
import com.example.courseprojectrickandmorty.state.LocationsVS
import com.example.courseprojectrickandmorty.ui.widget.TextItem
import com.example.courseprojectrickandmorty.utils.pageLocations
import com.friendly.universal_recycler.WidgetItem
import com.example.domain.interactor.LocationsInteractor
import com.example.domain.model.Locations
import kotlinx.coroutines.launch

class LocationsViewModel(
    private val locationsInteractor: LocationsInteractor
) : ViewModel() {

    private val _viewLocationsState = MutableLiveData<LocationsVS>()
    val viewLocationsState: LiveData<LocationsVS> = _viewLocationsState

    private val locationMapper by lazy { LocationMapper() }

    private var page: Int? = null

    init {
        getLocations()
    }

    fun getLocations() {
        viewModelScope.launch {
            try {
                io {
                    locationsInteractor.execute(
                        LocationsInteractor.Params(
                            page = page
                        )
                    )
                        .collect {
                            ui {
                                _viewLocationsState.value =
                                    LocationsVS.AddLocations(mapData(it), it.info?.count ?: 100)
                            }
                        }
                }
            } catch (e: Exception) {
                ui {
                    _viewLocationsState.value = LocationsVS.Error(e.message)
                }
            }
        }
    }

    private fun mapData(item: Locations): MutableList<WidgetItem> {
        val list = mutableListOf<WidgetItem>()

        page = item.info?.next?.pageLocations()

        item.results?.forEach {
            list.add(TextItem(locationMapper.map(it).apply {
                onClick = {

                }
            }))
        }

        return list
    }
}