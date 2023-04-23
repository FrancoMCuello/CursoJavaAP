
package entity;

import java.util.ArrayList;
import java.util.List;


public class Ronda {
    
   private String nro;
   public List<Partido> partidosJugados = new ArrayList<>();
   
   
    //Constructor 
   
    public Ronda(String nro) {
        this.nro = nro;
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
   
   //Metodos
    
    public void agregarPartidos(Partido partidos){
       
        partidosJugados.add(partidos);
    
    }
    
    //ToString

    @Override
    public String toString() {
        return "Ronda{" + "nro=" + nro + ", partidosJugados=" + partidosJugados + '}';
    }
    
    
   
   
}
