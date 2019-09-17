package com.dongsun.github.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

/**
 * Database schema that holds the list of repos.
 */
@Database(
        entities = [TableCountry::class],
        version = 1,
        exportSchema = false
)
abstract class MainDatabase : RoomDatabase() {

    abstract fun mainTable(): MainDBCommand

    companion object {

        @Volatile
        private var INSTANCE: MainDatabase? = null

        fun getInstance(context: Context): MainDatabase {
            if (INSTANCE == null) {
                synchronized(this) {
                    INSTANCE = Room.databaseBuilder(
                        context.applicationContext,
                        MainDatabase::class.java, "MainDatabase"
                    ).build()
                }
            }

            return INSTANCE!!
        }

    }
}