package com.example.newworldadventure.ui

import android.os.Bundle
import android.os.Handler
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.newworldadventure.R
import com.example.newworldadventure.databinding.IntroScreenBinding
import com.example.newworldadventure.databinding.StoryScreenBinding

/**Ist das Fragment zum Story_Screen
 *@param [binding] ist ein binding an den StoryScreen
 * ein viewModel wird bei der einfachheit den Layouts nicht benötigt
 *
 */
class StoryFragment : Fragment() {
    private lateinit var binding: StoryScreenBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = StoryScreenBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val book = false


        binding.tvClickmich.text = "Klick mich"
        binding.ivWeiter.rotation = 180f
        binding.ivWeiter.isEnabled = false
        binding.ivBuch.setOnClickListener {
            if (!book) {
                val titelText = getString(R.string.titel)
                val storyText = getString(R.string.story)
                val startText = getString(R.string.starttext)
                val weiterGehts = R.string.weiter.toString()

                val delay = 100 // Zeit zwischen den Texten

                showTextWithDelay(binding.tvStorytitel, titelText, delay) {
                    showTextWithDelay(binding.tvStory, storyText, delay) {
                        showTextWithDelay(binding.tvStarttext, startText, delay) {
                            showTextWithDelay(binding.tvWeiter, weiterGehts, delay){

                            }
                        }
                    }
                }
            } else {

            }
        }
        binding.ivWeiter.setOnClickListener{
            findNavController().navigate(R.id.startFragment)
        }
    }

    /**
     *Über die nächsten zwei Funktionen wird der textaufruf gestarte bzw beendet
     *das heißt jeder Text Block wir nach und nach aufgerufen und dann als würde er geschrieben wiedergegeben
     */
    private fun showTextWithDelay(
        textView: TextView,
        text: String,
        delay: Int,
        callback: () -> Unit
    ) {
        val charArray = text.toCharArray()
        val stringBuilder = StringBuilder()
        textView.text = ""

        showNextChar(0, charArray, stringBuilder, textView, delay) {
            if (charArray.size == charArray.indices.last) {
                // Hier wird geprüft, ob der Text vollständig angezeigt wurde
                binding.ivWeiter.isEnabled = true
            }
            callback()
        }
    }

    private fun showNextChar(
        index: Int,
        charArray: CharArray,
        stringBuilder: StringBuilder,
        textView: TextView,
        delay: Int,
        callback: () -> Unit
    ) {
        if (index < charArray.size) {
            val finalText = String(charArray, 0, index + 1)
            stringBuilder.append(charArray[index])
            textView.text = stringBuilder.toString()
            Handler().postDelayed({
                showNextChar(index + 1, charArray, stringBuilder, textView, delay, callback)
            }, delay.toLong())
        } else {
            callback()
        }
    }
}

