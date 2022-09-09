package com.example.episode

import com.example.base.mvvm.MvvmScreen
import org.koin.androidx.viewmodel.ext.android.viewModel

class EpisodeFragment : MvvmScreen<EpisodeViewModel>(R.layout.f_episode) {

    override val viewModel: EpisodeViewModel by viewModel()

}