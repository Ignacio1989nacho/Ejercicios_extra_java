/*
Realizar un algoritmo que calcule la suma de todos los elementos de un vector de tamaño
N, con los valores ingresados por el usuar
 */
package java_ejercicios_extras_1al10;

import java.util.Scanner;

public class Ejercicio_extra_18 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("ingresa el tamaño del vector:");

        int tamaño = leer.nextInt();

        int[] vec = new int[tamaño];
        
        int total = suma(vec);
        
        System.out.println("el total es:"+total);

    }

    public static int suma(int[] vec) {
        Scanner leer = new Scanner(System.in);
        int suma = 0;
        int numeros = 0;

        for (int i = 0; i < vec.length ; i++) {
            System.out.println("Ingresa los numeros a sumar:");
            numeros = leer.nextInt();
            vec[i]=numeros;
        }
        
        for (int i = 0; i < vec.length; i++) {
            suma = suma + vec[i];
            
        }
        
        return suma;

    }
}
