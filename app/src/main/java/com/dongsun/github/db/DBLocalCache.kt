package com.dongsun.github.db

import android.content.Context
import android.util.Log
import androidx.lifecycle.LiveData
import java.util.concurrent.Executor
import java.util.concurrent.Executors

/**
 * Class that handles the DAO local data source. This ensures that methods are triggered on the
 * correct executor.
 */
class DBLocalCache(context: Context) {

    private val mainTable: MainDBCommand = MainDatabase.getInstance(context).mainTable()
    private val ioExecutor: Executor = Executors.newFixedThreadPool(4)

    /**
     * Insert a list of repos in the database, on a background thread.
     */
    fun insert(repos: MutableList<TableCountry>, insertFinished: ()-> Unit) {
        ioExecutor.execute {
            Log.d("DBLocalCache", "inserting ${repos.size} repos")
            mainTable.insert(repos)
            insertFinished()
        }
    }

    /**
     * Request a LiveData<List<Repo>> from the Dao, based on a repo name. If the name contains
     * multiple words separated by spaces, then we're emulating the GitHub API behavior and allow
     * any characters between the words.
     * @param name repository name
     */
    fun reposByName(): LiveData<MutableList<TableCountry>> {
        return mainTable.reposByName()
    }
}