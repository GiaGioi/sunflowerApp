package com.gioidev.sunflowerapp.data

import androidx.room.ColumnInfo
import androidx.room.PrimaryKey
import java.util.*
import java.util.Calendar.DAY_OF_YEAR

data class Plant(
    @PrimaryKey @ColumnInfo(name = "id") val plantId: String,
    val name: String,
    val description: String,
    val growJoinNumber: Int,
    val wateringInterval: Int = 7,
    val image: String = ""
) {

    fun shouldBeWatered(since: Calendar, lastWaterdate: Calendar) = since > lastWaterdate.apply {
        add(DAY_OF_YEAR, wateringInterval)
    }

    override fun toString() = name

}