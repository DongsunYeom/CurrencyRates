package com.dongsun.github.db

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

/**
 * Room data access object for accessing the [TableCountry] table.
 */
@Dao
interface MainDBCommand {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(posts: MutableList<TableCountry>)

    // Do a similar query as the search API:
    // Look for repos that contain the query string in the name or in the description
    // and order those results descending, by the number of stars and then by name
    @Query("SELECT * FROM countrys ORDER BY name ASC")
    fun reposByName(): LiveData<MutableList<TableCountry>>

}