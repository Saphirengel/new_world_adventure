package com.example.newworldadventure.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "flora_table")
data class Flora(

    @PrimaryKey(autoGenerate = true)
    val id: Long = 0,

    val floraName: String,
    val floraIncridience: String,
    val IncridienceValue: Int,
    val giftig: Boolean,
    val heilkraft: Int,
    val manakraft: Int
    val floraGewicht: Double,
    val itemStufe: Int
)
