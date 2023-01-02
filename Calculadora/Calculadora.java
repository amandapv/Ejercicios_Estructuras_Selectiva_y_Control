package Calculadora;

//1. Clase calculadora = Con atributos, métodos (constructor (por defecto vacío o con parámetros (param1, paramn..) o con operacionews normales (suma, resta, multi, divi (cada una de ellas
//con sus parámetros vaalores de retorno etc), necesitamos una clase principal en la que invocar esos métodos (evaluar si los métodos van a ser estáticos o no) y hacer ejemplos de prueba
public class Calculadora {
    //Atributos
    public int a;
    public int b;
    public float suma = 0;
    public float resta = 0;
    public float multi = 0;
    public float divi = 0;


    //Métodos
    public Calculadora (float suma, float resta, float multi, float divi, int a, int b) {
        this.a=a;
        this.b=b;
        this.suma=suma;
        this.resta=resta;
        this.multi=multi;
        this.divi=divi;
    }


    public void suma() {
        suma = this.a + this.b;
        System.out.println("Total suma: " + suma);
       //return suma;
    }

    public float resta() {
        resta = this.a - this.b;
        System.out.println("Total resta: " + resta);
        return resta;
    }

    public float multi() {
        multi = this.a * this.b;
        System.out.println("Total multi: " + multi);
        return multi;
    }

    public float divi() {
        divi = this.a / this.b;
        System.out.println("Total divi: " + divi);
        return divi;
    }
}
