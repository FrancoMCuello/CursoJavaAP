
package Clase3Ejercicios;

import java.util.Scanner;


public class Ejercicio1a {
     public static void main(String[] args) {
         
         Scanner scn = new Scanner(System.in);
    
      System.out.println("Ejercicio 1.a");
        
      String texto = "Hola buenas tardes! Como estas?";
        char letra;
        int numeroDeVeces = 0;
        
        letra = 'e';
           
        /*  String[] palabras = texto.split(" ");
        
        
        for(String i:palabras){
          
            if(letra==letra){
            numeroDeVeces = numeroDeVeces++;
            }
        
            System.out.println(numeroDeVeces);
        }
        
        */        
      
        numeroDeVeces = contarLetras(texto, letra);
        
        System.out.println(numeroDeVeces);
        
        
        
        
    }

    private static int contarLetras(String texto, char letra){
        int posicion,contador = 0;
        
        posicion = texto.indexOf(letra);
        
        while(posicion != -1){
        
            contador++;
            
            posicion = texto.indexOf(letra, posicion +1);
        
        }
        
        return contador;
    
    } 
       
    
}
