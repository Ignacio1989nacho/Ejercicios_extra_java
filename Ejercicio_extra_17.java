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
public class Ejercicio_extra_17 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingresa un numero:");
        int num = leer.nextInt();

        boolean comprobacion = comp(num);

        System.out.println("el numero es primo?:" + comprobacion);

    }

    public static boolean comp(int num) {
        boolean comp = false;
        int cont = 0;
        for (int i = 1; i <= num ; i++) {
           
            if (num % i == 0) {
                cont++;
            }
        }
        if (cont == 2) {
            comp = true;
        }
        return comp;
    }

}
