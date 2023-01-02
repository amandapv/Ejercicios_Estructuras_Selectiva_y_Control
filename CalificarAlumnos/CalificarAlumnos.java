/*
Confeccionar un programa que pida por teclado (ampliado a n) notas de un alumno, calcule el valor e imprima alguno de estos mensajes:
    Si el valor es >=7 mostrar "Bien".
    Si el valor es >=4 y <7 mostrar "Regular".
    Si el valor es <4 mostrar "Suspenso".
Versión 1. N alumnos hasta q una nota sea -1
Versión 2. Distintas notas para cada alumnos y cálculo del promedio de las mismas
Versión 3. Cálculo estadístico (número alumnos con nota y número de Bienes,Regulares y Suspensos )
NOTA. Mejora. Sólo permitir valores de nota 0..10
 */

package CalificarAlumnos;

import java.util.Scanner;

public class CalificarAlumnos {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        //Variables
        int numAlumno = 0;

        //Código
        while (numAlumno >= 0 && numAlumno <= 10) {

            //Entrada de datos
            System.out.println("Dime tu nota");
            numAlumno = teclado.nextInt();

            if (numAlumno >=7 && numAlumno <= 10) {
                System.out.println("Bien");

            } else if (numAlumno >=4 && numAlumno <7) {
                System.out.println("Regular");

            } else if (numAlumno <4 && numAlumno >= 0){
                System.out.println("Suspenso");
            }
        }
    }
}
