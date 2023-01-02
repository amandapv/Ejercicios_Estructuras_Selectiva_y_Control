package ImprimirParesEntre2Num;

import java.util.Scanner;

public class VersionConFuncion {

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
        for (i = num1 + 1; i < num2; i++) {
            if (esPar(i)) {
                acumul++;
                suma = suma + i;
            }

        }

        System.out.println("El total de pares es: " + acumul);
        System.out.println("La suma de los pares es: " + suma);
    }

    public static boolean esPar (int i){

        if (i % 2 == 0) {
            System.out.println("Yo soy par! " + i);
            return true;
        }
        return false;
    }
}