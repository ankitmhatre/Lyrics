package com.lyrics.model

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = arrayOf(Lyrics::class), version = 1)
abstract class LyricsDatabase : RoomDatabase() {

    abstract fun lyricsdatadao(): LyricsDao

    companion object {
        private var INSTANCE: LyricsDatabase? = null

        fun getInstance(context: Context): LyricsDatabase? {
            if (INSTANCE == null) {
                synchronized(LyricsDatabase::class) {
                    INSTANCE = Room.databaseBuilder(
                        context.getApplicationContext(),
                        LyricsDatabase::class.java, "weather.db"
                    )
                        .build()
                }
            }
            return INSTANCE
        }

        fun destroyInstance() {
            INSTANCE = null
        }
    }
}