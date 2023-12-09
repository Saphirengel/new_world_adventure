package com.example.newworldadventure.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "edelstein_tablle")
data class Edelsteine(

    @PrimaryKey(autoGenerate = true)
    val id: Long = 0,

    val name: String,
    val rohstoff1: String,
    val rohstoff2: String?,
    val farbe: String,
    val wert: String,
    val wertVaLue: Int,
    val effekt: String,
    val effektValue: Int,
    val gewicht: Double,
    val itemStufe: Int
)