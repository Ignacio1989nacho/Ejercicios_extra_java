/*
Crear una función rellene un vector con números aleatorios, pasándole un arreglo por
parámetro. Después haremos otra función o procedimiento que imprima el vector.
 */
package java_ejercicios_extras_1al10;

public class Ejercicio_extra_20 {

    public static void main(String[] args) {

        int[] v = vec();

        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i] + " - ");
        }
    }

    public static int[] vec() {
        int[] vec = new int[5];
        int[] vec2 = new int[1];

        for (int i = 0; i < vec.length; i++) {

            vec2[0] = (int) (Math.random() * 5);
            vec[i] = vec2[0];

        }
        return vec;
    }
}
