/*
Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar,
restar, multiplicar y dividir. La aplicación debe tener una función para cada operación
matemática y deben devolver sus resultados para imprimirlos en el main
 */
package java_ejercicios_extras_1al10;

import java.util.Scanner;

/**
 *
 * @author UsuarioIG
 */
public class Ejercicio_extra_15 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa 2 numeros:");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();

        System.out.println("MENU\n"
                + "1. Sumar\n"
                + "2. Restar\n"
                + "3. Multiplicar\n"
                + "4. Dividir\n"
                + "Elija opción:");

        int suma = sum(num1, num2);
        int resta = rest(num1, num2);
        int mult = multi(num1, num2);
        double div = divi(num1, num2);

        int op1 = leer.nextInt();

        switch (op1) {

            case 1:
                System.out.println(suma);
                break;
            case 2:
                System.out.println(resta);
                break;
            case 3:
                System.out.println(mult);
                break;
            case 4:
                System.out.println(div);
                break;

        }

    }

    public static int sum(int num1, int num2) {
        int sum = 0;

        sum = num1 + num2;

        return sum;
    }

    public static int rest(int num1, int num2) {
        int rest = 0;

        rest = num1 - num2;

        return rest;
    }

    public static int multi(int num1, int num2) {
        int multi = 0;

        multi = num1 * num2;

        return multi;
    }

    public static double divi(int num1, int num2) {
        int divi = 0;

        divi = num1 / num2;

        return divi;
    }

}
