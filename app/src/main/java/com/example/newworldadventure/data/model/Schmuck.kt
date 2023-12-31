package com.example.newworldadventure.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "schmuck_table")
data class Schmuck(

    @PrimaryKey(autoGenerate = true)
    val id: Long = 0,

    val schmuckName: String,
    val schmuckArt: String,
    val bonusName1: String?,
    val bonusZahl1: Int?,
    val bonusName2: String?,
    val bonusZahl2: Int?,
    val bonusName3: String?,
    val bonusZahl3: Int?,
    val bonusName4: String?,
    val bonusZahl4: Int?,
    val materialName1: String,
    val materialZahl1: Int,
    val materialName2: String?,
    val materialZahl2: Int?,
    val materialName3: String?,
    val materialZahl3: Int?,
    val gewicht: Double,
    val itemStufe: Int
)


