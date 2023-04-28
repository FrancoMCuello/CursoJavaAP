package com.yoprogramo.g2trabajointegrador;

import entity.Equipo;
import entity.Partido;
import entity.Persona;
import entity.Pronostico;
import entity.ResultadoEnum;
import entity.Ronda;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class G2TrabajoIntegrador {

    public static void main(String[] args) {

        Equipo argentina = new Equipo("Argentina");
        Equipo francia = new Equipo("Francia");
        Equipo peru = new Equipo("Peru");
        Equipo españa = new Equipo("España");

        Partido finalp = new Partido("Final", argentina, francia, 5, 4);
        Partido semi = new Partido("Semi", peru, españa, 3, 4);
        
        Ronda primerRonda = new Ronda("Primer Ronda");

        primerRonda.agregarPartidos(finalp);
        primerRonda.agregarPartidos(semi);

        Pronostico Prueba = new Pronostico(finalp, argentina, ResultadoEnum.ganador);
        Pronostico Prueba2 = new Pronostico(semi, españa, ResultadoEnum.ganador);

        Persona franco = new Persona("Franco", "Cuello");

        franco.agregarPronostico(Prueba, finalp);
        franco.agregarPronostico(Prueba2, semi);

        System.out.println(primerRonda);

        System.out.println(franco);

        System.out.println(franco.getPuntaje());
        
        
      // Escribo las inscripciones en archivo csv
      //Ruta y nombre del archicos CSV a crear 
      
           String fileName = "Resultados.csv";
           ArrayList<String[]> data = new ArrayList<>();
           data.add(new String[] {primerRonda.getNro(), primerRonda.getPartidos().toString()});
          
           
           try{
               FileWriter writer = new FileWriter(fileName);
               
               //Escribe los datos en el archivo CSV
               for(String[] rowData : data){
                   for(String celldata : rowData){
                       writer.append(celldata);
                       writer.append(",");
                   }
                   writer.append("\n");
               
               }
               
               writer.flush();
               writer.close();
               System.out.println("Datos escritos en el archivo " + fileName);
              
           } catch (IOException e) {
               System.out.println("Error al escribir en el archivo " + fileName);
               e.printStackTrace();
           }
           

    }
}
