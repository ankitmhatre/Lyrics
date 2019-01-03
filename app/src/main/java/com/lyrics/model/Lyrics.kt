package com.lyrics.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "lyrics_table")
data class Lyrics(
    @PrimaryKey(autoGenerate = true) val lid: Int,
    val track: String,
    val artist: String,
    val newTrack: String,
    val newArtist: String,
    val text: String,
    val flag: Int

)