

package com.yoprogramo.g2trabajointegrador;

import entity.Equipo;
import entity.Partido;
import entity.Persona;
import entity.Pronostico;
import entity.ResultadoEnum;
import entity.Ronda;



public class G2TrabajoIntegrador {

    public static void main(String[] args) {
        
       Equipo Argentina = new Equipo ("Argentina");
       Equipo Francia = new Equipo ("Francia");
       
       
       Partido Final = new Partido("Final", Argentina, Francia, 5, 4);
       
       Pronostico Prueba = new Pronostico(Final, Argentina, ResultadoEnum.ganador); 
       
       Persona Franco = new Persona("Franco","Cuello",Prueba,0);
       
       Ronda Rondafinal = new Ronda ("Ronda Final");
       
       Final.resultadoPartido();
               
       System.out.println("Goles de " + Argentina + " " + Final.getGolesEquipo1());
       System.out.println("Goles de " + Francia + " " + Final.getGolesEquipo2());
       
      /* Final.resultado(Argentina);
       Final.resultado(Francia);*/
       
       Prueba.puntos(Prueba, Final);
       
       System.out.println(Prueba);
       
       Rondafinal.agregarPartidos(Final);
       
       System.out.println(Rondafinal);
       
       System.out.println(Franco.sumarPuntos(Prueba));
       
       Franco.puntajeTotal();
       
             
         
    }
}
