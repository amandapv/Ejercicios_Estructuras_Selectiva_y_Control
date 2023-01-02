package EjercicioVehiculo;

public class Vehiculo {

    //Definición de variables
    private String modelo;
    private String marca;
    private String color;
    private String matricula;
    private String anho;
    private String mes;
    public static String tipo;
    private float combustible;
    private float potencia;
    private int cilindrada;


    //Creación del constructor parametrizado usando el mismo nombre en los parámetros que en las variables de la clase
    public Vehiculo (String modelo, String marca, String color, String matricula, String anho, String mes, float combustible, float potencia, int cilindrada) {
        this.modelo=modelo;
        this.marca=marca;
        this.color=color;
        this.matricula=matricula;
        this.anho=anho;
        this.mes=mes;
        this.combustible=combustible;
        this.potencia=potencia;
        this.cilindrada=cilindrada;
    }

    //como instancié un objeto de la clase vehículo, no me hace falta invocar a los métodos static
    public Vehiculo () {}


    //Creación del método especial toString (permite mostrar la información completa de un objeto, es decir, el valor de sus atributos). También podría hacerse con un método void que tenga un println
    public String toString () {
        String show = "El modelo es: " + modelo + ", la marca es: " + marca + ", el color es: " + color + ", la matricula es: " + matricula + ", el año es: " + anho + ", el mes es: " + mes + ", el tipo de coche es: " + tipo + ", el combustible es de: " + combustible + ", la potencia es de: " + potencia + " y por útimo la cilindrada es de: " + cilindrada;
        return show;
    }


    //Creación de los métodos Getters
    public String getModelo() {

        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    public String getColor() {
        return color;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getAnho() {
        return anho;
    }

    public String getMes() {
        return mes;
    }

    public float getCombustible() {
        return combustible;
    }

    public float getPotencia() {
        return potencia;
    }

    public int getCilindrada() {
        return cilindrada;
    }


    //Creación de los métodos Setters
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setAnho(String anho) {
        this.anho = anho;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public void setCombustible(float combustible) {
        this.combustible = combustible;
    }

    public void setPotencia(float potencia) {
        this.potencia = potencia;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }
}