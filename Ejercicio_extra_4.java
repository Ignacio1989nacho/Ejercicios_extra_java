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
public class Ejercicio_extra_4 {

    public static void main(String[] args) {

        String rr = r();

        System.out.println(rr);
    }

    public static String r() {
        Scanner leer = new Scanner(System.in);

        String r = "";

        System.out.println("Ingres un numero y te muestro si equivalente romano:");

        int n = leer.nextInt();

        switch (n) {

            case 1:
                r += "I";
                break;
            case 2:
                r += "II";
                break;
            case 3:
                r += "III";
                break;
            case 4:
                r += "IV";
                break;
            case 5:
                r += "V";
                break;
            case 6:
                r += "VI";
                break;
            case 7:
                r += "VII";
                break;
            case 8:
                r += "IIX";
                break;
            case 9:
                r += "IX";
                break;
            case 10:
                r += "X";
                break;

            default:
                r += "No corresponde ningun numero de la lista";
                break;
        }

        return r;

    }
}
