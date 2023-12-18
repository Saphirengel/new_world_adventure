package com.example.newworldadventure.data.local

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.newworldadventure.data.daos.FloraDao
import com.example.newworldadventure.data.daos.FraktionsDao
import com.example.newworldadventure.data.daos.MaterialDao
import com.example.newworldadventure.data.daos.RohstoffDao
import com.example.newworldadventure.data.daos.WaffenDao
import com.example.newworldadventure.data.model.Elementarten
import com.example.newworldadventure.data.model.Fauna
import com.example.newworldadventure.data.model.Flora
import com.example.newworldadventure.data.model.Fraktion
import com.example.newworldadventure.data.model.Material
import com.example.newworldadventure.data.model.Rassen
import com.example.newworldadventure.data.model.Rohstoffe
import com.example.newworldadventure.data.model.Ruestung
import com.example.newworldadventure.data.model.Schmuck
import com.example.newworldadventure.data.model.Waffen
import com.example.newworldadventure.data.model.Werte

@Database(entities =[
    Elementarten::class,
    Fauna::class,
    Flora::class,
    Material::class,
    Rassen::class,
    Rohstoffe::class,
    Ruestung::class,
    Schmuck::class,
    Waffen::class,
    Werte::class,
    Fraktion::class],
    version = 1)
abstract class GameDatabase: RoomDatabase(){
    abstract val rohstoffDao: RohstoffDao
    abstract val floraDao: FloraDao
    abstract val fraktionsDao: FraktionsDao
    abstract val materialDao: MaterialDao
    abstract val waffenDao: WaffenDao
}

    private lateinit var INSTANCE: GameDatabase

    fun getDatabase(context: Context): GameDatabase {
        synchronized(GameDatabase::class.java) {
            if (!::INSTANCE.isInitialized) {
                INSTANCE = Room.databaseBuilder(
                    context.applicationContext,
                    GameDatabase::class.java,
                    "game_database"
                ).build()
            }
            return INSTANCE
        }
    }