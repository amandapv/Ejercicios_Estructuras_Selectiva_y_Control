/*
Realiza un programa que vaya pidiendo números hasta que se introduzca un numero negativo y nos diga cuantos números se han
introducido, la media de los impares y el mayor de los pares. El número negativo sólo se utiliza para indicar el final de
la introducción de datos pero no se incluye en el cómputo.
 */


package NegativoMediaImparesMayorPares;

import java.util.Scanner;

public class NegativoMediaImparesMayorPares {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        //Variables
        int num;
        int cont=0;
        int numTotPosit;
        int contImpar=0;
        double sumaImpar=0;
        double mediaImpar;
        int mayorPar=0;

        do {

            System.out.println("Dime positivos, si me das un negativo me voy!");
            num = teclado.nextInt();
            cont ++;

            if (num % 2 != 0 && num >= 0) {  //si es impar y positivo...
                //System.out.println("Yo soy impar! " + num);
                contImpar++;
                sumaImpar = sumaImpar + num; //La media se calcula sumando los números introducidos, que en este caso tienen que ser impares y después de haberlos sumado, se divide entre cuántos números se hayan metido que sean pares (ejemplo: PRIMERO: 6 + 11 + 7 = 24 || SEGUNDO: (tenemos 3 números): 24 / 3 = 8 (La media es 8)
            }

            if (num % 2 == 0 && num >= 0){ //si es par y positivo...
                if (num > mayorPar) {
                    mayorPar = num;
                }
            }

        } while (num >= 0);

        mediaImpar = sumaImpar / contImpar;


        numTotPosit = cont - 1;
        System.out.println("Se han introducido " + numTotPosit + " números positivos");
        System.out.println("La media de impares es de: " + mediaImpar);
        System.out.println("El número par  más grande es: " + mayorPar);

    }
}