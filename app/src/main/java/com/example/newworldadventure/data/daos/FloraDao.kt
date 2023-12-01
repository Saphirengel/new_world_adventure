package com.example.newworldadventure.data.daos

import androidx.lifecycle.LiveData
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.example.newworldadventure.data.model.Flora
import com.example.newworldadventure.data.model.Rohstoffe

interface FloraDao {

    //Hier sind alle DAOs für die Flora

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAllRohstoffe(flora: Flora)


    @Query("SELECT*FROM flora_table")
    fun getAllRohstoffe(): LiveData<List<Flora>>


    @Query("DELETE FROM flora_table")
    suspend fun deleteAllFlora()


    @Query("DELETE FROM flora_table WHERE id= :floraId")
    suspend fun deleteByIdFlora(floraId: Long)


    @Query("SELECT*FROM flora_table WHERE id = :floraId")
    fun selectByFloraId(floraId: Long): Rohstoffe


    @Query("SELECT COUNT(id) FROM flora_table")
    suspend fun getCountFlora(): Int

    @Update
    suspend fun updateFlora(update: Flora)
}