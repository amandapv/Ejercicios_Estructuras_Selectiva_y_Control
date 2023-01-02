package EjercicioBiblioteca;

public class Biblioteca {
    //Atributos
    private String mes;
    private String titulo_libro;
    private Byte num_consultas_libro_mes;
    private int cantidad_libros_prestados;
    private int total_prestamos_mes;
    private int formula_tasa;

    //Métodos. Los métodos son acciones
    public Biblioteca(String titulo_libro, String mes, Byte num_consultas_libro_mes, int cantidad_libros_prestados, int total_prestamos_mes){

        calcularFormulaTasa();

        this.mes = mes;
        this.titulo_libro = titulo_libro;
        this.num_consultas_libro_mes = num_consultas_libro_mes;
        this.cantidad_libros_prestados = cantidad_libros_prestados;
        this.total_prestamos_mes = total_prestamos_mes;
    }

    public int calcularFormulaTasa() {  //no es void porque no está vacío y quiero que devuelva un entero, en este caso la fórmula de la tasa

        formula_tasa = (num_consultas_libro_mes * 100) / total_prestamos_mes;
        return formula_tasa;
    }

    //Creación de los getter
    public String getMes() {
        return mes;
    }

    public String getTitulo_libro() {
        return titulo_libro;
    }

    public Byte getNum_consultas_libro_mes() {
        return num_consultas_libro_mes;
    }

    public int getTotal_prestamos_mes() {
        return total_prestamos_mes;
    }

    public int getCantidad_libros_prestados() {
        return cantidad_libros_prestados;
    }
}
