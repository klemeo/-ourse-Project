package com.example.data.db.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Episodes")
data class EpisodesDb(
    @PrimaryKey(autoGenerate = true)
    val info: InfoDb? = null,
    val results: List<EpisodeDb>? = null
)