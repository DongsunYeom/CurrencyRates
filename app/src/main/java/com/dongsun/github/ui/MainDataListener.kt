package com.dongsun.github.ui

import com.dongsun.github.model.DataList

interface MainDataListener {
    fun updateList(items: DataList)
}