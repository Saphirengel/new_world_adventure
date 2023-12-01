package com.example.newworldadventure.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "materialen_table")
data class Material(

    @PrimaryKey(autoGenerate = true)
    val id: Long = 0,

    val materialname: String,
    val rohstoff1: Rohstoffe,
    val rohstoff2: Rohstoffe,
    val rohstoff3: Rohstoffe,
    val giftig: Boolean,
    val materialGewicht: Double
)
