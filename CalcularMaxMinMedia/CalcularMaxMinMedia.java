/*
Realiza un programa que calcule el máximo, el mínimo y la media de una serie de números enteros positivos introducidos
por teclado. El programa terminará cuando el usuario introduzca un número primo. Este último número no se tendrá en
cuenta en los cálculos. El programa debe indicar también cuántos números ha introducido el usuario (sin contar el
primo que sirve para salir) y la suma acumulada de los mismos.
 */

package CalcularMaxMinMedia;
import CalcularPrimos.primos_sinContadorPrimos;
import java.util.Scanner;

public class CalcularMaxMinMedia {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        //variables
        int num;
        int cont = 0;
        int sumaTotPrimos = 0;
        int numMax = 0;
        int numMin = Integer.MAX_VALUE;

        //Encontrar el máximo de una serie de números positivos
        do {
            System.out.println("Dime números... esto acabará cuando me des un número primo!");
            num = teclado.nextInt();

            if (num >= 0 && !primos_sinContadorPrimos.isPrimo(num)) {
                if (num > numMax) {  //Calcular número máximo de los introducidos
                    numMax = num;
                }

                if (num < numMin) {  //Calcular núm mínimo de los introducidos
                    numMin = num;
                }
                cont++;

                sumaTotPrimos = sumaTotPrimos + num; //suma de todos los numero NO primos introducidos
            }

        } while (num >= 0 && !primos_sinContadorPrimos.isPrimo(num));

        System.out.println("El número más grande,no primo, que me has dado es: " + numMax);
        System.out.println("El número más pequeño,no primo, que me has dado es: " + numMin);
        System.out.println("Has introducido (sin contar el primo): " + cont + " números");
        System.out.println("La suma de los números anteriores introducidos (sin contar el primo) es: " + sumaTotPrimos);
    }
}
