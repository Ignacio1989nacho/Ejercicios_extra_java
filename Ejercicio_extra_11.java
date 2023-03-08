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
public class Ejercicio_extra_11 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        
        System.out.println("Ingresa un numero:");
        int num = leer.nextInt();
        
     int n = nn(num);
     
        System.out.println(n);
        
    }
   public static int nn (int num){
   int nn = 0;
   int cont = 0;
    
       while (num != 0){
        nn += 1;
        num /= 10;
        
        
        }
    
    
    return nn;
    
    
   }

}
