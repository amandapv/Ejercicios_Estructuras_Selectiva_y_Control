/*
En una encuesta todas las preguntas tienen 3 posibles respuestas
a) si b) no c) Ns/Nc
Sabiendo que la encuesta tiene 5 preguntas, realiza un programa que calcule el porcentaje de cada respuesta.
    Hacer con for que anide switch
 */

package Encuesta5PreguntasSiNoNs;

import java.util.Scanner;

public class Encuesta5PreguntasSiNoNs {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        //variables
        String opcion;
        double acumSi= 0;
        double acumNo= 0;
        double acumNsNc= 0;
        double porcentajeSi;
        double porcentajeNo;
        double porcentajeNsNc;

        System.out.println("Te voy a realizar 5 preguntas. Las respuestas serán: a) si b) no c) Ns/Nc");

        for (int i=1; i<=5; i ++) {



            switch (i) {
                case 1:
                    System.out.println("perros¿");
                    break;
                case 2:
                    System.out.println("gatos¿");
                    break;
                case 3:
                    System.out.println("gatos¿");
                    break;
                case 4:
                    System.out.println("gatos¿");
                    break;
                case 5:
                    System.out.println("gatos¿");
                    break;
            }

            opcion = teclado.nextLine();

            switch (opcion) {
                case "si":
                    acumSi++;
                    break;
                case "no":
                    acumNo++;
                    break;
                case "Ns/Nc":
                    acumNsNc++;
                    break;
                default:
                    System.out.println("Introduce una letra correcta");
                    break;
            }
        }
        System.out.println("Si:"+ acumSi + ". No: " + acumNo + ". Ns/Nc: " + acumNsNc);

        //Los porcentajes se calculan de la siguiente manera usando el ejemplo de este ejercicio:
            //Ejemplo: Si tengo dos respuestas que son "Si", lo dividirá entre 5 que es el total de preguntas que hay, y luego lo multiplicará por 100 (que esa multi es igual en todos los casos, lo único que puede variar es el número de cosas que quiero dividir entre el total de lo que estoy calculand)
        porcentajeSi = (acumSi / 5) * 100;
        porcentajeNo = (acumNo / 5) * 100;
        porcentajeNsNc = (acumNsNc / 5) * 100;

        System.out.println("Porcentaje de respuestas para los Si, es de: " + porcentajeSi + "%");
        System.out.println("Porcentaje de respuestas para los No, es de: " + porcentajeNo + "%");
        System.out.println("Porcentaje de respuestas para los Ns/Nc es de: "  + porcentajeNsNc + "%");

    }
}
