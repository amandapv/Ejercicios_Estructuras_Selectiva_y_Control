package EjercicioCamion;

import java.util.Scanner;

public class Ejercicio2_camion_con_metodo {
    private static int km_recorridos_totales;
    private static int consumo_total;
    private static int km_despues_viaje;
    private static int km_antes_viaje;
    private static int litros_consumidos_combustible;
    private static String nombre_companhia;
    public static String propietario;
    private static String matricula;



    public static void main(String[] args) {

        lecturaDatosCamion();
        calcularConsumoPromedio();
        salidaDatosCamion();

    }


    public static void lecturaDatosCamion() {
        Scanner teclado = new Scanner(System.in);


        System.out.println("Ingrese el nombre de la compañía");
        nombre_companhia = teclado.nextLine();

        System.out.println("Ingrese el nombre del propietario");
        propietario = teclado.nextLine();

        System.out.println("Ingrese la matrícula del vehículo");
        matricula = teclado.nextLine();

        System.out.println("Ingrese el total de litros consumidos de combustible");
        litros_consumidos_combustible = teclado.nextInt();

        System.out.println("Ingrese los km antes del viaje");
        km_antes_viaje = teclado.nextInt();

        System.out.println("Ingrese los km después del viaje");
        km_despues_viaje = teclado.nextInt();

        System.out.println("Metodo lecturaDatosCamion");
    }



    public static void calcularConsumoPromedio() {

        km_recorridos_totales = km_despues_viaje - km_antes_viaje;
        consumo_total = (litros_consumidos_combustible *100) / km_recorridos_totales;
        System.out.println("Metodo calcularConsumoPromedio");

    }



    public static void salidaDatosCamion() {

        System.out.println("Para la compañía " + nombre_companhia + " con el propietario " + propietario + ", que usa el vehículo con la matrícula " + matricula +
                ". Con los km del vehículo antes del viaje de " + km_antes_viaje + " y los km después del viaje de " +
                km_despues_viaje + " se calcula que los km recorridos totales es de " + km_recorridos_totales +
                ", y se estima que su consumo total es de " + consumo_total + " litros.");

        System.out.println("Es decir, la matrícula " + matricula + " consume un total de " + consumo_total + " litros a los 100 km.");

        System.out.println("Metodo salidaDatosCamion");

    }
}
