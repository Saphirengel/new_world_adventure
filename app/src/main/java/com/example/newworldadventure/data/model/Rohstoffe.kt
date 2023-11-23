package com.example.newworldadventure.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "rohstoff_table")
data class Rohstoffe(

    @PrimaryKey(autoGenerate = true)
    val id: Long = 0,

    val rohstoffName: String,
    val edelsteinfarbe: String?,
    val rohstoffGewicht: Double
)
