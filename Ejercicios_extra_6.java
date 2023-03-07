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
public class Ejercicios_extra_6 {
    public static void main(String[] args) {
       
     Scanner leer = new Scanner(System.in);
        System.out.println("Cantidad de personas:");
        
        int per = leer.nextInt();
        
        double [] v = new double [per];
        
        for (int i = 0; i < per; i++) {
            System.out.println("Altura:");
            double alt = leer.nextDouble();
            
            v[i]=alt;
   
        }
        int contotal = 0;
        int contmenos = 0;
        for (int i = 0; i < v.length; i++) {
            if (v[i]<= 1.60){
        contmenos = contmenos + 1;
        }
            contotal = contotal + 1;
        }
    
        System.out.println("hay: "+contmenos+" cantidad de personas menores a 1.60."+"En total son: "+contotal+" personas.");
        
    }
    
}
