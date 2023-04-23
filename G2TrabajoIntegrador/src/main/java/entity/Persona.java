
package entity;

public class Persona {
    
    private String nombre;
    private String apellido;
    private Pronostico pronoticoDePersona;
    private int puntaje; 

    public Persona() {
    }

    public Persona(String nombre, String apellido, Pronostico pronoticoDePersona, int puntaje) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.pronoticoDePersona = pronoticoDePersona;
        this.puntaje= puntaje;
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

    public Pronostico getPronoticoDePersona() {
        return pronoticoDePersona;
    }

    public void setPronoticoDePersona(Pronostico pronoticoDePersona) {
        this.pronoticoDePersona = pronoticoDePersona;
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
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", puntaje=" + puntaje + '}';
    }
    
    
    
    //Metodos
    
    public int sumarPuntos(Pronostico puntos){
       
        System.out.println("El puntaje total de " + nombre + " es igual a " + puntaje );
       
       return puntaje + puntos.puntos(puntos, puntos.getPartido());
       
    }
    
    public void puntajeTotal(){
        System.out.println(puntaje);
    
    }
    
    
    
}
