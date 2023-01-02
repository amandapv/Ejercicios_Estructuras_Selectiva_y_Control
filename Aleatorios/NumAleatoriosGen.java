//Muestra 20 números aleatorios entre 0 y 10 (ambos incluidos) separados por espacios

package Aleatorios;

import java.util.Scanner;

public class NumAleatoriosGen {
    Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        numSemanaAleatorio();
    }

    public static void aleatorio_0_10() {

        for (int i = 0; i < 20; i++) {
            System.out.print((int) (Math.random()*11) + " ");
        }
    }

    public static void aleatorios_100_199() {
        int n;
        int maximo = 100;
        int suma = 0;
        int minimo = 199;

        for (int i = 0; i < 50; i++) {
            n = (int)(Math.random()*(100 - 200 +1) + 200);

            System.out.print(n + " ");

            suma = suma + n;

            if (n<minimo) {
                minimo=n;
            }
            if (n>maximo) {
                maximo=n;
            }
            System.out.println("Minimo: " + minimo + ". Máximo:" + maximo + ". Media:" + suma/50);
        }
    }

    public static void numSemanaAleatorio() {
        //genera un día de la semana de forma aleatoria. En efecto, primero generamos un número entre 1 y 7 ambos inclusive
        //y luego hacemos corresponder un día de la semana a cada uno de los números
        int dia;

        dia = (int)(Math.random()*(8 - 1 + 1)+1);

        switch (dia) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
        }
    }

}
