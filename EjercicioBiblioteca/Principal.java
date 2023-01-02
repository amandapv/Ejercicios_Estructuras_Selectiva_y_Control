package EjercicioBiblioteca;

import java.util.Scanner;


public class Principal {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        //Pedir datos por teclado
        System.out.println("Ingrese el titulo del primer libro que ha cogido");
        String titulo_libro = teclado.nextLine();

        System.out.println("Ingrese el mes actual");
        String mes = teclado.nextLine();

        System.out.println("Ingrese el número de consultas del libro del mes de " + mes);
        Byte num_consultas_libro_mes = teclado.nextByte();

        System.out.println("Ingrese el total de préstamos del mes de " + mes);
        int total_prestamos_mes = teclado.nextInt();

        System.out.println("Ingrese el total de préstamos del mes de " + mes);
        int cantidad_libros_prestados = teclado.nextInt();


        //Instanciar 1 Objeto de biblioteca
        Biblioteca biblioteca1;
        biblioteca1 = new Biblioteca(titulo_libro, mes, num_consultas_libro_mes, total_prestamos_mes, cantidad_libros_prestados);

        String a = biblioteca1.getTitulo_libro();
        String b = biblioteca1.getMes();
        Byte c = biblioteca1.getNum_consultas_libro_mes();
        int d = biblioteca1.getTotal_prestamos_mes();
        int e = biblioteca1.getCantidad_libros_prestados();

        System.out.println("El libro " + a + " se consultó un total de " + c + " veces.");

        System.out.println("La tasa de consulta en el mes de " + b + " es " + biblioteca1.calcularFormulaTasa() + " %");

    }
}
