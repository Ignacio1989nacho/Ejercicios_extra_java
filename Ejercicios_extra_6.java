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
    public static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Cantidad de personas:");
        
        int per = leer.nextInt();

        double[] v = new double[per];

        for (int i = 0; i < per; i++) {
            System.out.println("Altura:");
            double alt = leer.nextDouble();
            v[i] = alt;
        }
       
        double contMenos = 0;
        int total_Menos = 0;
        
        for (int i = 0; i < v.length; i++) {
            if (v[i] < 1.60) {
                contMenos = contMenos + v[i];
                total_Menos += 1;
            }
        }
        
        double totMenos = contMenos / total_Menos;
        
        double total = 0;
        double prom = 0;
        
        for (int i = 0; i < v.length; i++) {
            prom = prom + v[i];
        }
        
        total = prom / per;

        System.out.println("el promedio de estatura menor a 1.60 es: " + totMenos  + " El promedio total de estaturas es: " + total);

    }

}
