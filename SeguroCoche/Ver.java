package SeguroCoche;

public class Ver {

    //Ver visualizará el nombre del asegurado y el precio que deberá abonar por su seguro
    public static void ver (Seguro asegurado) {
        System.out.println("Tu nombre es: " + asegurado.getNombreAsegurado());
        System.out.println("El precio final es de: " + asegurado.getPrecioFinal());
    }

}
