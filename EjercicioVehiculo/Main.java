package EjercicioVehiculo;

import java.util.Scanner;

public class Main {

    public static void main (String[] args) {

        Scanner teclado = new Scanner(System.in);


        //Asignar el valor "Coche" al atributo tipo antes de instanciar la clase vehiculo. El atributo tipo es estático, por eso siempre será igual y no variará, por este motivo le asignamos ya un tipo
        Vehiculo.tipo = "Coche";


        //Pedir datos por teclado
        System.out.println("Dime el modelo del coche");
        String modelo = teclado.nextLine();

        System.out.println("Dime la marca del coche");
        String marca = teclado.nextLine();

        System.out.println("Dime el color del coche");
        String color = teclado.nextLine();

        System.out.println("Dime la matrícula del coche");
        String matricula = teclado.nextLine();

        System.out.println("Dime el año de la fecha de matriculación del coche");
        String anho = teclado.nextLine();

        System.out.println("Dime el mes de la fecha de matriculación del coche");
        String mes = teclado.nextLine();

        System.out.println("Dime el combustible del coche");
        float combustible = teclado.nextFloat();

        System.out.println("Dime la potencia del coche");
        float potencia = teclado.nextFloat();

        System.out.println("Dime la cilindrada del coche");
        int cilindrada = teclado.nextInt();


        //Instanciar objeto coche1 de la clase Vehiculo
        Vehiculo coche1;
        coche1 = new Vehiculo(modelo, marca, color, matricula, anho, mes, combustible, potencia, cilindrada);


        //Instanciar objeto coche2 de la clase Vehiculo, usando el constructor por defecto
        Vehiculo coche2 = new Vehiculo();


        //Pedir por teclado cada atributo y asignarlo a su variable correspondiente a coche2, usando los métodos gets.

        //Una manera de llamarlo:
        coche2.setModelo(coche1.getModelo());
        //Otra manera de llamarlo:
        coche2.setMarca(coche1.getMarca());

        //como lo tenía yo y me devolvía un null por eso lo cambié
        //marca = coche2.getMarca();

        coche2.setColor(coche1.getColor());
        coche2.setMatricula(coche1.getMatricula());
        coche2.setAnho(coche1.getAnho());
        coche2.setMes(coche1.getMes());
        coche2.setCombustible(coche1.getCombustible());
        coche2.setPotencia(coche1.getPotencia());
        coche2.setCilindrada(coche2.getCilindrada());


        //Instanciar objeto coche3 de la clase Vehiculo
        Vehiculo coche3;
        coche3 = new Vehiculo("Saxo", "Citroen", "verde", "4738CHT", "1999", "octubre",40, 57, 1124);


        //Mostrar por pantalla todos los datos de coche1, coche2 y coche3 usando el método show (toString)
        System.out.println(coche1.toString());
        System.out.println(coche2.toString());
        System.out.println(coche3.toString());


    }
}