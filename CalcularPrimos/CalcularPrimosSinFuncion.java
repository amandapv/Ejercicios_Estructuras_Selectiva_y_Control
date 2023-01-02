package CalcularPrimos;

import java.util.Scanner;

public class CalcularPrimosSinFuncion {
    public static void main (String[] args) {
        Scanner teclado = new Scanner(System.in);

        //Variables
        int num = 0;
        //int contadorPrimos = 2;
        boolean primo;

        System.out.println("Dime un número");
        num = teclado.nextInt();

       /* while (num > contadorPrimos) {
            primo=true;
            //Bucle que recorre todos los números a partir de la posición en la que estoy (empiezo en el 2 y acabo en el número anterior al que me hayan introducido. Esto es así porque es la manera de calcular los primos)
            for (i=2; i<num; i++) {

                if (num % i == 0) {
                    primo=false;

                    System.out.println("El número no es primo");
                    //En cuanto sabemos que NO es primo, no lo seguimos recorriendo
                    break;
                }
            }


            //Solo podemos saber que un número es primo tras haber dividido entre todos y no ser cero
            if (primo){ //una condición recibe siempre un booleano, por ejemplo el resultado de un == o un > o una variable booleana (como en este caso). La manera de hacerlo siendo redundate sería primo == true
                System.out.println("El número es primo");

              //  contadorPrimos ++;
            }

            System.out.println("El número es primo");
            System.out.println("Contador  primos" + contadorPrimos);

        }*/

        for (int i=2;i<num;i++) {

            boolean esPrimo = true;

            for (int j=2; j<i; j++) {

                if (i % j == 0) {
                    esPrimo = false;
                    System.out.println("El número no es primo:" + i);
                    break;
                }

            }
            if (esPrimo) {
                System.out.println("El número es primo:" + i);

            }
        }
    }
}
