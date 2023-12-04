package com.example.newworldadventure.ui.viewmodel


import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import com.example.newworldadventure.data.GameRepository
import com.example.newworldadventure.data.local.getDatabase
import kotlinx.coroutines.launch

class GameViewModel(
    application: Application
): AndroidViewModel(application) {

    private val database = getDatabase(application)
    private val repository = GameRepository(database)

    val flora = repository.flora
    val fraktionen = repository.fraktion
    val material = repository.material
    val rohstoffe = repository.rohstoffe
    val waffen = repository.waffen


    //-----------------------------getter ViewModel-------------------------------------------------
    fun getFlora(){
        viewModelScope.launch {
            repository.getFlora()
        }
    }

    fun getFraktion(){
        viewModelScope.launch {
            repository.getFraktion()
        }
    }

    fun getMaterial(){
        viewModelScope.launch{
            repository.getMaterial()
        }
    }

    fun getRohstoffe(){
        viewModelScope.launch {
            repository.getRohstoffe()
        }
    }

    fun getWaffen(){
        viewModelScope.launch {
            repository.getWaffen()
        }
    }
}