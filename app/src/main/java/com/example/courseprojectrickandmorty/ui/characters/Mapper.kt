package com.example.courseprojectrickandmorty.ui.characters

import com.example.base.mapper.Mapper
import com.example.domain.model.Character

class CharacterMapper : Mapper<Character, CharacterPresModel> {

    override fun map(origin: Character) = CharacterPresModel(
        id = origin.id ?: 0,
        name = origin.name ?: "",
        image = origin.image ?: "",
        location = origin.location?.name ?: "",
        origin = origin.origin?.name ?: "",
        status = origin.status ?: ""
    )

}