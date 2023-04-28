package com.yoprogramo.g2trabajointegrador;

import entity.Equipo;
import entity.Partido;
import entity.Persona;
import entity.Pronostico;
import entity.ResultadoEnum;
import entity.Ronda;
import java.io.File;
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
        
        Persona franco = new Persona("Franco", "Cuello");
        Persona alan = new Persona ("Alan", "Perez");

        Pronostico pfranco1 = new Pronostico(franco, finalp, argentina, ResultadoEnum.ganador);
        Pronostico pfranco2 = new Pronostico(franco, semi, españa, ResultadoEnum.ganador);
        Pronostico pAlan1 = new Pronostico (alan, finalp, francia, ResultadoEnum.perdedor);
        Pronostico pAlan2 = new Pronostico (alan, semi, españa, ResultadoEnum.ganador);

        /*franco.agregarPronostico(pfranco1, finalp);
        franco.agregarPronostico(pfranco2, semi);
        alan.agregarPronostico(pAlan2, semi);
        alan.agregarPronostico(pAlan1, finalp);*/

        System.out.println(primerRonda);

        System.out.println(franco);

        
        
        
      // Escribo las inscripciones en archivo csv
      //Ruta y nombre del archicos CSV a crear 
      
           String fileName = "Resultados.csv";
           ArrayList<String[]> data = new ArrayList<>();
           data.add(new String[] {"Nro Ronda", "Nombre Partido", "Equipo 1" , "Equipo 2", "Goles Equipo 1", "Goles Equipo 2"});
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
           
           String filePath = "/Resultados.csv";
           File file = new File(filePath);
           String path = file.getPath();
           System.out.println(path);
           

    }
}
