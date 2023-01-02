package CalcularPrimos;

import java.util.Scanner;

public class primos_sinContadorPrimos {

    public static int numero;
    public static void main(String[] args) {
/*
        Scanner teclado = new Scanner(System.in);
        System.out.printf("Introduzca un numero positivo: ");
        int numero=teclado.nextInt();

        if(isPrimo(numero))
            System.out.println("el número "+numero+" SI es primo");
        else System.out.println("el número "+numero+" NO es primo");
        if(isPrimoInt(numero)==1)
            System.out.println("el número "+numero+" SI es primo");
        else System.out.println("el número "+numero+" NO es primo");



        ejercicioPrimoBucle();

 */

    }

    public static void contarPrimos(){
        int numero;
        int contPrimos=0;
        Scanner teclado = new Scanner(System.in);

        validarNumPositivo(teclado);

        numero=validarNumPositivoConReturn(teclado);
        //validar que el número sea positivo
       /* do{
           System.out.println("Introduzca número positivo");
           numero= teclado.nextInt();
           if(numero<0){
               System.out.println("No puede ser negativo.");
           }
        }while(numero<0);

        */

        for(int i=numero;i>0;i--){
            if(isPrimo(i)){
                System.out.println(i+" es primo");
                contPrimos++;
            }
        }
        System.out.println("Hay "+contPrimos+" números primos.");

    }

    public static void validarNumPositivo( Scanner teclado){
        do{
            System.out.println("Introduzca número positivo");
            numero= teclado.nextInt();
            if(numero<0){
                System.out.println("No puede ser negativo.");
            }
        }while(numero<0);
    }

    public static int validarNumPositivoConReturn( Scanner teclado){
        int num;
        do{
            System.out.println("Introduzca número positivo");
            num= teclado.nextInt();
            if(num<0){
                System.out.println("No puede ser negativo.");
            }
        }while(num<0);

        return num;
    }

    public static boolean isPrimo(int numero){
        boolean primo=true;
        int c=numero-1;
        while(primo && c>1){ // for(int c=numero-1;primo && c>1;c--)
            if (numero%c==0) {
                primo=false;
            }
            c--;
        }
        return primo;

    }

    public static int isPrimoInt(int numero){
        int primo=1;
        int c=numero-1;
        while(primo==1 && c>1){ // for(int c=numero-1;primo && c>1;c--)
            if (numero%c==0) {
                primo=0;
            }
            c--;
        }
        return primo;

    }

    public static void ejercicioPrimoBucle(){
        //Que pida un número y diga si es primo o no.
        Scanner leer= new Scanner(System.in);

        int num,cont = 2;
        boolean primo =true;

        System.out.print("Ingrese el número: ");
        num = leer.nextInt();

        while (primo & cont < num ) { //for(int cont=2;primo && c<numero;cont++)
            if (num % cont == 0) {
                primo = false;
            }else{cont++;}

        }
        if (primo) {
            System.out.print("El número "+num+""+" si es primo");
        }else{System.out.print("El número "+num+""+" no es primo");}

    }
}
