package Udemy.Variables;

public class PrimitivosEnteros
{
    public static void main(String[] args)
    {
        //El tipo de dato byte se puede almacenar en 8 bits
        //Acepta entre 127 positivo y -128 negativo
        byte numeroByte = 127;
        System.out.println("numeroByte = " + numeroByte);
        //Con este metodo devuelve la cantidad de bytes que tiene el String
        System.out.println("Tipo byte corresponde en byte a: " + Byte.BYTES);
        //Imprime el tamaño en el que se pueda almacenar
        System.out.println("Tipo byte corresponde en bytes a: " + Byte.SIZE);
        //El maximo y el minimo de los valores de un byte
        System.out.println("El maximo de un byte es: " + Byte.MAX_VALUE);
        System.out.println("El minimo de un byte es: " + Byte.MIN_VALUE);

        //Tipo de dato short en el que puede almacenar 16 bits
        short numeroShort = 32767;
        System.out.println("numeroShort = " + numeroShort);
        //Con este metodo devuelve la cantidad de bytes que tiene el String
        System.out.println("Tipo short corresponde en byte a: " + Short.BYTES);
        //Imprime el tamaño en el que se puede almacenar
        System.out.println("Tipo short corresponde en bytes a: " + Short.SIZE);
        //Imprime el maximo y el minimo de los valores de un short
        System.out.println("El maximo de un short es: " + Short.MAX_VALUE);
        System.out.println("El minimo de un short es: " + Short.MIN_VALUE);

        //Tipo de dato int en el que puede almacenar 32 bits
        int numeroInt = 2147483647;
        System.out.println("numeroInt = " + numeroInt);
        //Con este metodo devuelve la cantidad de bytes que tiene el String
        System.out.println("Tipo int corresponde en byte a: " + Integer.BYTES);
        //Imprime el tamaño en el que se puede almacenar
        System.out.println("Tipo int corresponde en bytes a: " + Integer.SIZE);
        //Imprime el maximo y el minimo de los valores de un int
        System.out.println("El maximo de un int es: " + Integer.MAX_VALUE);
        System.out.println("El minimo de un int es: " + Integer.MIN_VALUE);

        //Tipo de dato long en el que puede almacenar 64 bits
        /*En el tipo de dato long despues del argumento se debe colocar una letra L mayuscula o minuscula
        Para que diferencie a que tipo de dato pertenece*/
        long numeroLong = 9223372036854775807L;
        System.out.println("numeroLong = " + numeroLong);
        //Con este metodo devuelve la cantidad de bytes que tiene el String
        System.out.println("Tipo long corresponde en byte a: " + Long.BYTES);
        //Imprime el tamaño en el que se puede almacenar
        System.out.println("Tipo long corresponde en bytes a: " + Long.SIZE);
        //Imprime el maximo y el minimo de los valores de un long
        System.out.println("El maximo de un long es: " + Long.MAX_VALUE);
        System.out.println("El minimo de un long es: " + Long.MIN_VALUE);

        //var se utiliza para definir una varible dinamica
        //Cuando es un numero cualquiera lo va a tomar como tipo de dato integer
        var numeroVar = 127; //Byte
        System.out.println("numeroVar = " + numeroVar);
        var numeroVar2 = 32767; //Short
        System.out.println("numeroVar2 = " + numeroVar2);
        var numeroVar3 = 2147483647; //Integer
        System.out.println("numeroVar3 = " + numeroVar3);
        var numeroVar4 = 9223372036854775807L; //Long
        System.out.println("numeroVar4 = " + numeroVar4);
    }
}
