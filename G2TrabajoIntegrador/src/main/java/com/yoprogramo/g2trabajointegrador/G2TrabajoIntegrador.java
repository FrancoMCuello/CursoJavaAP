package com.yoprogramo.g2trabajointegrador;

import entity.Equipo;
import entity.Partido;
import entity.Persona;
import entity.Pronostico;
import entity.ResultadoEnum;
import entity.Ronda;

public class G2TrabajoIntegrador {

    public static void main(String[] args) {

        Equipo Argentina = new Equipo("Argentina");
        Equipo Francia = new Equipo("Francia");
        Equipo Peru = new Equipo("Peru");
        Equipo España = new Equipo("España");

        Partido Final = new Partido("Final", Argentina, Francia, 5, 4);
        Partido Semi = new Partido("Semi", Peru, España, 3, 4);
        
        Ronda PrimerRonda = new Ronda("Primer Ronda");

        PrimerRonda.agregarPartidos(Final);
        PrimerRonda.agregarPartidos(Semi);

        Pronostico Prueba = new Pronostico(Final, Argentina, ResultadoEnum.ganador);
        Pronostico Prueba2 = new Pronostico(Semi, España, ResultadoEnum.ganador);

        Persona Franco = new Persona("Franco", "Cuello");

        Franco.agregarPronostico(Prueba, Final);
        Franco.agregarPronostico(Prueba2, Semi);

        System.out.println(PrimerRonda);

        System.out.println(Franco);

        System.out.println(Franco.getPuntaje());

    }
}
