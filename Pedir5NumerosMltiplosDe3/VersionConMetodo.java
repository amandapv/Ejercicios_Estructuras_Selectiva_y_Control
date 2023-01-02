package Pedir5NumerosMltiplosDe3;

import java.util.Scanner;

public class VersionConMetodo {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        //variables
        int num;
        boolean multi3;

        for (int i=1; i<=5; i++) {
            System.out.println("Dime un número y te digo si alguno es multiplo de 3");
            num = teclado.nextInt();

            multiploDe3(num);
        }
    }

    public static boolean multiploDe3(int numUser) {
        if (numUser % 3 == 0) {
            System.out.println("El número es múltiplo de 3");
            return true;
        }
        return false;
    }
}
