/*
Realiza una aplicación que nos pida un número de ventas a introducir, después
nos pedirá tantas ventas por teclado como número de ventas se hayan indicado.
   Al final mostrara la suma de todas las ventas. Piensa que es lo que se repite y lo que no.
 */

package NumeroVentas;

import java.util.Scanner;

public class NumeroVentas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        //variables
        int numVentas;
        int ventas;
        int suma = 0;

        System.out.println("Dime el número de ventas");
        numVentas = teclado.nextInt();

        for (int i=1; i<=numVentas; i++) {

            System.out.println("¿Total de esta venta?");
            ventas = teclado.nextInt();

            suma = suma + ventas;
        }
        System.out.println("Total ventas: " + suma);
    }
}