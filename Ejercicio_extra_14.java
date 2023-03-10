/*
Se dispone de un conjunto de N familias, cada una de las cuales tiene una M cantidad de
hijos. Escriba un programa que pida la cantidad de familias y para cada familia la
cantidad de hijos para averiguar la media de edad de los hijos de todas las familias
 */
package java_ejercicios_extras_1al10;

import java.util.Scanner;

public class Ejercicio_extra_14 {

    public static void main(String[] args) {

        f();
        
    }

    public static void f() {
        int total_hijos = 0;
        double suma = 0;
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Cuantas familias son:");
        
        int familias = leer.nextInt();
        
          for (int i = 0; i < familias; i++) {
              
              
            System.out.println("la familia numero "+(i+1)+" cuantos hijos tiene?:");
            
            int hijos = leer.nextInt();
            
            int [] fam = new int [hijos];
            
            total_hijos = total_hijos + hijos;
              
            for (int j = 0; j < hijos; j++) {
                  
                  
                  System.out.println("Que edad tienen los chicos?");
                  int edades = leer.nextInt();
                  fam[j] = edades;
                  
                  suma = suma + edades;
                  
              }
             
              
           
        }
         System.out.println((suma/total_hijos));  
            
            
        }

    }




   