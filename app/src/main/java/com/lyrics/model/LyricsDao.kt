package com.lyrics.model

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy.REPLACE
import androidx.room.Query

@Dao
interface LyricsDao {

    @Query("SELECT * from lyrics_table")
    fun getAll(): List<Lyrics>

    @Insert(onConflict = REPLACE)
    fun insert(weatherData: Lyrics)

    @Query("DELETE from lyrics_table")
    fun deleteAll()


}