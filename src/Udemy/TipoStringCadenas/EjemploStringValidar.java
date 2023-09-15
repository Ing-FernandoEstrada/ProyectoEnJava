package Udemy.TipoStringCadenas;

public class EjemploStringValidar
{
    public static void main(String[] args)
    {
        //Se declara una variable sin ningun tipo de referencia
        String curso = null;

        //EN este caso se sabe si es nulo o no
        boolean esNulo = curso == null;
        System.out.println("Es nulo ? " + esNulo);

        //CUando un objeto es nulo sale error si lanzamos un metodo
        //En este caso se hace la prueba para la variable curso que quiere convertir el texto en mayusculas
        //Para negar una expresion se utiliza !
        /*if (!esNulo == false)
        {
            //Si el valor no es nulo muestra el valor
            System.out.println(curso.toUpperCase());
        }*/

        //Si el valor es nulo le damos un valor a la variable curso
        if (esNulo)
        {
            //curso = "Progrmación Java";
            //Cuando el valor de String se deja vacio no se puede ni convertir en mayusculas ni concatenar
            curso = "Progrmación Java";
        }

        //Se puede validar para que el string tenga un tamaño
        //Si la cantidad de caracteres es 0 es porque el string es vacio
        boolean esVacio = curso.length() == 0;
        System.out.println("Es vacio ? " + esVacio);

        //tambien se podria realizar un atajo utilizando el metodo
        boolean esVacio2 = curso.isEmpty();
        //Este metodo si el largo es igual a cero
        System.out.println("Es vacio 2 ? " + esVacio2);

        //SI CURSO TIENE UN ESPACIO TODO SE EJECUTA
        //Para resolver esa situacion se utiliza valida si es distinto de null, de empty y si es diferente de un espacio
        //Es mas estricto

        boolean esBlanco = curso.isBlank();
        System.out.println("El texto esta en blanco ? " + esBlanco);

        //Si es distinto de vacio se imprime lo demas
        if(!esBlanco)
        //tambien se puede declarar el if de esta manera
            //if(curso.length() == 0)
            //if(curso.length() > 0)
        //Y de esa manera el codigo funciona igual
        {
            //Se imprime lo demas siempre y cuando este diferente de vacio
            //Y en este caso ya se puede convertir el texto a mayusculas
            System.out.println(curso.toUpperCase());
            //Y tambien ya se puede concatenar un String con la varible curso
            System.out.println("Bienvenido al curso ".concat(curso));
            //Solo se utiliza concat cuando queremos concatenar una instancia
            //Utilizando el operador mas +
            System.out.println("Bienvenido al curso " + curso);
        }

        //En este caso tambien nos saldria un NullPointerexcepcion
        //Para liberar el error se deveria colocarlo en un if
        //System.out.println(curso.concat(" desde cero!"));
        //Tambien lanzaria un NullPointerexcepcion como error porque la variable curso es nula
        //System.out.println("Bienvenido al curso ".concat(curso));
    }
}
