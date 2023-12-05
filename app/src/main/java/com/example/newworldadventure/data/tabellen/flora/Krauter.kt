package com.example.newworldadventure.data.tabellen.flora

import com.example.newworldadventure.data.model.Flora

/**
 * hier ist eine Liste der Kräuter die in der Spielwelt vorhanden sind(Listenhilfe von ChatGpt)
 */
object Krauter {

    val kraeuter = listOf<Flora>(
        Flora(11, "Eisminze","Frostblatt",3,false,3,6, 0.15,1),
        Flora(12,"Funkelmoos","Glitzerflechte",4,false,5,8,0.1,2),
        Flora(13,"Silberhafer","Silberblatt",5,false,7,10,0.2,3),
        Flora(14,"Nebelblüte","Schleierblatt",5, true,6,10,0.25,3),
        Flora(15,"Schlangenzunge","Schlangenwurzel",6,true,4,12,0.3,4),
        Flora(16,"Geistergras","Spukwurzel",6,false,8,14,0.3,4),
        Flora(17,"Drachenkraut","Drachenschuppe",7,true,9,15,0.4,5),
        Flora(18,"Zauberwurzel","Magiewurzel",8,false,12,18,0.5,6),
        Flora(19,"Sonnenfarn","Sonnenblatt",9,false,15,22,0.6,7),
        Flora(20,"Mondklee","Mondblatt",10,true,18,25,0.8,8)
    )
}