package Udemy.ValorVsReferencia;
//No es recomendable utilizar una clase dentro de una misma clase
class Persona
{
    private String nombre;

    //Metodo que se utiliza en la clase persona
    public void modificarNombre(String nuevoNombre)
    {
        this.nombre = nuevoNombre;
    }
    public String leerNombre()
    {
        return this.nombre;
    }
}
 class PasarPorReferencia2
{
    public static void main(String[] args)
    {
        //Se crea una instancia o un objeto de la clase Persona
        Persona persona =  new Persona();
        persona.modificarNombre("Andres");

        System.out.println("Iniciamos el metodo main");

        System.out.println("Nombre persona " + persona.leerNombre());
        System.out.println("Antes de llamar al metodo test");
        test(persona);
        System.out.println("Despues de llamar al metodo test");

        System.out.println("persona.nombre = " + persona.leerNombre());

        System.out.println("Finaliza el metodo main con los datos de la persona modificados modificados");
    }
    public static void test(Persona persona)
    {
        System.out.println("Iniciamos el metodo test");
        persona.modificarNombre("Pepe");
        System.out.println("Finaliza el meotdo test");
    }
}
