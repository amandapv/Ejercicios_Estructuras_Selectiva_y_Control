/*
7. Realiza un programa que muestre al azar el nombre de una carta de la baraja francesa. Esta baraja está
   dividida en cuatro palos: picas, corazones, diamantes y tréboles. Cada palo está formado por 13 cartas,
   de las cuales 9 cartas son numerales y 4 literales: 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K y A (que sería el 1).
   Para convertir un número en una cadena de caracteres podemos usar String.valueOf(n).
*/
package Aleatorios;

public class BarajaFrancesa {

    public static void sacarCarta() {
        int numCarta;
        int numPalo;
        String carta = "";
        String palo = "";

        numPalo = (int)(Math.random()*(4 - 1 + 1)+1);

        //        for (int i = 1; i < 5; i++) {
        //      }

        switch (numPalo) {
            case 1:
                palo = "Picas";
                break;
            case 2:
                palo = "Corazones";
                break;
            case 3:
                palo = "Diamantes";
                break;
            case 4:
                palo = "Tréboles";
                break;
        }


        numCarta = (int)(Math.random()*(13 - 1 + 1)+1);
        switch (numCarta) {
            case 1:
                carta = "A";
                break;
            case 11:
                carta = "J";
                break;
            case 12:
                carta = "Q";
                break;
            case 13:
                carta = "K";
                break;
            default:
                carta = String.valueOf(numCarta);
        }

        //forma de hacer el switch en java a partir de la versión 12 (tengo que actualizar el jdk)
        /* switch (numCarta) {
            case 1 -> carta = "A";
            case 11 -> carta = "J";
            case 12 -> carta = "Q";
            case 13 -> carta = "K";
            default -> carta = String.valueOf(numCarta);
        } */

        System.out.println(carta + " de " + palo);

    }

    public static void main(String[] args) {

    }

}