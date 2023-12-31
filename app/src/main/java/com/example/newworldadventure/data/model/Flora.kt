package com.example.newworldadventure.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "flora_table")
data class Flora(

    @PrimaryKey(autoGenerate = true)
    val id: Long = 0,

    val floraName: String,
    val floraIncridience: String,
    val incridienceValue: Int,
    val giftig: Boolean,
    val heilkraft: Int,
    val manakraft: Int,
    val gewicht: Double,
    val itemStufe: Int
)
