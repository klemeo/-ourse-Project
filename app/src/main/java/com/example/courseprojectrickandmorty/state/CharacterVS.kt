package com.example.courseprojectrickandmorty.state

import com.example.domain.model.Character

sealed class CharacterVS {

    class Content(
        val item: Character
    ) : CharacterVS()

    class Error(
        val message: String?
    ) : CharacterVS()

    object ShowLoader : CharacterVS()

}
