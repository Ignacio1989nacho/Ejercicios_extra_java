/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_ejercicios_extras_1al10;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class Ejerciocio_extra_3 {
    public static void main(String[] args) {
        
    Scanner leer = new Scanner(System.in);

        System.out.println("Ingresa una letra");
        
     String letra = leer.nextLine();   
    
     boolean comp = c(letra);
     
     
        System.out.println("La letra ingresada es vocal?: "+comp);
    }
    
    public static boolean c(String letra){
    
    boolean c = false;
    
    
    switch (letra){
    
        case "a":
            c = true;
            break;
        case "e":
            c = true;
            break;
        case "i":
            c = true;
            break;
        case "o":
            c = true;
            break;
        case "u":
            c = true;
            break;
       
            
    
    
    }
    
    return c;
    }
    
}
