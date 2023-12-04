package com.example.newworldadventure.data.daos

import androidx.lifecycle.LiveData
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.example.newworldadventure.data.model.Flora
import com.example.newworldadventure.data.model.Fraktion
import com.example.newworldadventure.data.model.Rohstoffe

interface FraktionsDao {


    //Hier sind alle DAOs für die Fraktionen

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAllFraktion(fraktion: Fraktion)


    @Query("SELECT*FROM fraktion_table")
    fun getAllFraktion(): LiveData<List<Fraktion>>


    @Query("DELETE FROM fraktion_table")
    suspend fun deleteAllFraktion()


    @Query("DELETE FROM fraktion_table WHERE id= :fraktionId")
    suspend fun deleteByIdFraktion(fraktionId: Long)


    @Query("SELECT*FROM fraktion_table WHERE id = :fraktionId")
    fun selectByFraktionId(fraktionId: Long): Fraktion


    @Query("SELECT COUNT(id) FROM fraktion_table")
    suspend fun getCountFraktion(): Int

    @Update
    suspend fun updateFraktion(update: Fraktion)
}