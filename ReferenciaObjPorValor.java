public class ReferenciaObjPorValor {

    //public static String nombreStatico = "";

    public String nombreClase;
    public String apellidoClase;

    public static void main(String []  args) {
        Actor a1 = new Actor();
        a1.name="Ryan";
        a1.surname="Reynolds";

        System.out.println(a1.name+" "+a1.surname);

        transformaraGosling(a1); //cambio con variable
        System.out.println(a1.name+" "+a1.surname);

        ReferenciaObjPorValor objetoClasePrincipal = new ReferenciaObjPorValor();
        objetoClasePrincipal.nombreClase="Chris";
        objetoClasePrincipal.apellidoClase="Evans";

        System.out.println("Valores antes: " + objetoClasePrincipal.nombreClase + " " +objetoClasePrincipal.apellidoClase);

        cambioChris(objetoClasePrincipal);
        System.out.println("Valores después: " + objetoClasePrincipal.nombreClase + " " +objetoClasePrincipal.apellidoClase);
    }

    public static void cambioChris(ReferenciaObjPorValor objeto) {
        objeto.apellidoClase="Pratt";
    }


    static void transformaraGosling (Actor actor) {
        actor.surname = "Gosling";

        actor.name = "Patata";
    }
}
class Actor {
    String name;
    String surname;
}
