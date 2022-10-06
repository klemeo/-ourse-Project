package com.example.base.mvvm

import android.os.Bundle
import android.view.View
import androidx.annotation.LayoutRes
import androidx.lifecycle.ViewModel

abstract class MvvmScreen<VM : ViewModel>(
    @LayoutRes layoutId: Int
) : Screen(layoutId) {

    protected abstract val viewModel: VM

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        //Чтобы проинициализировать ViewModel
        viewModel

        super.onViewCreated(view, savedInstanceState)
    }

}