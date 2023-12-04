package com.example.newworldadventure.data

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.newworldadventure.data.local.GameDatabase
import com.example.newworldadventure.data.model.Flora
import com.example.newworldadventure.data.model.Fraktion
import com.example.newworldadventure.data.model.Material
import com.example.newworldadventure.data.model.Rohstoffe
import com.example.newworldadventure.data.model.Waffen

class GameRepository(
    private val database: GameDatabase) {

    //-----------------------------------LiveData---------------------------------------------------

    private val _flora = MutableLiveData<List<Flora>>()
    val flora : LiveData<List<Flora>>
        get() = _flora

    private val _fraktion = MutableLiveData<List<Fraktion>>()
    val fraktion : LiveData<List<Fraktion>>
        get() = _fraktion

    private val _material = MutableLiveData<List<Material>>()
    val material : LiveData<List<Material>>
        get() = _material

    private val _rohstoffe = MutableLiveData<List<Rohstoffe>>()
    val rohstoffe : LiveData<List<Rohstoffe>>
        get() = _rohstoffe

    private val _waffen = MutableLiveData<List<Waffen>>()
    val waffen : LiveData<List<Waffen>>
        get() = _waffen

    //-----------------------------------alle Dao Insert--------------------------------------------
    suspend fun insertFlora(flora: Flora){
        try {
            database.floraDao.insertAllFlora(flora)
        }catch (e: Exception){
            Log.e("Repostory","$e")
        }
    }

    suspend fun insertFraktion(fraktion: Fraktion){
        try {
            database.fraktionsDao.insertAllFraktion(fraktion)
        }catch (e: Exception){
            Log.e("Repostory","$e")
        }
    }

    suspend fun insertMaterial(material: Material){
        try {
            database.materialDao.insertAllMaterial(material)
        }catch (e: Exception){
            Log.e("Repostory","$e")
        }
    }

    suspend fun insertRohstoffe(rohstoffe: Rohstoffe){
        try {
            database.rohstoffDao.insertAllRohstoffe(rohstoffe)
        }catch (e: Exception){
            Log.e("Repostory","$e")
        }
    }

    suspend fun insertWaffen(waffen: Waffen){
        try {
            database.waffenDao.insertAllWaffen(waffen)
        }catch (e: Exception){
            Log.e("Repostory","$e")
        }
    }

    //----------------------------alle Dao getter---------------------------------------------------


    suspend fun getFlora(){
        try {
            database.floraDao.getAllFlora()
        }catch (e: Exception){
            Log.e("Repostory","$e")
        }
    }

    suspend fun getFraktion(){
        try {
            database.fraktionsDao.getAllFraktion()
        }catch (e: Exception){
            Log.e("Repostory","$e")
        }
    }

    suspend fun getMaterial(){
        try {
            database.materialDao.getAllMaterial()
        }catch (e: Exception){
            Log.e("Repostory","$e")
        }
    }

    suspend fun getRohstoffe(){
        try {
            database.rohstoffDao.getAllRohstoffe()
        }catch (e: Exception){
            Log.e("Repostory","$e")
        }
    }


    suspend fun getWaffen(){
        try {
            database.waffenDao.getAllWaffen()
        }catch (e: Exception){
            Log.e("Repostory","$e")
        }
    }



    //----------------------------alle Dao Counts---------------------------------------------------


    //----------------------------alle Dao Updates--------------------------------------------------


    //----------------------------alle Dao ID Aufrufe-----------------------------------------------


    //----------------------------alle Dao ID Delete------------------------------------------------


    //----------------------------alle Dao Delete---------------------------------------------------


}