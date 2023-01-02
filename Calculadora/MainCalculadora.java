package Calculadora;
//case principal, aquí se hace todo lo que necesitamos que se  ejecute para la calculadora

//Clase principal (invocar método ClaseCalculadora. Evaluar métodos estáticos o no. Ejemplos prueba


import java.util.Scanner;

public class MainCalculadora {

    public static void main (String[] args) {

        Scanner teclado = new Scanner(System.in);

        int a = 0;
        int b = 0;
        float suma = 1;
        float resta = 2;
        float multi = 3;
        float divi = 4;

        //Pedir datos por teclado
        System.out.println("Ingrese un número");
        a = teclado.nextInt();

        System.out.println("Ingrese otro número");
        b = teclado.nextInt();


        //Instanciar 1 Objeto de biblioteca
        Calculadora calculadora1 = new Calculadora(suma, resta, multi, divi, a, b);


        //Switch case
        byte op = 0;

        System.out.print("Introduce: 1 para suma, 2 para resta, 3 para multiplicación, 4 para division: ");

        op = teclado.nextByte();

        switch (op) {
            case 1:
                //OP1
                calculadora1.suma();
                break;
            case 2:
                //OP2
                calculadora1.resta();
                break;
            case 3:
                //OP3
                calculadora1.multi();
                break;
            case 4:
                calculadora1.divi();
                break;

        }
    }
}
