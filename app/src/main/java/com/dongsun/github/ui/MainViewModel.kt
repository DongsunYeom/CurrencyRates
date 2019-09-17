/*
 * Copyright (C) 2018 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.dongsun.github.ui

import android.app.Application
import androidx.lifecycle.*
import com.dongsun.github.db.TableCountry
import com.dongsun.github.repository.DataRepository
import com.dongsun.github.model.SearchResult

/**
 * ViewModel for the [SearchRepositoriesActivity] screen.
 * The ViewModel works with the [DataRepository] to get the data.
 */
class MainViewModel(application: Application) : AndroidViewModel(application) {

    companion object {
        private const val VISIBLE_THRESHOLD = 5
    }

    private val repository: DataRepository =
        DataRepository(application)

    private val queryLiveData = MutableLiveData<String>()
    private val result: LiveData<SearchResult> = Transformations.map(queryLiveData, {
        repository.search(it)
    })

    val repos: LiveData<MutableList<TableCountry>> = Transformations.switchMap(result,
            { it -> it.data })
    val networkErrors: LiveData<String> = Transformations.switchMap(result,
            { it -> it.networkErrors })

    /**
     * Search a repository based on a query string.
     */
    fun searchRepo(queryString: String) {
        queryLiveData.postValue(queryString)
    }

    fun listScrolled(visibleItemCount: Int, lastVisibleItemPosition: Int, totalItemCount: Int) {
        if (visibleItemCount + lastVisibleItemPosition + VISIBLE_THRESHOLD >= totalItemCount) {
            val immutableQuery = lastQueryValue()
            if (immutableQuery != null) {
                repository.requestMore(immutableQuery)
            }
        }
    }

    /**
     * Get the last query value.
     */
    fun lastQueryValue(): String? = queryLiveData.value

}