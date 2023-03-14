/*
Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el
promedio de n números (n>0). El valor de n se solicitará al principio del programa y los
números serán introducidos por el usuario. Realice dos versiones del programa, una
usando el bucle “while” y otra con el bucle “do - while”.

 */
package java_ejercicios_extras_1al10;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio_extra_7 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num = 0;
        int total = 0;
        int contador = 0;
        int promedio = 0;

        while (contador < 3) {
            System.out.println("Ingresa un numero:");
            num = leer.nextInt();

            if (num > 0) {
                total = total + num;
                contador = contador + 1;
            }
        }
        promedio = total / contador;

        System.out.println("TOTAL SUMA NUMEROS " +total);
        System.out.println("PROMEDIO DE NUMEROS " +promedio);
        
        
        v(num);
        
      
        
    }

    public static void v(int num) {
        Scanner leer = new Scanner(System.in);
        int[] v = new int[2];

        int total = 0;
        int contador = 0;
        int promedio = 0;

        do {

            System.out.println("Ingresa un numero:");
            num = leer.nextInt();
            if (num > 0) {
                total = total + num;
                contador = contador + 1;
            }

        }while(contador <3);
        promedio = total / contador;
       for (int i = 0; i < 1; i++) {
            System.out.println("el total es de: "+total);
            System.out.println("el promedio es de: "+promedio);
        }

  
    
    }

}
