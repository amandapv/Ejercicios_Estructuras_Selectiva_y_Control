/*
Realiza un generador de melodía con las siguientes condiciones:
a) Las notas deben estar generadas al azar. Las 7 notas son do, re, mi, fa, sol, la y si.
b) Una melodía está formada por un número aleatorio de notas mayor o igual a 4, menor o igual a 28 y siempre múltiplo de 4 (4, 8, 12…).
c) Cada grupo de 4 notas será un compás y estará separado del siguiente
compás mediante la barra vertical “|” (Alt + 1). El final de la melodía se marca con dos barras.
d) La última nota de la melodía debe coincidir con la primera.
 */
package Aleatorios;

public class NumNotasMusicales_noFunc {

    public static void main(String[] args) {
        String melodia = "";
        String primeraNota = "";
        int numCompases;

        // número de compases
        numCompases = (int)(Math.random()*(8 - 1))+1;

        // generamos todos los compases
        for (int i = 1; i <= numCompases; i++) {
            // si no es el primer compás generado, añadimos una | para separarlos
            if (i != 1) {
                melodia = melodia + " | ";
            }
            // un compás tiene 4 notas, salvo el último, que tendrá 3 + la primera nota
            int notasEnCompas = 4;
            // si es el último compás, sólo hace 3
            if(i == numCompases) {
                notasEnCompas = 3;
            }
            // generamos el compás
            for (int j = 1;j <= notasEnCompas;j++) {
                // generamos una nota aleatoria
                String nota = generarNota();
                // y la añadimos a la melodía
                melodia = melodia + " " + nota;
                // si es el primer compás y la primera nota, la guardamos para añadir al final
                if (i == 1 && j == 1) {
                    primeraNota = nota;
                }
            }
            // si estamos en el último compás, añadimos la primera nota al final
            if(i == numCompases) {
                melodia = melodia + " " + primeraNota;
            }
        }
        // al final de la melodía, tenemos unas ||
        melodia = melodia + " ||";
        // imprimimos al usuario la melodía resultante
        System.out.println(melodia);
    }


    public static String generarNota() {
        int nota;
        nota = (int)(Math.random()*(8 - 1))+1;

        switch (nota) {
            case 1:
                return "Do";
            case 2:
                return "Re";
            case 3:
                return "Mi";
            case 4:
                return "Fa";
            case 5:
                return "Sol";
            case 6:
                return "La";
            case 7:
                return "Si";
            default:
                return "";
        }
    }
}
