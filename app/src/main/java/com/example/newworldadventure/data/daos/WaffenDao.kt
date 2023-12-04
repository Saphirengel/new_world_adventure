package com.example.newworldadventure.data.daos

import androidx.lifecycle.LiveData
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.example.newworldadventure.data.model.Rohstoffe
import com.example.newworldadventure.data.model.Waffen

interface WaffenDao {

    //Hier sind alle DAOs für die Waffen

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAllWaffen(waffen: Waffen)


    @Query("SELECT*FROM waffen_table")
    fun getAllWaffen(): LiveData<List<Waffen>>


    @Query("DELETE FROM waffen_table")
    suspend fun deleteAllWaffen()


    @Query("DELETE FROM waffen_table WHERE id= :waffenId")
    suspend fun deleteByIdWaffen(waffenId: Long)


    @Query("SELECT*FROM waffen_table WHERE id = :waffenId")
    fun selectByWaffenId(waffenId: Long): Rohstoffe


    @Query("SELECT COUNT(id) FROM waffen_table")
    suspend fun getCountWaffen(): Int

    @Update
    suspend fun updateWaffen(update: Waffen)
}