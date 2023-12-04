package com.example.newworldadventure.data.tabellen.material

import com.example.newworldadventure.data.model.Material

object Traenke {

    val traenke = listOf<Material>(
        Material(71, "Feuerelixier", "Flammender Rotpilz", "", "", false, 1.0),
        Material(72, "Azurblauer Tränenextrakt", "Azurblauer Lichtpilz", "", "", false, 1.0),
        Material(73, "Leuchtender Grüntrunk", "Glimmender Grünling", "", "", false, 1.0),
        Material(74, "Phönixtinktur", "Phönixkappe", "", "", false, 1.0),
        Material(75, "Frostessenz", "Eisiger Schimmerpilz", "", "", false, 1.0),
        Material(76, "Nebelgeist-Trank", "Nebelwisperling", "", "", false, 1.0),
        Material(77, "Smaragdnebel-Trank", "Smaragdnebel-Pilz", "", "", false, 1.0),
        Material(78, "Schattentrank", "Flüsternder Schattenpilz", "", "", false, 1.0),
        Material(79, "Opalfeuer-Trank", "Feueropal-Schwamm", "", "", false, 1.0),
        Material(80, "Giftige Flammenessenz", "Flammender Rotpilz", "Glimmender Grünling", "Azurblauer Lichtpilz", true, 1.0),
        Material(81, "Eisige Verdunklung", "Eisiger Schimmerpilz", "Flüsternder Schattenpilz", "", true, 1.0),
        Material(82, "Blutroter Nebelschreck", "Phönixkappe", "Nebelwisperling", "", true, 1.0)
    )
}