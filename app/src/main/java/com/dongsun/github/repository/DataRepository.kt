package com.dongsun.github.repository

import android.content.Context
import android.util.Log
import androidx.lifecycle.MutableLiveData
import com.dongsun.github.model.SearchResult
import com.dongsun.github.db.DBLocalCache
import com.dongsun.github.db.TableCountry
import com.dongsun.github.model.DataList
import com.dongsun.github.ui.MainDataListener
import com.test.googlefit.service.NetworkRepository

/**
 * Repository class that works with local and remote data sources.
 */
class DataRepository(context: Context) {

    private val mContext = context
    private val cache: DBLocalCache = DBLocalCache(context)

    // LiveData of network errors.
    private val networkErrors = MutableLiveData<String>()

    // avoid triggering multiple requests in the same time
    private var isRequestDone = false

    /**
     * Search repositories whose names match the query.
     */
    fun search(query: String): SearchResult {
        Log.d("DataRepository", "New query: $query")
        requestAndSaveData(query)

        // Get data from the local cache
        val data = cache.reposByName()

        return SearchResult(data, networkErrors)
    }

    fun requestMore(query: String) {
        requestAndSaveData(query)
    }

    private fun requestAndSaveData(query: String) {
        if (isRequestDone) return

        isRequestDone = true
        var service = NetworkRepository()
        service.sendAndRequestResponse(mContext, query, object: MainDataListener {
            override fun updateList(items: DataList) {
                cache.insert(items.rates, {
                    isRequestDone = false;
                })
            }
        })
    }

}