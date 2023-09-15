package Udemy.TipoStringCadenas;
public class EjemploStringInmutable
{
    public static void main(String[] args) 
    {
        //Cuando la variable es inmutable su valor no cambia
        String curso = "Programación Java";
        String profesor = "Andres Guzman";

        //en este caso no concatena bien porque se estaria llamando a curso nada mas
        curso.concat(profesor);
        System.out.println("curso = " + curso);

        String resultado = curso.concat(profesor);
        System.out.println("curso = " + curso);
        System.out.println("resultado = " + resultado);
        //El resultado seria falso porque son dos objetos totalmente distintos
        System.out.println(curso == resultado);

        //De esta manera transforma el String y lo concatena
        //recibe una funcion con un bloque de codigo lo que hace es recibir el parametro y el string modificado
        String resultado2 = curso.transform(c -> {
            //aca se retorna
            //c seria la variable que se le da a curso
            //Se modifica el string original
            return c + " con " + profesor;
        });
        //En este caso no transorma el curso con el profesor
        //porque unicamete sale el string que se le dio a la variable
        //curso s emantiene inmutable no se altera
        System.out.println("curso = " + curso);
        //En este caso imprime el curso con el profesor porque se creo una una variable en la que almacena todo
        System.out.println("Resultado 2 = " + resultado2);

        //Ejemplo de inmutabilidad
        //remplaza una letra por otra en la variable resultado
        //Cuando se crea de esta manera se mantiene inmutable y no cambia
        resultado.replace("a", "A");
        System.out.println("resultado = " + resultado);

        //creando una variable anticipada para toda la expresion ya se quita la inmutabilidad
        String resultado3 = resultado.replace("a", "A");
        System.out.println("resultado = " + resultado3);
    }
}