package com.example.courseprojectrickandmorty.state

import com.example.domain.model.Character

sealed class CharacterVS {
    class AddCharacter(val charactersVM: Character) : CharacterVS()
    class Error(val message: String?) : CharacterVS()
    class ShowLoader(val showLoader: Boolean) : CharacterVS()
}
