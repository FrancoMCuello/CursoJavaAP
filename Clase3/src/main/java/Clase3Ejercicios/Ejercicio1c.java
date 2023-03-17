
package Clase3Ejercicios;

public class Ejercicio1c {
    public static void main(String[] args) {
        
        int numeros [] = new int []{1,2,5,10,20};
        
        int numx = 2;
        int resultado = 0;
        
        for(int i=0; i<numeros.length; i++){
        
          if(numx<numeros[i]){
           
             resultado = resultado + numeros[i];
              
          }
        
        }
        
          System.out.println(resultado);      
        
    }
}
