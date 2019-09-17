package com.dongsun.github.db

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(tableName = "countrys")
data class TableCountry(
    @PrimaryKey @field:SerializedName("name") val name: String,
    @field:SerializedName("rate") var rate: Double,
    @field:SerializedName("imgUrl") val imgUrl: String?
)