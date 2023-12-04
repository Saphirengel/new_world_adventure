package com.example.newworldadventure.data.tabellen.ruestung

import com.example.newworldadventure.data.model.Ruestung

object Ruestung {

    val ruestung = listOf<Ruestung>(
        Ruestung(1,"Schattenmäntel", "Verborgene Dunkelheit", 12, "Schattenschild", 8, "Finsterer Schutz", 15, "", 0, "Schattenfellen", 6, "Koboldleder", 5, "", 0, "Schatten", 18, 8, 15, 9.5, 3,1),
        Ruestung(2,"Phönixschuppen", "Feuerschutz", 15, "Flammenschild", 10, "Hitzeschutz", 20, "", 0, "Phönixhaut", 5, "Eiswolfpelz", 8, "", 0, "Feuer", 22, 7, 20, 11.0, 4,1),
        Ruestung(3,"Zauberroben", "Magischer Schutz", 18, "Arkaner Schutz", 12, "Mystische Barrieren", 25, "", 0, "Zephyrleder", 7, "Schattenfellen", 6, "", 0, "Magie", 25, 5, 25, 12.5, 5,1),
        Ruestung(4,"Kristallrüstung", "Eisige Festigkeit", 20, "Frostschutz", 15, "Eisige Barriere", 22, "", 0, "Kobaltglanz", 6, "Sirenenhaut", 4, "", 0, "Eis", 28, 7, 18, 11.8, 5,1),
        Ruestung(5,"Himmelspanzer", "Göttlicher Schutz", 15, "Heiliger Schild", 20, "Himmlische Verteidigung", 18, "", 0, "Einhornhaut", 7, "Elfenleder", 5, "", 0, "Heilig", 30, 6, 22, 13.0, 6,2),
        Ruestung(6,"Wolkenumhang", "Luftige Beweglichkeit", 22, "Windabwehr", 18, "Fliegender Schutz", 25, "", 0, "Zentaurenleder", 5, "Zephyrleder", 7, "", 0, "Luft", 30, 8, 20, 12.2, 6,2),
        Ruestung(7,"Erdrüstung", "Bodenstabilität", 20, "Felsiger Schild", 25, "Erdverbundenheit", 18, "", 0, "Kohlenstahl", 6, "Eiswolfpelz", 4, "", 0, "Erde", 26, 6, 25, 12.5, 7,2),
        Ruestung(8,"Lebenspanzer", "Vitalität", 25, "Lebensschild", 18, "Vitalabwehr", 22, "", 0, "Goldene Wolle", 8, "Sirenenhaut", 5, "", 0, "Natur", 28, 7, 23, 11.8, 7,3),
        Ruestung(9,"Strahlenrüstung", "Leuchtende Aura", 18, "Lichtschild", 22, "Strahlender Schutz", 15, "", 0, "Sternenkupfer", 6, "Elfenleder", 4, "", 0, "Licht", 26, 6, 22, 12.2, 8,3),
        Ruestung(10,"Schattenschleier", "Dunkle Tarnung", 22, "Schattenschutz", 18, "Verschwommene Verteidigung", 25, "", 0, "Schattenseide", 5, "Schattenfellen", 7, "", 0, "Schatten", 28, 7, 23, 11.8, 8,3),
        Ruestung(11,"Chaosrüstung", "Chaotischer Schutz", 20, "Chaosabwehr", 25, "Verwirbelter Schutz", 18, "", 0, "Kohlenkobalt", 6, "Eisenkohle", 4, "", 0, "Chaos", 26, 6, 22, 12.2, 9,4),
        Ruestung(12,"Engelsflügel", "Göttlicher Schutz", 18, "Engelsschild", 22, "Göttliche Barriere", 15, "", 0, "Titanstern", 6, "Drachenleder", 4, "", 0, "Heilig", 26, 6, 22, 12.2, 9,4),
        Ruestung(13,"Dämonenrüstung", "Dämonischer Schutz", 20, "Dämonischer Schild", 25, "Höllischer Schutz", 18, "", 0, "Sirenenhaut", 7, "Dämonenleder", 5, "", 0, "Unheilig", 30, 8, 20, 13.0, 10,4),
        Ruestung(14,"Mystische Robe", "Arkaner Schutz", 22, "Mystischer Schild", 18, "Verzauberter Schutz", 25, "", 0, "Kristallflachs", 5, "Wolkengarn", 7, "", 0, "Magie", 30, 8, 20, 12.2, 10,5),
        Ruestung(15,"Drachenpanzer", "Drachenstärke", 25, "Drachenschild", 20, "Drachenabwehr", 18, "", 0, "Titanstern", 8, "Drachenleder", 6, "", 0, "Feuer", 32, 9, 24, 13.5, 11,5),
        Ruestung(16,"Eisenherz", "Standhafte Verteidigung", 22, "Eisenschutz", 18, "Eisenfeste Barriere", 25, "", 0, "Eisenkohle", 6, "Zephyrleder", 5, "", 0, "Erde", 30, 8, 20, 12.2, 11,6),
        Ruestung(17,"Phantomumhang", "Verborgene Tarnung", 20, "Phantomabwehr", 25, "Illusionäre Verteidigung", 18, "", 0, "Schattenseide", 7, "Flimmerflachs", 5, "", 0, "Schatten", 28, 7, 22, 12.5, 12,6),
        Ruestung(18,"Astralrüstung", "Kosmische Abwehr", 18, "Sternenschild", 22, "Galaktische Barriere", 15, "", 0, "Sternenkupfer", 6, "Schimmerseide", 4, "", 0, "Licht", 26, 6, 22, 12.2, 12,6),
        Ruestung(19,"Lebensblatt", "Lebensenergie", 25, "Lebensschild", 20, "Lebenspendende Barriere", 18, "", 0, "Goldene Wolle", 8, "Leuchtender Leinen", 6, "", 0, "Natur", 32, 8, 25, 13.0, 13,7),
        Ruestung(20,"Kristallflügel", "Eisige Kristallität", 22, "Kristallschild", 18, "Kristalline Barriere", 25, "", 0, "Kobaltglanz", 7, "Kristallflachs", 5, "", 0, "Eis", 30, 8, 20, 12.2, 13,7),
        Ruestung(21,"Himmlischer Schleier", "Göttliche Aura", 18, "Himmlischer Schild", 22, "Himmlische Barriere", 15, "", 0, "Zinnglanz", 6, "Wolkengarn", 4, "", 0, "Heilig", 26, 6, 22, 12.2, 14,8),
        Ruestung(22,"Waldläufer", "Waldschutz", 22, "Waldblatt", 18, "Waldliche Barriere", 25, "", 0, "Baumwollfeder", 7, "Flimmerflachs", 5, "", 0, "Natur", 28, 7, 23, 11.8, 14,8),
        Ruestung(23,"Feuersturm", "Feuriger Schutz", 20, "Feuerschild", 25, "Flammenumhüllung", 18, "", 0, "Kohlenstahl", 6, "Flammenfaser", 4, "", 0, "Feuer", 26, 6, 22, 12.2, 15,8),
        Ruestung(24,"Zeitmantel", "Zeitloser Schutz", 25, "Zeitschild", 18, "Ätherische Barriere", 22, "", 0, "Titanstern", 8, "Schimmerseide", 5, "", 0, "Chaos", 30, 8, 22, 12.8, 15,9),
        Ruestung(25,"Einhornpanzer", "Einhornkraft", 22, "Einhornschild", 20, "Einhornschutz", 18, "", 0, "Einhornhaut", 7, "Flüsterflaum", 5, "", 0, "Heilig", 28, 7, 23, 11.8, 16,9)
    )
}