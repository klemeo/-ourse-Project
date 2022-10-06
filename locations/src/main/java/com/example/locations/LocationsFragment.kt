package com.example.locations

import android.view.View
import com.example.base.mvvm.MvvmScreen
import com.friendly.universal_recycler.ListWidget
import com.friendly.universal_recycler.MyLoadMore
import org.koin.androidx.viewmodel.ext.android.viewModel

class LocationsFragment : MvvmScreen<LocationsViewModel>(R.layout.f_locations) {

    override val viewModel: LocationsViewModel by viewModel()

    private var lvLocations: ListWidget? = null

    override fun initView(view: View) {
        lvLocations = view.findViewById(R.id.lvLocations)
        lvLocations?.toGrid(2)
        observeViewModel()
        onScrollListener()
    }

    private fun observeViewModel() {
        viewModel.viewLocationsState.observe(viewLifecycleOwner) { state ->
            when (state) {
                is LocationsVS.Content -> {
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
        })
    }
}