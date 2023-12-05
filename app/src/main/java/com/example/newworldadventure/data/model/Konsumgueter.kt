package com.example.newworldadventure.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Konsumgueter_table")
data class Konsumgueter(

    @PrimaryKey(autoGenerate = true)
    val id: Long = 0,

    val name: String,
    val incridience1:String,
    val incridience2:String,
    val incridience3:String,
    val incridience4:String,
    val giftig: Boolean,
    val alcohol: Boolean,
    val heilkraft: Int?,
    val manakraft: Int?,
    val effekt: String?,
    val effektValue: Int?,
    val gewicht: Double,
    val itemStufe: Int
)
