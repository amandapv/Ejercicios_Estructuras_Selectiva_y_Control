/*
Realizar un programa que calcule el área de varios círculos hasta que se cumpla la condición  que el radio de uno de ellos  será cero.
    Este enunciado se debe hacer con  While y do_While, ya que son repetitivas de recurrencia dependiente variable. Para hacerlo con
    For tendríamos que indicar el número exacto de veces que tenemos que repetir el proceso.
 */

package AreaCirculo;

import java.util.Scanner;

public class AreaCirculo {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        //variables
        int radio;
        double pi = 3.14;
        double area;

        do {

            System.out.println("Dime el radio de un círculo y te calculo su área");
            radio = teclado.nextInt();

            //cálulo del radio
            area = pi * (radio * radio);

            if (radio !=0) {
                System.out.println("El area de este círculo es: " + area);
            }

        } while (radio !=0);
    }
}
