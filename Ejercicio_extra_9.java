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
public class Ejercicio_extra_9 {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        int num1 = -1;
        int num2 = 0;
        
        
        while (num1 < num2){
        System.out.println("Ingresa dos numeros para dividirlos entre si");
        
        num1 = leer.nextInt();
        num2 = leer.nextInt();
        
        }
        
        int [] vec = v(num1,num2);
        
        
        for (int i = 0; i < vec.length; i++) {
            System.out.println(vec[i]);
            
        }
        
        
    }
    
    public static int [] v (int num1, int num2){
    int [] v = new int [2];
    int cociente = 1;
    int residuo = 0;
    int res = num1 - num2;
    
    while (res >= num2){
        
    cociente = cociente + 1;
    
    res = res - num2;

    
    }
    v[0] = cociente;
    v[1] = res;
    
    return v;
    
    
    }
    
}
