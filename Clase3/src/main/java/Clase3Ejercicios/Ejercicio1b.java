
package Clase3Ejercicios;

import java.util.Arrays;
import java.util.Scanner;


public class Ejercicio1b {
   
public static void main(String[] args) { 
    
   Scanner scn = new Scanner (System.in); 
   
   System.out.println("Ingrese 3 numeros");
    
   int num1 = scn.nextInt();
   int num2 = scn.nextInt();
   int num3 = scn.nextInt();
   
   int numOrdenados[] = new int[] {num1,num2,num3};
   
   Arrays.sort(numOrdenados);
   
   for(int i=0; i<numOrdenados.length;i++){
   System.out.println(numOrdenados[i]);
    }
   }
}
