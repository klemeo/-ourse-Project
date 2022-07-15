package com.example.courseprojectrickandmorty.ui.locations

import android.view.View
import com.example.base.mvvm.MvvmScreen
import com.example.courseprojectrickandmorty.R
import com.example.courseprojectrickandmorty.state.LocationsVS
import com.example.courseprojectrickandmorty.widgets.ListWidget
import com.example.courseprojectrickandmorty.widgets.MyLoadMore
import org.koin.androidx.viewmodel.ext.android.viewModel

class LocationsFragment : MvvmScreen<LocationsViewModel>(R.layout.f_locations) {

    override val viewModel: LocationsViewModel by viewModel()

    private var lvLocations: ListWidget? = null

    override fun initView(view: View) {
        lvLocations = view.findViewById(R.id.lvLocations)
        observeViewModel()
        onScrollListener()
    }

    private fun observeViewModel() {
        viewModel.viewLocationsState.observe(viewLifecycleOwner) { state ->
            when (state) {
                is LocationsVS.AddLocations -> {
                    lvLocations?.setDataHideProgress(state.items, false, state.size)
                }
                is LocationsVS.ShowLoader -> {
                    handleScreenStateLoading()
                }
                is LocationsVS.Error -> {

                }
            }
        }
    }

    private fun handleScreenStateLoading() {
        lvLocations?.setProgressAndItems(true)
    }

    private fun onScrollListener() {
        lvLocations?.setLoad(object : MyLoadMore {
            override fun onLoadMore() {
                viewModel.getLocations()
            }
        }
        )
    }
}