package SeguroCoche;

public class Seguro {

    //definición de variables
    private String nombreAsegurado;
    private int edad;
    private int anhosCarnet;
    private double precioCoche;
    private double precioInicial = 300;

    private double precioFinal = 300;


    //crear el constructor de la clase SeguroCoche


    //métodos
    public Seguro (String NombreAsegurado, int Edad, int AnhosCarnet, double PrecioCoche) {
        this.nombreAsegurado = NombreAsegurado;
        this.edad = Edad;
        this.anhosCarnet = AnhosCarnet;
        this.precioCoche = PrecioCoche;
        calcularPrecioFinal();
    }

    public double calcularPrecioFinal() {


        if (edad < 28 || anhosCarnet < 5) {
            getPrecioMasCienE();
        }


        if (precioCoche > 15000) {
            getPrecioPorcent();
        }


        if ((edad < 28 || anhosCarnet < 5) && precioCoche > 15000) {
            getPrecioAmbas();
        }

        return precioFinal;
    }


    public String getNombreAsegurado() {
        return nombreAsegurado;
    }


    private void getPrecioMasCienE() {
        precioFinal = precioInicial + 100;

    }


    private void getPrecioPorcent() {
        precioFinal = precioInicial * 1.12; //sumarle al precio base de 300 euros, un 12%

    }


    private void getPrecioAmbas() {
        precioFinal = (precioInicial + 100) * 1.12;

    }


    public double getPrecioFinal() {
        return precioFinal;
    }

}