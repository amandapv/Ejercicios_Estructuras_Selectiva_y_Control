/*
Una compañía de seguros cobra por un seguro de automóviles a terceros,una tarifa base de 300 euros, y además:
    a)si el asegurado tiene menos de 28 años ó menos de 5 años de carnet,pagará un suplemento de 100 euros.
    b)si el coche que se asegura tiene un precio superior a 15.000 euros se aumenta el precio de la póliza en un 12%
    sobre la tarifa base.

Realizar un programa en java, que calcule el precio que debe pagar un conductor por asegurar su coche. Para ello
construiremos un programa, que invoque a un método llamado seguro, dentro de una clase Seguro que reciba estos argumentos
NombreAsegurado,Edad,AñosCarnet,PrecioCoche , y a su vez invoque a otro método llamado ver() , que estará en otra clase
llamada Ver y visualizará el nombre del asegurado y el precio que deberá abonar por su seguro.
 */

package SeguroCoche;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        //Pedir datos por teclado
        System.out.println("Ingrese el nombre la persona asegurada");
        String nombreAsegurado = teclado.nextLine();

        System.out.println("Ingrese la edad la persona asegurada");
        int edad = teclado.nextInt();

        System.out.println("Ingrese los años de carnet de la persona asegurada");
        int anhosCarnet = teclado.nextInt();

        System.out.println("Ingrese el precio del coche de la persona asegurada");
        double precioCoche = teclado.nextDouble();


        //Instanciar Objeto
        Seguro asegurado1 = new Seguro(nombreAsegurado, edad, anhosCarnet, precioCoche);


        Ver.ver(asegurado1);


        System.out.println("Con una edad de: " + edad + " años" + ". Con " + anhosCarnet + " año/años de carnet " + "y un coche a precio de: " + precioCoche);
    }
}
