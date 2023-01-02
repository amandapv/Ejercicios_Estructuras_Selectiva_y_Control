/*
Realiza un generador de melodía con las siguientes condiciones:
a) Las notas deben estar generadas al azar. Las 7 notas son do, re, mi, fa, sol, la y si.
b) Una melodía está formada por un número aleatorio de notas mayor o igual a 4, menor o igual a 28 y siempre múltiplo de 4 (4, 8, 12…).
c) Cada grupo de 4 notas será un compás y estará separado del siguiente
compás mediante la barra vertical “|” (Alt + 1). El final de la melodía se marca con dos barras.
d) La última nota de la melodía debe coincidir con la primera.
 */
package Aleatorios;

public class NumNotasMusicales {

    public static void main(String[] args) {
        int nota;
        String compas = "";
        int grupo;

        grupo = (int)(Math.random()*(8 - 0))+0;

        if (grupo == 0) {
            compas = compas + crearCompas(true);
        } else {
            compas = compas + crearCompas(false);

            for (int i = 0; i < grupo; i++) {
                compas = compas + " | " + crearCompas(false);
            }


        }

        System.out.println(compas);
    }


    public static String generarNota() {
        int nota;
        nota = (int)(Math.random()*(7 - 1 + 1)+1);

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

    public static String crearCompas(boolean iguales) {
        String compas = "";
        String primera = "";
        int numVeces = 4;

        if (iguales) {
            numVeces = 3;
        }

        for (int i = 0;i < numVeces;i++) {

            String nota = generarNota();

            compas = compas + " " + nota;

            if (i == 0 && iguales) {
                primera = nota;
            }
        }

        if (iguales) {
            compas = compas + " " + primera;
        }

        return compas;
    }
}
