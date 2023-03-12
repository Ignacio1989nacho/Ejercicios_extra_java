/*
Escriba un programa que averigüe si dos vectores de N enteros son iguales (la
comparación deberá detenerse en cuanto se detecte alguna diferencia entre los
elementos).
 */
package java_ejercicios_extras_1al10;

import java.util.Scanner;

public class Ejercicio_extra_19 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[] v = new int[5];
        int[] vv = new int[5];
        int cont = 1;
        boolean comp = false;

        for (int i = 0; i < v.length; i++) {
            System.out.println("Ingresa los numeros para el primer vector:");

            int numeros = leer.nextInt();

            v[i] = numeros;

        }

        do {

            for (int i = 0; i < vv.length; i++) {
                System.out.println("Ingresa los numeros para el segundo vector:");

                int numeros = leer.nextInt();

                vv[i] = numeros;

                if (v[i] != vv[i]) {
                    i = vv.length;
                    cont = 5;
                    System.out.println("EL VALOR DE LOS VECTORES NO SON IGUALES!");
                }
                cont++;
            }

        } while (cont == 5);
        

    }

}
