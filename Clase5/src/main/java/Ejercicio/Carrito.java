
package Ejercicio;



public class Carrito{
    
    Producto prod1;
    Producto prod2;
    Producto prod3; 
    
    public float precioTotal(){
    
    return (prod1.getPrecio() * prod1.getCantidad()) + (prod2.getPrecio() * prod2.getCantidad()) + 
            (prod3.getPrecio() * prod3.getCantidad());
    
    }
    
    public String prodComprados(){
    
        return prod1.getNombre() + " " + prod2.getNombre() + " " + prod3.getNombre();
    
    }

    public Carrito(Producto prod1, Producto prod2, Producto prod3) {
        this.prod1 = prod1;
        this.prod2 = prod2;
        this.prod3 = prod3;
    }

    public Producto getPrecioProd1() {
        return prod1;
    }

    public void setPrecioProd1(Producto prod1) {
        this.prod1 = prod1;
    }

    public Producto getPrecioProd2() {
        return prod2;
    }

    public void setPrecioProd2(Producto prod2) {
        this.prod2 = prod2;
    }

    public Producto getPrecioProd3() {
        return prod3;
    }

    public void setPrecioProd3(Producto prod3) {
        this.prod3 = prod3;
    }
    
    
    
}
