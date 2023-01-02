//4. Escribe un programa que muestre la tirada de tres dados. Se debe mostrar también la suma total (los
//   puntos que suman entre los tres dados).
package Aleatorios;

public class TirarDados {

    public static void main(String[] args) {
        int dado;
        int suma = 0;

        for (int i = 0; i < 3; i++) {
            dado = (int)(Math.random()*(6 - 1 + 1)+1);
            System.out.println("Dado: " + dado);
            suma = suma + dado;
        }

        System.out.println("La suma de los 3 dados es: " + suma);
    }
}
