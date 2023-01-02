//package validaciones;


import java.util.Scanner;


/**
 *
 * @author mrnovoa
 */
public class PrincipalConMenu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Inicialización del Sistema");

        byte op = 0;
        do {
          //  menuPrincipal();
           // op = leerByte(input);
            switch (op) {
                case 1:
                    //OP1
                    System.out.println("Operaciones Operacion1");
                    break;
                case 2:
                    //OP2
                    System.out.println("Operaciones Operacion2");
                    break;
                case 3:
                    //OP3
                    System.out.println("Operaciones Operacion3");
                    break;
                case 0:
                  //  fin();
                    break;
                default:
                   // mensajePorDefecto();
                    break;
            }
        } while (op != 0);

        //Cierre de la conexión
        input.close();

    }

    /*public static byte leerByte(Scanner sc) {
        byte valor = 0;
        boolean correcto;

        correcto = true;

        do {
            valor = sc.nextByte();
            if (valor<0||valor>3) {
                System.out.println("ERROR. No ha introducido un valor válido. Introduzca un número: ");
                correcto=false;

            }
        }
    }*/
}