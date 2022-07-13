package com.example.courseprojectrickandmorty.state

import com.example.domain.model.Characters

sealed class CharactersVS {
    class AddCharacters(val charactersVM: Characters) : CharactersVS()
    class Error(val message: String?) : CharactersVS()
    class ShowLoader(val showLoader: Boolean) : CharactersVS()
}
