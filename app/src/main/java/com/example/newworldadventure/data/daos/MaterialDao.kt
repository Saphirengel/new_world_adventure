package com.example.newworldadventure.data.daos

import androidx.lifecycle.LiveData
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.example.newworldadventure.data.model.Flora
import com.example.newworldadventure.data.model.Material
import com.example.newworldadventure.data.model.Rohstoffe

interface MaterialDao {


    //Hier sind alle DAOs für die Materialien

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAllMaterial(material: Material)


    @Query("SELECT*FROM materialen_table")
    fun getAllMaterial(): LiveData<List<Material>>


    @Query("DELETE FROM materialen_table")
    suspend fun deleteAllMaterial()


    @Query("DELETE FROM materialen_table WHERE id= :floraId")
    suspend fun deleteByIdMaterial(floraId: Long)


    @Query("SELECT*FROM materialen_table WHERE id = :materialId")
    fun selectByMaterialId(materialId: Long): Rohstoffe


    @Query("SELECT COUNT(id) FROM materialen_table")
    suspend fun getCountMaterial(): Int

    @Update
    suspend fun updateMaterial(update: Material)
}