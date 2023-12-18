package com.example.newworldadventure.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "fauna_table")
data class Fauna(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0,

    val faunaName: String,
    val enemie: Boolean,
    val staticLoot1: String,
    val loot1: Int,
    val staticLoot2: String,
    val loot2: Int,
    val randomLoot: List<String>,
    val passivitaet: Boolean,
    val art: String
)
