package EjercicioBiblioteca;

import java.util.Scanner;

public class Biblioteca_sin_metodo {
    public static void main (String[] args) {
        Scanner teclado = new Scanner(System.in);

        //Entrada
        String titulo_libro;
        String mes;
        Byte num_consultas_libro_mes;
        int total_prestamos_mes;
        int formula_tasa;

        System.out.println("Ingrese el titulo del primer libro que ha cogido");
        titulo_libro = teclado.nextLine();

        System.out.println("Ingrese el mes actual");
        mes = teclado.nextLine();

        System.out.println("Ingrese el número de consultas del libro del mes de " + mes);
        num_consultas_libro_mes = teclado.nextByte();

        System.out.println("Ingrese el total de préstamos del mes de " + mes);
        total_prestamos_mes = teclado.nextInt();


        //Visualizar por pantalla
        System.out.println("El libro " + titulo_libro + " se consultó un total de " + num_consultas_libro_mes + " veces.");

        formula_tasa = (num_consultas_libro_mes * 100) / total_prestamos_mes;

        System.out.println("La tasa de consulta en el mes de " + mes + " es " + formula_tasa + " %");
    }
}
