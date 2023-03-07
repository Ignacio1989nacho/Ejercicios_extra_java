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
public class Ejercicio_extra_8 {

    public static void main(String[] args) {

    int [] tod = v();


    
        for (int i = 0; i < tod.length; i++) {System.out.println(tod[i]);}
     
        
        
    }

    public static int[] v() {

        int[] v = new int[3];
        boolean valor = false;
        int num_par = 0;
        int num_impar = 0;
        int total = 0;
        
        Scanner leer = new Scanner(System.in);

        while (valor == false)  {
            System.out.println("ingresa un numero:");

            int num = leer.nextInt();
            
            
            if (num < 0){
                continue;
            }
            
            if (num % 5 == 0) {

                break;
                
            }

            if (num % 2 != 0 && num > 0 ) {

                num_impar = num_impar + 1;
                total = total + 1;
            } else {

                num_par = num_par + 1;
                total = total + 1;
            }


        } 

        v[0] = total;
        v[1] = num_par;
        v[2] = num_impar;

            
        
        return v;
    }
}
