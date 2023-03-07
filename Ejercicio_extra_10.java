/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_ejercicios_extras_1al10;
import java.util.Scanner;


public class Ejercicio_extra_10 {
    public static void main(String[] args) {
        
     
     int num1 = (int) (Math.random()* 9);
     int num2 = (int) (Math.random()* 9);
     
     
     int tot = num1 * num2;
        System.out.println(tot);
     String r = res (tot);
     
     
        System.out.println(r);
     
        
    }
    public static String res (int tot){
    int n = 0;
    String res = "";
    Scanner leer = new Scanner(System.in);
    
        System.out.println("Ingresa el resultado de la multiplicacion aleatoria d=D :");
    n = leer.nextInt();
    
    while (n != tot){
        System.out.println("Incorrecto!");  
    System.out.println("Ingresa el resultado de la multiplicacion aleatoria d=D :");
    n = leer.nextInt();
    
    
    }
    
    res += "Correcto!";
    
    return res;
    }
  
}
