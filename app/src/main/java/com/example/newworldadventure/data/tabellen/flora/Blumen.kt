package com.example.newworldadventure.data.tabellen.flora

import com.example.newworldadventure.data.model.Flora

/**
 * hier ist eine Liste der Blumen die in der Spielwelt vorhanden sind(Listenhilfe von ChatGpt)
 */
object Blumen {

    val blumen = listOf<Flora>(
        Flora(1,"Traumfeder","Tränenblüte",3,true,4,8, 0.2,1),
        Flora(2,"Sternenglöckchen","Sternentau", 4, false, 6, 10, 0.4, 2),
        Flora(3, "Glimmerrose", "Glimmerblatt", 5, false, 8, 12, 0.3, 3) ,
        Flora(4,"Dämmerrosen","Dämmerblatt",5,true,5,12,0.4,3),
        Flora(5, "Schattenflieder","Dunkelnektar",6, true, 3, 15, 0.5, 4),
        Flora(6,"Auroraastern","Auroranebel",6,false,9,16,0.6,4),
        Flora(7,"Mondlotus","Mondlichtblatt",7,false,10,18,0.6,5),
        Flora(8,"Kristallorchidee","Kristallblüte",8,false,12,20,0.7,6),
        Flora(9,"Ewigblüte","Zeitblatt",9,false,15,25,0.8,7),
        Flora(10,"Phönixblüte","Feuerfeder",10,true,20,30,1.0,8),
    )
}