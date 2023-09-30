package Udemy.Operadores;
public class OperadorInstanceOf
{
    public static void main(String[] args)
    {
        String texto =  "Creando un objeto de la clase String ... que tal";

        Integer num = 7;

        //con el istance of valida si un objeto es tipo de una clase
       //Pregunta si es instancia de la clase String

        Boolean b1 = texto instanceof String;
        System.out.println("Texto es del tipo String? " + b1);

        //En este caso se hace el mismo ejemplo para saber si es del tipo Integer
        /*boolean b2 = texto instanceof Integer;
        System.out.println("Texto es del tipo String? " + b2);*/
        //En este caso sale error porque no se puede comparar un String con Integer

        //Object es la clase padre de todos los objetos
        //Toda clase hereda de object
        //El texto es de tipo String y de tipo object tambien
        b1 = texto instanceof Object;
        System.out.println("Object heredad de cualquier objeto " + b1);

        b1 = num instanceof Integer;
        System.out.println("num es del tipo Integer = " + b1);

        /*b1 = num instanceof long;
        System.out.println("num es del tipo Integer = " + b1);*/
        //Si se pone otro tipo de datos sale error

        //Integer tiene herencia con el tipo de dato Number
        //Por tanto no saldra error y el resultado sera true

        b1 = num instanceof Number;
        System.out.println("num es del tipo Number = " + b1);

        //En este caso se prueba si el numero es de tipo object
        //Todo objeto es de tipo object
        b1 = num instanceof Object;
        System.out.println("num es del tipo Object = " + b1);

        //En este caso se crea un objeto del tipo Object
        //Preguntamos si decimal es una instancia de tipo Number
        Double decimal = 45.54;
        b1 = decimal instanceof Number;
        System.out.println("Decimal es del tipo Number = " + b1);

        //Preguntamos si decimal es una instancia de tipo Object
        //En este caso la respuesta tambien seria true
        Double decimal2 = 45.54;
        b1 = decimal2 instanceof Object;
        System.out.println("Decimal2 es del tipo Object = " + b1);

        //es un objeto de la clase Boolean
        b1 = b1 instanceof Boolean;
        System.out.println("b1 es del tipo Boolean = " + b1);
    }
}
