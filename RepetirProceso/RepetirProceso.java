//Repetir Proceso? (s/n)

package RepetirProceso;

import java.util.Scanner;

public class RepetirProceso {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        boolean repetir = true;

        do {

            System.out.println("¿Repetir proceso? (s/n)");
            String resp = teclado.nextLine();

            switch (resp) {
                case "s":
                    //caso 1
                case "S":
                    break;

                case "n":
                    //caso 2

                case "N":
                    repetir = false;
                    break;

                default:
                    System.out.println("Introduce una letra correcta");
                    break;
            }

        } while (repetir);
    }
}