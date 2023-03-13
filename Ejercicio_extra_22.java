/*
Realizar un programa que rellene una matriz de tamaño NxM con valores aleatorios y
muestre la suma de sus elementos.
 */
package java_ejercicios_extras_1al10;

public class Ejercicio_extra_22 {

    public static void main(String[] args) {
        m();
    }

    public static void m() {

      int [][] matriz = new int [4][3];
      int suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j]=(int)(Math.random()*10);
                
                suma = suma +matriz[i][j];
                System.out.print(matriz[i][j]+" | ");   
            }
            System.out.println("");
        }
        System.out.println("total:"+suma);
        
    }

}
