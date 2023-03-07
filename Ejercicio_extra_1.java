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
public class Ejercicio_extra_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa la cantidad de minutos");
        int min = leer.nextInt();
        
        int horas = min / 60;
        int dias = horas / 24;
        int hora = horas % 24;
        
        
        System.out.println("dias: "+dias+" - "+"horas: "+hora);
        
        
    }
    
}
