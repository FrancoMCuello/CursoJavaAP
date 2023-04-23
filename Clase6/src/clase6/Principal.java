
package clase6;

/**
 *
 * @author Franco
 */
public class Principal {


    public static void main(String[] args) {
        
        Calculadora c = new Calculadora();
        
        System.out.println("Sumar");
        System.out.println(c.sumar(3, 25));
        
        System.out.println("restar");
        System.out.println(c.restar(1000,560));
        
        System.out.println("Multiplicar");
        System.out.println(c.multiplicar(0,560));
        
        System.out.println("Dividir");
        System.out.println(c.dividir(12,3));
    }
    
}
