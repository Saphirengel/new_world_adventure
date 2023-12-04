package com.example.newworldadventure.data.tabellen.material

import com.example.newworldadventure.data.model.Material

object Stoffe {

    val stoffe = listOf<Material>(
        Material(24, "Leinen", "Fasern", "", "", false, 0.2),
        Material(25, "Flimmerflachs", "Flachs", "Seide", "Wolle", false, 0.5),
        Material(26, "Schimmerseide", "Seide", "Baumwolle", "Flachs", false, 0.8),
        Material(27, "Wolkengarn", "Wolle", "Seide", "Flachs", false, 0.7),
        Material(28, "Baumwollfeder", "Baumwolle", "Flachs", "Wolle", false, 0.6),
        Material(29, "Leuchtender Leinen", "Leinen", "Flachs", "Seide", false, 0.4),
        Material(30, "Flüsterflaum", "Wolle", "Baumwolle", "Seide", false, 0.9),
        Material(31, "Seidenschleier", "Seide", "Leinen", "Baumwolle", false, 0.7),
        Material(32, "Goldene Wolle", "Wolle", "Seide", "Flachs", false, 0.8),
        Material(33, "Flammenfaser", "Baumwolle", "Wolle", "Seide", false, 0.6),
        Material(34, "Leinenlicht", "Leinen", "Baumwolle", "Seide", false, 0.5),
        Material(35, "Schattenseide", "Seide", "Wolle", "Flachs", false, 0.7),
        Material(36, "Kristallflachs", "Flachs", "Seide", "Wolle", false, 0.6)
    )

}