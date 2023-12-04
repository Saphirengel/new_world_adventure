package com.example.newworldadventure.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "fraktion_table")
data class Fraktion(

    @PrimaryKey(autoGenerate = true)
    val id: Long = 0,

    val name: String,
    val frieden: String,
    val neutral: String,
    val verfeindet: String
)