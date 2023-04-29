package entity;

import java.util.ArrayList;
import java.util.List;

public class Persona {

    private String nombre;
    private String apellido;
    public List<Pronostico> pronosticoDePersona = new ArrayList<>();
    private int puntaje;

    public Persona() {
    }

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public List<Pronostico> getPronostico() {
        return pronosticoDePersona;
    }

    public void setPronostico(List<Pronostico> pronostico) {
        this.pronosticoDePersona = pronostico;
    }

    

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntos) {
        this.puntaje = puntos;
    }
    //toString

    @Override
    public String toString() {
        return "Persona " + nombre + ", " + apellido + ", pronostico=" + pronosticoDePersona + ", puntaje=" + puntaje +"\n";
    }

    //Metodos
    public void agregarPronostico(Pronostico pronostico, Partido partido) {

        pronosticoDePersona.add(pronostico);

        pronostico.puntos(pronostico, partido);

        puntaje = puntaje + pronostico.getPuntosJugador();

    }

    public void puntajeTotal() {
        System.out.println(puntaje);

    }

}
