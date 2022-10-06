package com.example.location

import com.example.base.mvvm.MvvmScreen
import org.koin.androidx.viewmodel.ext.android.viewModel

class LocationFragment : MvvmScreen<LocationViewModel>(R.layout.f_location) {

    override val viewModel: LocationViewModel by viewModel()

}