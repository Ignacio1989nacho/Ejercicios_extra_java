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
public class Ejercicio_extra_5 {

    public static void main(String[] args) {
        
      double mm = m1();

        System.out.println("su monto actualizado con descuentos es de: "+mm);
      
    }

    public static double m1() {
        double m1 = 0;
        double total = 0;
        Scanner leer = new Scanner(System.in);

        System.out.println("Tipo de plan:");
        String tipo = leer.nextLine();

        System.out.println("monto a pagar:");
        double monto = leer.nextDouble();

        switch (tipo) {

            case "A":
                total = 50 * monto / 100;
                m1 = monto - total;
                break;
            case "B":
                total = 35 * monto / 100;
                m1 = monto - total;
                break;

            case "C":
                
                m1 = monto;
                break;

        }
        return m1;
    }

}
