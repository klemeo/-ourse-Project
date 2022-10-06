package com.example.episodes

import android.view.View
import com.example.base.mvvm.MvvmScreen
import com.friendly.universal_recycler.ListWidget
import com.friendly.universal_recycler.MyLoadMore
import org.koin.androidx.viewmodel.ext.android.viewModel

class EpisodesFragment : MvvmScreen<EpisodesViewModel>(R.layout.f_episodes) {

    override val viewModel: EpisodesViewModel by viewModel()

    private var lvEpisodes: ListWidget? = null

    override fun initView(view: View) {
        lvEpisodes = view.findViewById(R.id.lvEpisodes)
        lvEpisodes?.toGrid(2)
        observeViewModel()
        onScrollListener()
    }

    private fun observeViewModel() {
        viewModel.viewEpisodesState.observe(viewLifecycleOwner) { state ->
            when (state) {
                is EpisodesVS.Content -> {
                    lvEpisodes?.setDataHideProgress(state.items, false, state.size)
                }
                is EpisodesVS.ShowLoader -> {
                    handleScreenStateLoading()
                }
                is EpisodesVS.Error -> {

                }
            }
        }
    }

    private fun handleScreenStateLoading() {
        lvEpisodes?.setProgressAndItems(true)
    }

    private fun onScrollListener() {
        lvEpisodes?.setLoad(object : MyLoadMore {
            override fun onLoadMore() {
                viewModel.getEpisodes()
            }
        }
        )
    }
}