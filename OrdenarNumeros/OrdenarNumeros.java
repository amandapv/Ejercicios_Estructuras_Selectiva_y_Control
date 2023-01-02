//Escribe un programa que ordene tres números enteros introducidos por teclado.

package OrdenarNumeros;

import java.util.Scanner;

public class OrdenarNumeros {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        //variable
        int num1, num2, num3;

        //pedir los datos por teclado
        System.out.println("Dime un número");
        num1 = teclado.nextInt();

        System.out.println("Dime otro número");
        num2 = teclado.nextInt();

        System.out.println("Dime un último número");
        num3 = teclado.nextInt();


        //proceso
        if (num1 < num2 && num2 < num3) {
            System.out.println(num1 + ", " + num2 + ", " + num3);

        } else if (num1 < num3 && num3 < num2) {
            System.out.println(num1 + ", " + num3 + ", " + num2);

        } else if (num2 < num1 && num1 < num3) {
            System.out.println(num2 + ", " + num1 + ", " + num3);

        } else if (num2 < num3 && num3 < num1) {
            System.out.println(num2 + ", " + num3 + ", " + num1);

        } else if (num3 < num1 && num1 < num2) {
            System.out.println(num3 + ", " + num1 + ", " + num2);

        } else if (num3 < num2 && num2 < num1) {
            System.out.println(num3 + ", " + num2 + ", " + num1);
        }
    }
}
