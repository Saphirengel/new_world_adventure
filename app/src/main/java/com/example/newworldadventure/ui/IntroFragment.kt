package com.example.newworldadventure.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.newworldadventure.databinding.IntroScreenBinding

/**
 *@param [binding] ist ein binding an den IntroScreen
 * ein viewModel wird bei der einfachheit den Layouts nicht benötigt
 */
class IntroFragment: Fragment() {
        private lateinit var binding: IntroScreenBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = IntroScreenBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //hier wird die 3 textViews mit Text versehen
        binding.tvTiteleins.text = "World"
        binding.tvTitelzwei.text = "Adventure"
        binding.tvGamestart.text = "Let's Play"
    }
}