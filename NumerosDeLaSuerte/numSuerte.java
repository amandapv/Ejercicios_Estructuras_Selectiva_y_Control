package NumerosDeLaSuerte;

import java.util.Scanner;

public class numSuerte {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int num;
        int contSuerte = 0;
        int contNoSuerte = 0;
        int menu = 0;

        do {
            System.out.println("Dime un número: 1 para Introducir el número. 2 para Valorar ese número y 3 para salir");
            menu = teclado.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("Dime un número:");
                    num = teclado.nextInt();

                    if (num == 3 || num == 7 || num == 8 || num == 9) {
                        contSuerte++;

                    }
                    if (num == 0 || num == 1 || num == 2 || num == 4 || num == 5 || num == 6) {
                        contNoSuerte++;
                    }
                    break;
                case 2:
                    if (contSuerte > contNoSuerte) {
                        System.out.println("Eres afortunado");
                    }else {
                        System.out.println("No eres afortunado");
                    }
                    break;
                case 3:
                    break;
            }
        }while (menu != 3);

    }
}
