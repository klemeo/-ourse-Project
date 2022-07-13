package com.example.data.db

import android.content.Context
import androidx.room.Room

object Database {

    fun build(context: Context): ProjectDatabase =
        Room
            .databaseBuilder(
                context,
                ProjectDatabase::class.java,
                "rickAndMortyDb"
            )
            .build()

}