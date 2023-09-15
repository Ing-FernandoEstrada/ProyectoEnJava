package Udemy.TipoStringCadenas;
public class EjemploStringConcatenacion
{
    public static void main(String[] args) 
    {
        //Existen dos maneras de concatenación utilizando el operador +
        //o sino tambien utilizar el metodo concat el cual es mas eficiente
        String curso = "Programación Java";
        String profesor = "Andres Guzman";

        String detalle = curso + " con el instructor " + profesor;
        System.out.println(detalle);

        //Como concatenar con operaciones aritmeticas

        int numeroA = 10;
        int numeroB = 20;

        /*Primero imprime el string y luego la operacion siempre y cuando este con
        parentesis de lo contrario tomara toda la expresion de lo que se ponga de primero en la izquierda*/
        System.out.println(detalle + (numeroA + numeroB));
        //En este caso si primero se coloca la operacion  artimnetica no hay necesidad de los parentisis por
        //que si la suma pero es recomendable utilizar parentisis
        System.out.println(numeroA + numeroB + detalle);

        //Se concatena curso con profesor de otra manera

        //Utilizando el metodo permite concatenar los valores de manera mas facil
        String detalle2 = curso.concat(" con ".concat(profesor));
        System.out.println("Detalle 2 = " + detalle2);
        //tambien se puede concatenar de esta manera
        String detalle3 = curso.concat(" con ").concat(profesor);
        System.out.println("Detalle 3 = " + detalle3);
    }   
}
