
package Ejercicio;


public class Producto {
    
    
    private String nombre; 
    private String codigo;
    private int cantidad;
    float precio;

    public Producto(String nombre, String codigo, int cantidad, float precio) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.cantidad = cantidad; 
        this.precio = precio;
    }

    public Producto() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    
    
    
}
