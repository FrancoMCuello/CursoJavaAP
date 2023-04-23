
package Ejercicio;

public class Principal {
    
    public static void main(String[] args) {
        
        Producto prod1 = new Producto("Atun", "1A", 2, 50);
        Producto prod2 = new Producto("Arroz", "1B", 3, 100);
        Producto prod3 = new Producto("Gaseosa", "1C", 1, 500);
        
        Carrito carrito1 = new Carrito(prod1, prod2, prod3);
        
        System.out.println("Se compro" + prod1);
        System.out.println(carrito1.precioTotal());
        System.out.println(carrito1.prodComprados());
    }
}
