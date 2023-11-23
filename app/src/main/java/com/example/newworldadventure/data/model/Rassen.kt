package com.example.newworldadventure.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "rassen_table")
data class Rassen(

    @PrimaryKey(autoGenerate = true)
    val id: Long = 0,

    val rassenName: String,
    val rassenArt: String,
    val zugehörigkeit: String
)
