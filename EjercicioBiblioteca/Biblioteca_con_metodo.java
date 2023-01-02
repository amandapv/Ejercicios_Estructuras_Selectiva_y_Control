package EjercicioBiblioteca;

import java.util.Scanner;

public class Biblioteca_con_metodo {

    private static String mes;
    private static String titulo_libro;
    private static Byte num_consultas_libro_mes;
    private static int total_prestamos_mes;
    private static int formula_tasa;


    public static void main(String[] args) {

        lecturaDatosBiblioteca();
        calcularFormulaTasa();
        salidaDatosBiblioteca();
    }


    public static void lecturaDatosBiblioteca() {
        Scanner teclado = new Scanner(System.in);

        //Pedir datos por teclado
        System.out.println("Ingrese el titulo del primer libro que ha cogido");
        titulo_libro = teclado.nextLine();

        System.out.println("Ingrese el mes actual");
        mes = teclado.nextLine();

        System.out.println("Ingrese el número de consultas del libro del mes de " + mes);
        num_consultas_libro_mes = teclado.nextByte();

        System.out.println("Ingrese el total de préstamos del mes de " + mes);
        total_prestamos_mes = teclado.nextInt();
    }


    public static void calcularFormulaTasa() {

        formula_tasa = (num_consultas_libro_mes * 100) / total_prestamos_mes;
    }


    public static void salidaDatosBiblioteca() {

        System.out.println("El libro " + titulo_libro + " se consultó un total de " + num_consultas_libro_mes + " veces.");
        System.out.println("La tasa de consulta en el mes de " + mes + " es " + formula_tasa + " %");
    }

}
