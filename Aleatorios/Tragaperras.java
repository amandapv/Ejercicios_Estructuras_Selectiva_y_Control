/*
     6.  Realiza un simulador de máquina tragaperras simplificada que cumpla los
 * siguientes requisitos:

 * a) El ordenador mostrará una tirada que consiste en mostrar 3 figuras. Hay 5

 * figuras posibles: corazón, diamante, herradura, campana y limón.

 * b) Si las tres figuras son diferentes se debe mostrar el mensaje “Lo siento, ha

 * perdido”.

 * c) Si hay dos figuras iguales y una diferente se debe mostrar el mensaje “Bien,

 * ha recuperado su moneda”.

 * d) Si las tres figuras son iguales se debe mostrar “Enhorabuena, ha ganado

 * 10 monedas”.

 * Ejemplo 1:

 * diamante diamante limón

 * Bien, ha recuperado su moneda

 * Ejemplo 2:

 * herradura campana diamante

 * Lo siento, ha perdido

 * Ejemplo 3:

 * corazón corazón corazón

 * Enhorabuena, ha ganado 10 monedas
 */
package Aleatorios;

public class Tragaperras {

    public static void main(String[] args) {

        String figura = "";
        int numFigura = 0;
        int cont = 0;

        for (int i= 0; i <3; i++) {
            numFigura = (int)(Math.random()*(5 - 1 + 1)+1);
            cont++;
            switch (numFigura) {
                case 1:
                    figura = "Corazón";
                    break;
                case 2:
                    figura = "Diamante";
                    break;
                case 3:
                    figura = "Herradura";
                    break;
                case 4:
                    figura = "Campana";
                    break;
                case 5:
                    figura = "Limón";
                    break;
            }

            System.out.println(figura);
        }

        if (numFigura == numFigura) {
            System.out.println("Lo siento, ha perdido");
        }

    }
}
