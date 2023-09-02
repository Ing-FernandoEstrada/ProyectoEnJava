package Udemy.Variables;

public class Ejemplos
{
    //Declaracion de variables
    public static void main(String[] args)
    {
        //Declaración de una cadena
        String saludar = "Hola mundo desde Java";
        //Imprime el texto que se declaro en la variable
        System.out.println(saludar);
        //EL metodo permite convertir el texto a mayusculas
        System.out.println(saludar.toUpperCase());
        //EL metodo permite convertir el texto a minusculas
        System.out.println(saludar.toLowerCase());


        //Tipos de datos primitivos
        //Cuando el tipo de datos son de tipo int no tiene metodos
        int numero = 10;
        System.out.println("numero = " + numero);
        //Integer si tiene metodos
        Integer numero2 = 10;


        //De esta manera permite por medio de una sentencia agregar diferentes valores
        int numero3 = 10;
        boolean valor = true;
        if(valor)
        {
            System.out.println("numero = " + numero);
            numero3 = 20;
        }
        System.out.println("numero3 = " + numero3);

        //Java también acepta tipos de datos var en el que permiten indentificar el tipo de dato al que pertenecen

        //String
        var numero4 = "15";
        System.out.println(numero4);
        //Intero
        var numero5 = 20;
        System.out.println(numero5);
        //Booleano
        var valor2 = true;
        System.out.println(valor2);
    }
}
