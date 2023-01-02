//Pedir 5 números e indicar si alguno es múltiplo de 3.
//% módulo es el resto de la división entre el número especificado
package Pedir5NumerosMltiplosDe3;

import java.util.Scanner;

public class Pedir5NumerosMltiplosDe3 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        //variables
        int num;

        for (int i=1; i<=5; i++) {

            System.out.println("Dime un número y te digo si alguno es multiplo de 3");
            num = teclado.nextInt();


            if (num % 3 == 0) {
                System.out.println("El número es múltiplo de 3");
            }
        }
    }
}
