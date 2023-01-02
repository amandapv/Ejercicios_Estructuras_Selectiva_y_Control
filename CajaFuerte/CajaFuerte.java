/*
Realiza el control de acceso a una caja fuerte. La combinación será un número de 4 cifras. El programa nos
pedirá la combinación para abrirla. Si no acertamos, se nos mostrará el mensaje “Lo siento, esa no es la
combinación” y si acertamos se nos dirá “La caja fuerte se ha abierto satisfactoriamente”. Tendremos cuatro
oportunidades para abrir la caja fuerte.
 */

package CajaFuerte;

import java.util.Scanner;

public class CajaFuerte {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        //variables
        int numDesblqCajaFuerte;
        int numUserCajaFuerte;
        //boolean digitos4 = true;

        System.out.println("Dime un pin comprendido entre 1000 y 9999 (ambos inlcuidos)");
        numUserCajaFuerte = teclado.nextInt();

        //proceso 1 - Configuración contraseña
        //comprobar si el número introducido por el usuario tiene 4 dígitos
        if (numUserCajaFuerte >= 1000 && numUserCajaFuerte <= 9999) {

            System.out.println("A continuación vas a tener que introducir de nuevo tu pin en la caja fuerte. Solo tendrás 4 intentos");

            for (int i=1; i<5; i++) { //bucle para que solo tenga 4 intentos al introducir el pin en caso de que el número introducido no sea igual al del pin, en ese caso acertaría y acabaría

                numDesblqCajaFuerte = teclado.nextInt(); //se pide el pin de desbloqueo

                if (numDesblqCajaFuerte >= 1000 && numDesblqCajaFuerte <= 9999) { //si el pin de desbloqueo tiene 4 dígitos, acierta y acaba el programa. Sino, vuelve a pedirme el pin. En caso de que no tenga 4 dígitos, me dirá que el número introducido no tiene 4 cifras.

                    if (numUserCajaFuerte == numDesblqCajaFuerte) {
                        System.out.println("La caja fuerte se ha abierto satisfactoriamente");
                        break;
                    }

                    System.out.println("Lo siento, esa no es la combinación");

                }  else {
                    System.out.println("Lo siento, ese número no tiene 4 cifras");
                }
            }
        } else {
            System.out.println("Lo siento, el número tiene que ser de 4 cifras");

        }
    }
}
