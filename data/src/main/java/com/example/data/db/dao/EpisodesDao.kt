package com.example.data.db.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.data.db.entity.EpisodesDb

@Dao
abstract class EpisodesDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    abstract suspend fun insert(item: EpisodesDb)

    @Query("DELETE FROM Episodes")
    abstract fun delete()

}