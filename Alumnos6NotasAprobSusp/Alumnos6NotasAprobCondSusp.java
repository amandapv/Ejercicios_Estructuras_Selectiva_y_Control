//Dadas 6 notas, escribir la cantidad de alumnos aprobados, condicionados (=4) y suspensos.

package Alumnos6NotasAprobSusp;

import java.util.Scanner;

public class Alumnos6NotasAprobCondSusp {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int nota;
        int contAprob = 0;
        int contSusp = 0;
        int contCondic = 0;

        for (int i=1; i<=6; i++) {

            System.out.println("Dime una nota");
            nota = teclado.nextInt();

            if (nota >4) {
                contAprob++;
            }

            if (nota == 4) {
                contCondic++;
            }

            if (nota <4) {
                contSusp++;
            }
        }

        System.out.println("Aprobados hay: " + contAprob);
        System.out.println("Condicionados hay: " + contCondic);
        System.out.println("Suspensos hay: " + contSusp);

    }
}