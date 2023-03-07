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
public class Ejercicio_extra_7 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num = 0;
        int total = 0;
        int contador = 0;
        int promedio = 0;

        while (contador < 3) {
            System.out.println("Ingresa un numero:");
            num = leer.nextInt();

            if (num > 0) {
                total = total + num;
                contador = contador + 1;
            }
        }
        promedio = total / contador;

        System.out.println(total);
        System.out.println(promedio);
        
        
        int [] vec = v(num);
        
        for (int i = 0; i < 1; i++) {
            System.out.println("el total es de: "+vec[0]);
            System.out.println("el promedio es de: "+vec[1]);
        }
        
    }

    public static int[] v(int num) {
        Scanner leer = new Scanner(System.in);
        int[] v = new int[2];

        int total = 0;
        int contador = 0;
        int promedio = 0;

        do {

            System.out.println("Ingresa un numero:");
            num = leer.nextInt();
            if (num > 0) {
                total = total + num;
                contador = contador + 1;
            }

        }while(contador <3);
        promedio = total / contador;
        v[0] = total;
        v[1] = promedio;

    return v;
    
    }

}
