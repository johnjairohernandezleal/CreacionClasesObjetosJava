public class PersonaPrueba {
    public static void main(String[] args) {

        // creacion de un objeto
        Persona persona1 = new Persona();

        // llamando a un meto del objeto persona creado
        System.out.println("valores por default del objeto persona");
        persona1.desplegarNombre();

        //modificar valores del objeto creado

        persona1.nombre=" John";
        persona1.apellidoPaterno="hernandez";
        persona1.apellidoMaterno="leal";

        // volvemos a llamar al metodo
        System.out.println("\nNuevos valores del objeto persona");
        persona1.desplegarNombre();

        // creacion de un segundo objeto
        Persona persona2= new Persona();
        System.out.println("\n Creacion de un nuevo objeto");
        persona2.nombre="carlos";
        persona2.desplegarNombre();

    }
}
