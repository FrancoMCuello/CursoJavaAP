
package com.yoprogramo.clase1;

import java.util.Scanner;

public class Clase1 {

    public static void main(String[] args) {
        
        int numeroInicio = 5;
        int numeroFin =14;
                
        //Ejercicio 1.a
        
        System.out.println("Resultado Ejercicio 1.a");
        while (numeroInicio <= numeroFin){
        
            
        System.out.println( numeroInicio++);
        
       
        
        }
        
        
        //Ejercicio 1.b
        System.out.println("Resultado Ejercicio 1.b");
        
        int numInicio = 5;
        int numFin =14;
        
        
        while (numInicio <= numFin){
          numInicio = numInicio + 1;
          if(numInicio%2 == 0){
            System.out.println(numInicio);
          }
          
        }
        
        //Ejercicio 1.c
        System.out.println("Resultado Ejercicio 1.c");
        System.out.println("Ingrese 1 si quiere par, 2 impar.");
        
        Scanner sc = new Scanner(System.in);
        int numI = 5;
        int numF = 14;
        int esPar = sc.nextInt(); 
        
        while (numI <= numF){
        numI = numI + 1;
            if(esPar == 1 && numI%2 ==0 ){
              System.out.println(numI);
          } if(esPar != 1 && numI%2 !=0) {
              System.out.println(numI);
            
          }
        }
        
        //Ejercicio 1.d
        System.out.println("Resultado Ejercicio 1.d");
        
        for(int nI=14; nI>=5; nI--){
            if(nI%2==0){
            System.out.println(nI);
            }
        }
        
        //Ejercicio 2
        
        System.out.println("Resultado Ejercicio 2");
        
        System.out.println("Ingrese sus ingresos familiares del hogar");
        float ingresos = sc.nextFloat();
        
        System.out.println("Ingrese sus ingresos cantidad de vehiculos que posee");
        int vehiculos = sc.nextInt();
        
        System.out.println("Ingrese sus ingresos cantidad de inmuebles que posee");
        int inmuebles = sc.nextInt();
        
        System.out.println("Ingrese true si posee algun lujo, false si no");
        boolean lujos = sc.nextBoolean(); 
        
        if ((ingresos>=489083)&&(vehiculos>=3)&&(inmuebles>=3)&&(lujos==true)){
        
            System.out.println("Pertenece al segmento de ingresos altos");
        
        } else {
        
            System.out.println("No pertenece al segmento de ingresos altos");
        
        }
        
        
      }
        
    }

