package CalcularPrimos;

import java.util.Scanner;

public class CalcularPrimosConFuncion {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        //Variables
        int num;

        System.out.println("Dime un número");
        num = teclado.nextInt();

        for (int i=2;i<num;i++) {
            boolean esPrimo = CalcularPrimos(i);
            if (esPrimo) {
                System.out.println("El número es primo:" + i);
            }else {
                System.out.println("El número no es primo:" + i);
            }
        }
    }

    public static boolean CalcularPrimos (int i) {
        for (int j=2;j<i;j++) {
            if (i % j == 0) {
                return false;
            }
        }
        return true;
    }
}