package EjemploAlumno;

import EjercicioCamion.Ejercicio2_camion_con_metodo;

public class Principal {
    public static void main(String[] args) {
        Alumno alumno1;         // Declaramos una variable de la clase Alumno llamada alumno1
        alumno1 = new Alumno(); // Creamos un objeto instancia de Alumno y le asignamos a esa variable
        Ejercicio2_camion_con_metodo.lecturaDatosCamion();

        alumno1.setNivelAcademico("universitario");
        String a = alumno1.getNivelAcademico();  // Asignamos á variable a o valor do atributo nivelAcademico do obxecto alumno1
        System.out.println("Alumno 1: Nivel académico: " + a);
        alumno1.resolverExamen("Alumno 1: Examen de Programación");  // Invocamos ao método resolverExame do obxecto alumno1 para que se execute


        Alumno alumno2 = new Alumno("Adrián","49827384W", "master");

        String b = alumno2.getNivelAcademico();  // Asignamos á variable a o valor do atributo nivelAcademico do obxecto alumno1
        String c = alumno2.getNombre();
        System.out.println("Alumno 2 con nombre, " + c + ": Nivel académico: " + b);
        alumno2.resolverExamen("Alumno 2: Examen de IA avanzada");  // Invocamos ao método resolverExame do obxecto alumno1 para que se execute

    }
}
