/*
Realiza un programa que pinte un reloj de arena relleno hecho de asteriscos. El programa debe pedir la altura.
Se debe comprobar que la altura sea un número impar mayor o igual a 3, en caso contrario se debe mostrar un
mensaje de error. Ejemplo: Por favor, introduzca la altura del reloj de arena: 5
    *****
     ***
      *
     ***
    *****
 */

package RelojArena;

import java.util.Scanner;

public class RelojArena {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        //variables
        int num;

        System.out.println("Dime la altura del reloj de arena. Debe ser un número impar mayor o igual a 3.");
        num = teclado.nextInt();

        //código

        if (num % 2 != 0 && num >= 0 && num >= 3) {

            for (int i=0; i==num; i++) {

                System.out.printf("*");
            }

        } else {
            System.out.println("Lo siento, ese número no es válido.");
        }




    }
}

