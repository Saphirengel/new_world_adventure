package com.example.newworldadventure.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "waffen_table")
data class Waffen(

    @PrimaryKey(autoGenerate = true)
    val id: Long = 0,

    val waffenName: String,
    val bonusName1: String,
    val bonusZahl1: Int,
    val bonusName2: String,
    val bonusZahl2: Int,
    val bonusName3: String,
    val bonusZahl3: Int,
    val bonusName4: String,
    val bonusZahl4: Int,
    val materialName1: Material,
    val materialZahl1: Int,
    val materialName2: Material,
    val materialZahl2: Int,
    val materialName3: Material,
    val materialZahl3: Int,
    val schadensArt: Elementarten,
    val schaden: Int,
    val minHaltbarkeit: Int,
    val maxHaltbarkeit: Int,
    val waffenGewicht: Double,
    val stufeDerWaffe: Int
)
