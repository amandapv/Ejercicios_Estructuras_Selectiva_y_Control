/*
Bucle do-while que termina cuando se introduce por teclado un número impar. Mostrar la suma de los pares
*/

package CalcularImpar;

import java.util.Scanner;

public class CalcularImpar {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        //Definir variables
        int num;
        int acumul = 0;
        int suma = 0;

        do {
            System.out.println("Dime números... esto acabará cuando me des un número impar!");
            num = teclado.nextInt();

            if (num % 2 == 0){ //variante a mayores que comenta la profesora para meter en una variable los pares y así al acabar el código le digo al usuario cuantos pares hubo hasta que fue impar y acabó la ejecución
                acumul++;
                suma = suma + num;

            }


        }while (num % 2 == 0); //esto realizará el bucle hasta que el número introducido sea impar, por lo que la regla es que se realice el bucle mientras que el numero introducido sea par.

        System.out.println("El total de pares es: " + acumul + ". La suma de los pares es: " + suma);

    }
}
