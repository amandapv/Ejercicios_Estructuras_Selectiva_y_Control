package CalcularPrimos;

import java.util.Scanner;

public class CalcularPrimosConFuncion2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int num;
        boolean esPrimo = true;

        System.out.println("Dime un número");
        num = teclado.nextInt();

        for (int i=1; i<num; i++) {
            esPrimo = esPrimoBoolean(i);

            System.out.println("Los números primos son: " + esPrimo + " " + i);

        }
    }

    public static boolean esPrimoBoolean(int numPrimo) {

        for (int i=2; i<numPrimo; i++) {
            if (numPrimo  % i == 0) {
                return false;
            }
        }
        return true;
    }
}
