/*
2.Modificar el ejercicio Caja Fuerte
    Validar que sean 6 dígitos positivos
    Si no introducen 6, se rellena con ceros por la izquierda
Realiza un programa que diga el código introducido por el usuario es el que abre la caja fuerte. Se visualizará un menú con 3 apartados:
    Introducir combinación
    Valorar combinación
    Salir
 */

package CajaFuerte;

import java.util.Scanner;

public class cajaFuerteV2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        //variables
        int numDesblqCajaFuerte;
        int numUserCajaFuerte = 0;
        int menu = 0;
        String cadena = "";
        String cadena2 = "";

        do {

            System.out.println("Dime un número: 1 para Introducir el número. 2 para Valorar ese número y 3 para salir");
            menu = teclado.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("Dime un pin comprendido entre 100000 y 999999 (ambos inlcuidos), en caso de que sea menor que dichas cifras, lo rellenaré con 0 a la izquierda");
                    numUserCajaFuerte = teclado.nextInt();

                    cadena = String.format("%06d", numUserCajaFuerte);
                    if (numUserCajaFuerte >= 999999) {
                        System.out.println("El número no puede ser mayor de 6 cifras");
                    }

                    break;
                case 2:
                    System.out.println("A continuación vas a tener que introducir de nuevo tu pin en la caja fuerte. Solo tendrás 4 intentos");

                    for (int i=1; i<5; i++) { //bucle para que solo tenga 4 intentos al introducir el pin en caso de que el número introducido no sea igual al del pin, en ese caso acertaría y acabaría

                        numDesblqCajaFuerte = teclado.nextInt(); //se pide el pin de desbloqueo
                        cadena2 = String.format("%06d", numDesblqCajaFuerte);

                        System.out.println(cadena + " " + cadena2);

                        if (cadena.equals(cadena2)) {
                            System.out.println("La caja fuerte se ha abierto satisfactoriamente");
                            break;
                        } else {
                            System.out.println("Lo siento, esa no es la combinación");
                        }
                    }
                    break;
                case 3:
                    break;
            }

        } while (menu != 3);

    }
}
