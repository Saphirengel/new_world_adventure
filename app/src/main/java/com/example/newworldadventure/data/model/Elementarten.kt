package com.example.newworldadventure.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "elementarten_table")
data class Elementarten(

    @PrimaryKey(autoGenerate = true)
    val id: Long = 0,

    val pysisch: Int,
    val magie: Int,
    val feuer: Int,
    val wasser: Int,
    val erde: Int,
    val luft: Int,
    val heilig: Int,
    val unheilig: Int,
    val schatten: Int,
    val chaos: Int,
    val eis: Int,
    val frost: Int,
    val fluch: Int,
    val blut: Int,
    val gift: Int,
    val natur: Int
)
