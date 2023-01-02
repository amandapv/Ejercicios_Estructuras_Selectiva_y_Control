//Muestra los números del 1 al 100 (ambos incluidos). Usa un bucle while.

package MostrarNumDel1Al100;

public class MostrarNumDel1Al100 {

    public static void main(String[] args) {
        int cien = 100;

        while (cien >= 1 && cien <= 100) {
            System.out.println(cien);
            cien --;
        }
    }
}