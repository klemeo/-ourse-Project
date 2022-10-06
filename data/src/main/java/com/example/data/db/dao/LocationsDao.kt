package com.example.data.db.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.data.db.entity.LocationsDb

@Dao
abstract class LocationsDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    abstract suspend fun insert(item: LocationsDb)

    @Query("DELETE FROM Locations")
    abstract fun delete()

}