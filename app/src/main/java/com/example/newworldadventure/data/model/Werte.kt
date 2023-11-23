package com.example.newworldadventure.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "werte_table")
data class Werte(

    @PrimaryKey(autoGenerate = true)
    val id: Long = 0,

    val staerke: Int,
    val geschicklichkeit: Int,
    val intelligenz: Int,
    val konstitution: Int,
    val weisheit: Int,
    val charisma: Int,
    val glueck: Int
)
