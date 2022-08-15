package com.example.courseprojectrickandmorty.ui.characters

import android.view.View
import com.example.base.mvvm.MvvmScreen
import com.example.courseprojectrickandmorty.R
import com.example.courseprojectrickandmorty.state.CharactersVS
import com.friendly.universal_recycler.ListWidget
import com.friendly.universal_recycler.MyLoadMore
import org.koin.androidx.viewmodel.ext.android.viewModel

class CharactersFragment : MvvmScreen<CharactersViewModel>(R.layout.f_characters) {

    override val viewModel: CharactersViewModel by viewModel()

    private var lvCharacters: ListWidget? = null

    override fun initView(view: View) {
        lvCharacters = view.findViewById(R.id.lvCharacters)
        observeViewModel()
        onScrollListener()
    }

    private fun observeViewModel() {
        viewModel.viewCharactersState.observe(viewLifecycleOwner) { state ->
            when (state) {
                is CharactersVS.AddCharacters -> {
                    lvCharacters?.setDataHideProgress(state.items, false, state.size)
                }
                is CharactersVS.ShowLoader -> {
                    handleScreenStateLoading()
                }
                is CharactersVS.Error -> {

                }
            }
        }
    }

    private fun handleScreenStateLoading() {
        lvCharacters?.setProgressAndItems(true)
    }

    private fun onScrollListener() {
        lvCharacters?.setLoad(object : MyLoadMore {
            override fun onLoadMore() {
                viewModel.getCharacters()
            }
        }
        )
    }
}