package com.example.newworldadventure.data.tabellen.flora

import com.example.newworldadventure.data.model.Flora

/**
 * hier ist eine Liste die Pilze die in der Spielwelt vorhanden sind(Listenhilfe von ChatGpt)
 */
object Pilze {

    val pilze = listOf(
        Flora(36,"Mondschwamm","Mondspore",4,true,3,12,0.6,2 ),
        Flora(25, "Diamanttrichter","Diamanttrichter",3,false,4,8,0.7,3),
        Flora(26, "Sonnenpilz","Sonnenfleck",5,false,8,10,0.8,3),
        Flora(27,"Sonnentrichter","Sonnentrichter",5,false,8,10,0.9,3 ),
        Flora(28, "Sternenfaserling","Sternenfaser",6,false,6,10,1.0,4),
        Flora(29, "Nebelkappe","Nebelkappe",7,true,9,15,1.2,4),
        Flora(30, "Smaragdkappe","Smaragdkappe",6,false,10,14,1.3,4),
        Flora(31,"Nachtschirmling","Nachtspore",7,true,6,15,1.1,4 ),
        Flora(32, "Glitzerpilz","Glitzerspore",5,true,5,12,0.9,5),
        Flora(32,"Regenbogenschwamm","Regenbogenspore",8,false,12,16,1.4,6 ),
        Flora(32, "Rubinpilz","Rubinspore",8,false,12,18,1.5,6),
        Flora(32, "Kristallpilz","Kristallspore",9,false,14,20,1.7,7),
    )
}