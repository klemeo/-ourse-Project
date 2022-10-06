package com.example.data.db.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Characters")
data class CharactersDb(
    @PrimaryKey(autoGenerate = true)
    val info: InfoDb? = null,
    val results: List<CharacterDb>? = null
)