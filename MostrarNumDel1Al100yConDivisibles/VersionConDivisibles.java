//Muestra los números del 1 al 100 (ambos incluidos) divisibles entre 2 y 3.
//Utiliza el bucle for y while.

package MostrarNumDel1Al100;

public class VersionConDivisibles {

    public static void main(String[] args) {

        for (int i=1; i <= 100; i++) { //realizar un bucle para recorrer los números del 1 al 100

            if (i % 2 == 0 && i % 3 == 0) { //condición para que solo me muestre los números divisibles entre 2 y 3 de los 100 que me estoy recorriendo
                System.out.println(i);
            }
        }
    }
}