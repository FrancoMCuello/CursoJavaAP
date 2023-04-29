
package entity;

import java.util.ArrayList;
import java.util.List;


public class Ronda {
    
   private String nro;
   public List<Partido> partidosJugados = new ArrayList<>();
   public List<Persona> pronosticosDeRonda = new ArrayList<>();
   
   
    //Constructor 
   
    public Ronda(String nro) {
        this.nro = nro;
    }

    public Ronda() {
    }
    
    
    //Getters and Setters

    public String getNro() {
        return nro;
    }

    public void setNro(String nro) {
        this.nro = nro;
    }

    public List<Partido> getPartidos() {
        return partidosJugados;
    }

    public void setPartidos(List<Partido> partidos) {
        this.partidosJugados = partidos;
    }

    public List<Persona> getPronosticosDeronda() {
        return pronosticosDeRonda;
    }

    public void setPronosticosDeronda(List<Persona> pronosticosDeronda) {
        this.pronosticosDeRonda = pronosticosDeronda;
    }
    
    
   
   //Metodos
    
    public void agregarPartidos(Partido partido){
       
        partidosJugados.add(partido);
        
        partido.resultadoPartido();
    
    }
    
    public void agregarPronosticosDeRonda(Ronda ronda, Persona pronostico){
    
        pronosticosDeRonda.add(pronostico);
        
        for(int i =0; i<pronosticosDeRonda.size(); i++){
            if(pronosticosDeRonda.get(i).getNombre() == pronostico.getNombre()){
            System.out.println(pronostico.getNombre() + pronostico.getPronostico());
          }
        }
        
    }
    
    //ToString

    @Override
    public String toString() {
        return "Ronda " + nro + ", partidosJugados=" + partidosJugados;
    }
    
    
   
   
}
