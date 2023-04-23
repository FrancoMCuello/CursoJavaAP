

package com.yoprogramo.clase5;

public class Clase5 {

    public static void main(String[] args) {
      
        int a;
        float b;
        String nombre;
        
        Producto prod = new Producto ("Atun");
        
       // prod.setNombre("Pan");
       
        System.out.println("Datos del producto");
        
        prod.mostrar();
        
        Producto prod1 = new Producto("Pan");
        
        prod1.mostrar();
        
        Producto prod2 = new Producto ("Gaseosa");
        prod2.setDescripcion("Coca Cola");
        
        prod2.mostrar();
        
    }
}
