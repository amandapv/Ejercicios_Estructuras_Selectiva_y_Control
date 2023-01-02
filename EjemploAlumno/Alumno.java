package EjemploAlumno;

public class Alumno {
    //Atributos
    private String nombre;
    private String dni;
    private String nivelAcademico;


    //Métodos. Los métodos son acciones

    public Alumno() {

    }

    public Alumno(String nombre, String dni, String nivelAcademico) {
        this.nombre = nombre;
        this.dni = dni;
        this.nivelAcademico = nivelAcademico;
    }


    //Creación de los getter
    public String getNombre() {
        return nombre;
    }

    public String getNivelAcademico() {
        return nivelAcademico;
    }

    public String getDni() {
        return dni;
    }

    //Creación de los setter
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNivelAcademico(String nivelAcademico) {
        this.nivelAcademico = nivelAcademico;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    //public/private [static] void/int/String... nombre (paramtro) {...}
    public void resolverExamen (String enunciado) {
        System.out.println("Estas revolviendo el examen soguiente: " + enunciado);
    }

    public void matricularse (String modulo) {
        System.out.println("Matriculándose en el módulo siguiente: " + modulo);
    }
}
