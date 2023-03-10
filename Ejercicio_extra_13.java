/*
Crear un programa que dibuje una escalera de números, donde cada línea de números
comience en uno y termine en el número de la línea. Solicitar la altura de la escalera al
usuario al comenzar. Ejemplo: si se ingresa el número 3: 
 */
package java_ejercicios_extras_1al10;

import java.util.Scanner;

public class Ejercicio_extra_13 {

    public static void main(String[] args) {

        e();

    }

    public static void e() {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingresa el tamaño de la escalera:");

        int num = leer.nextInt();
        int cont = 0;
        for (int i = 0; i < num; i++) {
            for (int j =1; j < i+1; j++) {
                System.out.print(j);
                
            }
            cont++; 
            System.out.println(cont);
            
        }

    }
}
