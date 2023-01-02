package PagoOrdenador;

public class PagoOrdenador {

    //definición de variables
    private String marca;
    private double precioInicial;
    private double precioFinal;
    private byte pago;
    private double pago6meses;
    private double pago12meses;


    //crear el constructor de la clase PagoOrdenador
    public PagoOrdenador(String marca, double precioInicial, double precioFinal, byte pago, double pago6meses, double pago12meses) {
        this.pago=pago;
        this.marca=marca;
        this.precioInicial=precioInicial;
        this.precioFinal=precioFinal;
        this.pago6meses=pago6meses;
        this.pago12meses=pago12meses;
    }

    //métodos
    public double getPrecioFinal() {
        return precioInicial;
    }

        //calular sobre el precio inicial el incremento de un 8%
    public double getPago6meses() {
        pago6meses = precioInicial * 1.08;
        return pago6meses;
    }

        //calular sobre el precio inicial el incremento de un 15%
    public double getPago12meses() {
        pago12meses = precioInicial * 1.15;
        return pago12meses;
    }

}
