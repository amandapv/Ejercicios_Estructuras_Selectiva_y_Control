package EjercicioCamion;

import java.util.Scanner;

public class Ejercicio2_camion_sin_metodo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String propietario;
        String matricula;
        int litros_consumidos_combustible;
        int km_antes_viaje;
        int km_despues_viaje;
        String nombre_companhia;
        int consumo_total;
        int km_recorridos_totales;

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


        //proceso
        km_recorridos_totales = km_despues_viaje - km_antes_viaje;
        consumo_total = (litros_consumidos_combustible *100) / km_recorridos_totales;

        System.out.println("Para la compañía " + nombre_companhia + " con el propietario " + propietario + ", que usa el vehículo con la matrícula " + matricula +
                ". Con los km del vehículo antes del viaje de " + km_antes_viaje + " y los km después del viaje de " +
                km_despues_viaje + " se calcula que los km recorridos totales es de " + km_recorridos_totales +
                ", y se estima que su consumo total es de " + consumo_total + " litros.");

        System.out.println("Es decir, la matrícula " + matricula + " consume un total de " + consumo_total + " litros a los 100.");


    }
}
