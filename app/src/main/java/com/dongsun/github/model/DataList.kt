package com.dongsun.github.model

import com.dongsun.github.db.TableCountry

class DataList {
    lateinit var base: String
    lateinit var date: String
    lateinit var rates: MutableList<TableCountry>
}
