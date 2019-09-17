package com.dongsun.github.model

import androidx.lifecycle.LiveData
import com.dongsun.github.db.TableCountry

data class SearchResult(
    val data: LiveData<MutableList<TableCountry>>,
    val networkErrors: LiveData<String>
)