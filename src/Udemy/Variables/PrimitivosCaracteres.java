package Udemy.Variables;
public class PrimitivosCaracteres
{
    public static void main(String[] args)
    {
        //Pära definir un caracter se utiliza la palabra char
        //Permite un solo caracter
        char caracter1 = 'A';
        System.out.println("caracter = " + caracter1);
        //Permite tambienn caracteres númericos
        char caracter2 = '9';
        System.out.println("caracter2 = " + caracter2);
        //Permite caracteres alfanuméricos
        char caracter3 = 'a';
        System.out.println("caracter3 = " + caracter3);

        //Se pueden escribir caracteres unicod
        //Este representa el @

        char decimal = '\u0040';
        var caracter4 = '\u0040';
        System.out.println("Caracter4 = " + caracter4);
        System.out.println("Caracter = " + decimal);
        char caracter = 64;
        System.out.println("Decimal = " + caracter);
        //Operador relacional ==
        //Toca colocar los parantesis para que primero se resuelva la expresión y luego el string
        System.out.println("Decimal = Caracter: " + (decimal == caracter));
        System.out.println(decimal == caracter);

        char simbolo = '@';
        System.out.println("simbolo = " + simbolo);
        System.out.println("Simbolo = Caracter: " + (simbolo == caracter));

        //Constantes de la clase caracter de java

        System.out.println("Char correspondiente en byte = " + Character.BYTES);
        System.out.println("Char correspondiente en bytes = " + Character.SIZE);
        System.out.println("Maximo valor  = " + Character.MAX_VALUE);
        System.out.println("Minimo valor  = " + Character.MIN_VALUE);
    }
}