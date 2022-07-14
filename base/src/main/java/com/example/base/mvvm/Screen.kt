package com.example.base.mvvm

import android.os.Bundle
import android.view.View
import androidx.annotation.LayoutRes
import androidx.fragment.app.Fragment

abstract class Screen(
    @LayoutRes layoutId: Int
) : Fragment(layoutId) {

    /**
     * Метод для инициализаци View
     */
    protected open fun initView(view: View) {
        //.
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        initView(view)
    }

}