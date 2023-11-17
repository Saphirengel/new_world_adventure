package com.example.newworldadventure.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.newworldadventure.databinding.IntroScreenBinding
import com.example.newworldadventure.databinding.StartscreenBinding

class StartFragment: Fragment() {
    private lateinit var binding: StartscreenBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = StartscreenBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btStartgame.text = "Start Game"
        binding.btLaden.text = "Spielstand Laden"
        binding.btCharerstellen.text = "Char Erstellen"
        binding.btOption.text = "Option"
        binding.btKompendium.text = "Kompendium"
        binding.btBeenden.text = "Beenden"

        binding.btLaden.setOnClickListener {
            //if(Liste der Spielstände leer)
            binding.btLaden.isEnabled = false
            //else{binding.btLaden.isEnabled = true}
        }
        binding.btStartgame.setOnClickListener {
            //if(Liste an Chars leer)
            binding.btStartgame.isEnabled = false
            //else(binding.btStartgame.isEnable = true
        }
    }
}
