package com.example.character

import com.example.base.mvvm.MvvmScreen
import org.koin.androidx.viewmodel.ext.android.viewModel

class CharacterFragment : MvvmScreen<CharacterViewModel>(R.layout.f_character) {

    override val viewModel: CharacterViewModel by viewModel()

}