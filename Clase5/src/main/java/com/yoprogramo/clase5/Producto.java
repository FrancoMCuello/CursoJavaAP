
package com.yoprogramo.clase5;

import java.time.LocalDate;


public class Producto {
    
    private String nombre;
    private String descripcion;
    private LocalDate fechaAlta;
    private int pesoKg;
    double precio;
    
    private static final double minPrecio = 0.1;

    public Producto(String nombre) {
        this.nombre = nombre;
        this.fechaAlta = LocalDate.now();
        this.precio = minPrecio;
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDate getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(LocalDate fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public int getPesoKg() {
        return pesoKg;
    }

    public void setPesoKg(int pesoKg) {
        this.pesoKg = pesoKg;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
    public void mostrar (){
    
        System.out.println(getNombre());
        System.out.println(getFechaAlta());
        System.out.println(getDescripcion());
        System.out.println(getPesoKg());
        System.out.println(getPrecio());
    
    }
    
    
}
