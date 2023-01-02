//Escribir un programa que solicite la carga de un número entre 0 y 999, y nos muestre un mensaje de cuantos digitos tiene el mismo.
//Finalizar el programa cuando se cargue el valor 0.

package CargaNumCuantosDigitTiene;

import java.util.Scanner;

public class CargaNumCuantosDigitTiene {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int num;

        System.out.println("Dime un número entre 0 y 999. Te diré cuántos dígitos tiene. Si introduces un 0 acaba el programa");
        num = teclado.nextInt();

        while (num != 0) {

            if (num > 0 && num < 10) {
                System.out.println("Tiene una cifra");
            }
            if (num > 11 && num < 100) {
                System.out.println("Tiene dos cifras");
            }
            if (num > 101 && num < 1000) {
                System.out.println("Tiene tres cifras");
            }

            System.out.println("Dime un número entre 0 y 999. Te diré cuántos dígitos tiene. Si introduces un 0 acaba el programa");
            num = teclado.nextInt();
        }
    }
}