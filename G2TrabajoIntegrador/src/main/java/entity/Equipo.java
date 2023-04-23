
package entity;


public class Equipo {
    
    private String nombre; 
    private ResultadoEnum descripcion; 
    
    
    //Contructores 
    public Equipo() {
    }

    public Equipo(String nombre) {
        this.nombre = nombre;
    }
    
    //Getters and Setters 

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ResultadoEnum getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(ResultadoEnum descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Equipo{" + "nombre=" + nombre + '}';
    }
    
    
    
    
    
}
