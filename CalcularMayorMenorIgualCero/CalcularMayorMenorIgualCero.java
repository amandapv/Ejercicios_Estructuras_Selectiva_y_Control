package CalcularMayorMenorIgualCero;

/*
Realizar un algoritmo que pida números (se pedirá por teclado la cantidad de números a introducir). El programa
debe informar de cuantos números introducidos son mayores que 0, menores que 0 e iguales a 0.
 */

import java.util.Scanner;

public class CalcularMayorMenorIgualCero {
    public static void main () {
        Scanner teclado = new Scanner(System.in);

        int i;
        //contador positivos, negativos y ceros
        int contPositivos = 0;
        int contCeros = 0;
        int contNegativos = 0;
        //contadorNNumeros
        int contNumeros = 0;
        //numeros
        int num;

        //Leer contadorNNumeros
        System.out.println("¿Cuántos números quieres procesar?");
        num = teclado.nextInt();


        //Bucle de NNumeros(for, while)
        for (i=0; i==num; i++) {
            //Leer numero
            System.out.println("Numero:" + num + " el i es: " + i);

            //Comprobar si es Positivo, Negativo o Cero
            if (esPositivo(num)){
                contPositivos++;
            }
            else if (num == 0) {
                contCeros++;
            } else contNegativos++;

        }
    }

    public static boolean esPositivo(int numero) {
        boolean positivo = true;
        if (numero < 0)
            positivo = false;
        return positivo;
    }
}
