/*
6. Diseñe una función que pida el nombre y la edad de N personas e imprima los datos de
las personas ingresadas por teclado e indique si son mayores o menores de edad.
Después de cada persona, el programa debe preguntarle al usuario si quiere seguir
mostrando personas y frenar cuando el usuario ingrese la palabra “No”.
 */
package java_ejercicios_extras_1al10;

import java.util.Scanner;

public class Ejercicio_extra_16 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        boolean log = false;

        do {
            impresion();

            System.out.println("desea seguir? S/N");
            char conf = leer.next().charAt(0);

            if (conf == 'S' || conf == 's') {
                log = true;
            }

            if (conf == 'N' || conf == 'n') {
                log = false;
            }
            
        } while (log == true);
    }

    public static void impresion() {

        Scanner leer = new Scanner(System.in);

        System.out.println("ingresa el nombre:");
        String nombre = leer.nextLine();

        System.out.println("ingresa la edad:");
        int edad = leer.nextInt();

        if (edad >= 18) {

            System.out.println("es mayor de edad!");

        } else {

            System.out.println("es menor de edad");
        }

    }

}
