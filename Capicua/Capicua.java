//Pedir un número entre 0 y 99.999, decir si es capicúa (se lee igual de izqda a dercha que viceversa).

package Capicua;

import java.util.Scanner;

public class Capicua {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int num;

        System.out.println("Dime un número entre 0 y 999. Te diré cuántos dígitos tiene. Si introduces un 0 acaba el programa");
        num = teclado.nextInt();


        do {
            System.out.println("Dime un número entre 0 y 999. Te diré cuántos dígitos tiene. Si introduces un 0 acaba el programa");
            num = teclado.nextInt();

            if (num % 11 == 0) {
                System.out.println("El número " + num + " es capicúa");
            }

        } while (num >= 0 && num <= 99999);
    }
}