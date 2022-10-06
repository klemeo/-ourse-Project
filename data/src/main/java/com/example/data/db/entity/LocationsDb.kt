package com.example.data.db.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Locations")
data class LocationsDb(
    @PrimaryKey(autoGenerate = true)
    val info: InfoDb? = null,
    val results: List<LocationDb>? = null
)