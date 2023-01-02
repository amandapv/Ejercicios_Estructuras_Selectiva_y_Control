package CalcularImpar;

import java.util.Scanner;

public class VersionConFunciones {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        //Definir variables
        int num, num2, num3, suma;

        boolean parImpar;
        boolean parImpar2;
        boolean parImpar3;

        System.out.println("Dime un número");
        num = teclado.nextInt();
        System.out.println("Dime un número");
        num2 = teclado.nextInt();
        System.out.println("Dime un número");
        num3 = teclado.nextInt();


        parImpar = esImpar(num);
        System.out.println(parImpar);
        parImpar2 = esImpar(num2);
        System.out.println(parImpar2);
        parImpar3 = esImpar(num3);
        System.out.println(parImpar3);

        suma = sumar(num, num2, num3);
        System.out.println(suma);

    }

    public static boolean esImpar(int numImpar) {
        if (numImpar % 2 == 0) {
            return false;
        }
        return true;
    }

    public static int sumar(int numSuma1, int numSuma2, int numSuma3) {

        return numSuma1 + numSuma2 + numSuma3;

    }
}