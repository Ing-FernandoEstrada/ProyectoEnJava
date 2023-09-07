package Udemy.Variables;

public class SistemasNumericos
{
    public static void main(String[] args)
    {
        //Sistema primitivo int
        int numeroDecimal = 70;
        System.out.println("numeroDecimal = " + numeroDecimal);

        //Numero Binario de tipo String utilizando la clase Integer.toBinaryString
        System.out.println("numero binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal));
        //Devuelve 500 en binario utilizando 1 y 0

        //Ahora el binario se convertira en tipo entero
        //con 0b java entiende que se esta trabajando con un número binario
        int numeroBinario = 0b111110100;
        System.out.println("numeroBinario = " + numeroBinario);

        //convertir el numero en sistema octal
        System.out.println("numero octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal));
        //Para imprimir el sistema octal se be colocar un 0 delante del numero
        int numeroOctal = 0764;
        System.out.println("numeroOctal = " + numeroOctal);

        //convertir el numero a sistema hexadecimal
        System.out.println("numero hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal));
        //Imrpime el sistema hexadecimal se debe colocar un 0x delante del numero
        int numeroHex = 0x1f4;
        System.out.println("numeroHex = " + numeroHex);
    }
}
