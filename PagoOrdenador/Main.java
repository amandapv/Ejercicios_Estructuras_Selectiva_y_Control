package PagoOrdenador;

import java.util.Scanner;

public class Main {
    //Meterle una mejora de un math round para redondear los decimales del Precio Final

    public static void main (String[] args) {
        Scanner teclado = new Scanner(System.in);

        //Pedir datos por teclado
        System.out.println("Ingrese la marca del ordenador");
        String marca = teclado.nextLine();

        System.out.println("Ingrese el precio inicial");
        double precioInicial  = teclado.nextDouble();

        System.out.println("Ingrese la forma de pago elegida: 1 - Al contado; 2 - en 6 meses; 3 - en 12 meses");
        byte pago  = teclado.nextByte();


        //Instanciar Objeto
        PagoOrdenador factura1;

        double precioFinal = 0;
        double pago6meses = 0;
        double pago12meses = 0;

        factura1 = new PagoOrdenador(marca, precioInicial, precioFinal, pago, pago6meses, pago12meses);


        //Switch para la forma de pago
        switch (pago) {
            case 1:
                precioFinal = factura1.getPrecioFinal(); //pago al contado
                break;
            case 2:
                precioFinal = factura1.getPago6meses(); //pago en 6 meses
                break;
            case 3:
                precioFinal =factura1.getPago12meses(); //pago en 12 meses
                break;
            default:
                break;
        }

        System.out.println("El precio final para la marca de Ordenador " + marca + ", con el precio inicial de " + precioInicial + " y la forma de pago elegida, que es la número " + pago + ", el total del precio del ordenador queda en " + precioFinal);

    }
}
