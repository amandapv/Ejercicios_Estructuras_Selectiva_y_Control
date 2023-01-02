/*
Escribir un programa que imprima todos los números pares entre dos números que se le pidan al usuario. Variante1.Contabilizarlos.
Variante2. Mostrarlos en orden.
*/

package ImprimirParesEntre2Num;

import java.util.Scanner;

public class ImprimirParesEntre2Num {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        //Definir variables
        int num1;
        int num2;
        int acumul = 0;
        int i;
        int suma = 0;

        System.out.println("Dime un número donde iniciaremos el contador de pares");
        num1 = teclado.nextInt();

        System.out.println("Dime otro número donde finalizaremos el contador de pares");
        num2 = teclado.nextInt();

        /*
        Bucle que inicia en el número1 introducido por el usuario (y le suma 1 para que no empiece el bucle en ese propio número, ya que el ejercicio es el cálculo entre los 2 introducidos)
        el numero2 será hasta donde puede llegar el bucle (sin contar ese propio número). La variable i del bucle for es la que recorrerá entre el número1 y número2. Esa es la que nos sirve para
        revisar cada "i" si es par o no. Ahí empieza la condición en la que si es par, la variale i que es la que recorre entre el num1 y num2, si es par se suma uno al acumulador
        */
        for (i = num1 + 1; i < num2; i++) {
            if (i % 2 == 0) {
                acumul++;
                System.out.println("Yo soy par! " + i);
                suma = suma + i;
            }
        }

        System.out.println("El total de pares es: " + acumul);
        System.out.println("La suma de los pares es: " + suma);

    }
}
