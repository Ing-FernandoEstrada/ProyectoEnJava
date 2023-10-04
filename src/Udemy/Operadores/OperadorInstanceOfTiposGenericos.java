package Udemy.Operadores;
public class OperadorInstanceOfTiposGenericos
{
    public static void main(String[] args)
    {
        Object texto =  "Creando un objeto de la clase String ... que tal";

        //Esto se le conoce como autoboxing porque sin necesidad de digitar el tipo de dato se sabe que dependiendo del numero lo toma autosmaticamente el tipo de dato
        //Number num = 7;

        //De esta manera lo podemos colocar como entero primitivo utilizando valueOf
        //Y esta es la manera correcta de crear una instancia
        Number num = Integer.valueOf(7); //7

        //En este caso se puede con todos los tipos de datos primitivos en este caso se hara el ejemplo con el tipo de dato FLoat
        //Se puede tener el tipo de dato generico o real
        Number decimal2 = Float.valueOf(45.54f);

        Number num2 = Double.valueOf(45.54);

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

        b1 = texto instanceof Integer;
        System.out.println("Texto es del tipo Integer " + b1);

        b1 = num instanceof Integer;
        System.out.println("num es del tipo Integer = " + b1);

        //En este caso preguntariamos si el objeto es de tipo long
        //Peor integer no es instancia de long
        //Por tanto el resultado seria falso
        b1 = num instanceof Long;
        System.out.println("num es del tipo Long = " + b1);

        //Ahora probaremos con el tipo double
        //Integer no es intancia de Double
        //Por tanto el resultado seria falso
        b1 = num instanceof Double;
        System.out.println("num es del tipo Double = " + b1);

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
        Number decimal = 45.54f;

        b1 = decimal instanceof Number;
        System.out.println("Decimal es del tipo Number = " + b1);

        //Preguntamos si decimal es una instancia de tipo Object
        //En este caso la respuesta tambien seria tru

        b1 = decimal instanceof Object;
        System.out.println("Decimal es del tipo Object = " + b1);

        //Preguntamos si el numero es instancia del tipo double
        //En este caso el resultado seria verdadero
        b1 = decimal instanceof Double;
        System.out.println("Decimal es del tipo Double = " + b1);

        //Preguntamos si el numero es instancia del tipo float
        //En este caso el resultado seria falso
        b1 = decimal instanceof Float;
        System.out.println("Decimal es del tipo Float = " + b1);
        //Pero si se cambia el orden colocando una f al numero los resultados se invierten

        //Lo mismo sucede con integer, float etc
        b1 = decimal instanceof Integer;
        System.out.println("Decimal es del tipo Integer = " + b1);

        //es un objeto de la clase Boolean
        b1 = b1 instanceof Boolean;
        System.out.println("b1 es del tipo Boolean = " + b1);
    }
}
