package com.example.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.data.db.dao.CharactersDao
import com.example.data.db.dao.EpisodesDao
import com.example.data.db.dao.LocationsDao
import com.example.data.db.entity.CharactersDb
import com.example.data.db.entity.EpisodesDb
import com.example.data.db.entity.LocationsDb

@Database(
    entities = [
        CharactersDb::class,
        EpisodesDb::class,
        LocationsDb::class
    ],
    version = 1,
    exportSchema = true
)

abstract class ProjectDatabase : RoomDatabase() {
    abstract fun charactersDao(): CharactersDao
    abstract fun episodesDao(): EpisodesDao
    abstract fun locationsDao(): LocationsDao
}