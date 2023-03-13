/*
Los profesores del curso de programación de Egg necesitan llevar un registro de las notas
adquiridas por sus 10 alumnos para luego obtener una cantidad de aprobados y
desaprobados. Durante el periodo de cursado cada alumno obtiene 4 notas, 2 por
trabajos prácticos evaluativos y 2 por parciales. Las ponderaciones de cada nota son:
Primer trabajo práctico evaluativo 10%
Segundo trabajo práctico evaluativo 15%
Primer Integrador 25%
Segundo integrador 50%
Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo. Al final del
programa los profesores necesitan obtener por pantalla la cantidad de aprobados y 
desaprobados, teniendo en cuenta que solo aprueban los alumnos con promedio mayor o
igual al 7 de sus notas del curso.
 */
package java_ejercicios_extras_1al10;

public class Ejercicio_extra_21 {

    public static void main(String[] args) {

        double[][] m = matriz();

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(m[i][j] + " | ");

            }
            System.out.println("");
        }
        int aprobados = 0;
        int desaprobados = 0;

        for (int i = 0; i < m.length; i++) {
            for (int j = 4; j < 5; j++) {
                if (m[i][4] >= 7) {

                    aprobados++;
                } else {
                    desaprobados++;
                }

            }

        }
        System.out.println("Aprobados:" + aprobados);
        System.out.println("Desaprobados:" + desaprobados);
    }

    public static double[][] matriz() {
        double[][] matriz = new double[10][5];
        double[] vec = new double[1];
        for (int i = 0; i < matriz.length; i++) {
            double suma = 0;
            for (int j = 0; j < 5; j++) {

                matriz[i][j] = (int) (Math.random() * 10);

                suma = suma + matriz[i][j];
                vec[0] = suma;
                if (matriz[i][3] == matriz[i][j]) {
                    matriz[i][4] = vec[0] / 4;
                    j = 4;
                }

            }

        }

        return matriz;
    }

}
