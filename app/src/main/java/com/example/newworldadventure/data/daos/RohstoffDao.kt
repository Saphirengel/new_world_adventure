package com.example.newworldadventure.data.daos

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.example.newworldadventure.data.model.Rohstoffe

@Dao
interface RohstoffDao {

    //Hier sind alle DAOs für die Rohstoffe

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAllRohstoffe(rohstoffe: Rohstoffe)


    @Query("SELECT*FROM rohstoff_table")
    fun getAllRohstoffe(): LiveData<List<Rohstoffe>>


    @Query("DELETE FROM rohstoff_table")
    suspend fun deleteAllRohstoffe()


    @Query("DELETE FROM rohstoff_table WHERE id= :rohstoffId")
    suspend fun deleteByIdRohstoff(rohstoffId: Long)


    @Query("SELECT*FROM rohstoff_table WHERE id = :rohstoffId")
    fun selectByRohstoffId(rohstoffId: Long): Rohstoffe


    @Query("SELECT COUNT(id) FROM rohstoff_table")
    suspend fun getCountRohstoffe(): Int

    @Update
    suspend fun updateRohstoffe(update: Rohstoffe)
}