package com.example.courseprojectrickandmorty.state

import com.example.base.models.Character

sealed class CharacterVS {

    class Content(
        val item: Character
    ) : CharacterVS()

    class Error(
        val message: String?
    ) : CharacterVS()

    object ShowLoader : CharacterVS()

}
