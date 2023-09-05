package Udemy.Variables;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EntradaDeDatosScanner
{
    public static void main(String[] args)
    {
        //Entrada de datos desde el terminal
        //System .in es para recibir los datos desde la consola
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un número entero: ");

        //Sistema primitivo int

        //En este caso la aplicación se hara mas dinamica con la entrada de datos

        //Espera en la consola hasta que el usuario ingrese un número

        /*String numeroStr = scanner.nextLine();*/

        //Este proceso se realiza para cuando el usuario ingrese texto y no numeros lanze una excepcion
        //Para que funcione en el todo el proceso se debe inicializar la varibale por fuera

        int numeroDecimal = 0;

        try
        {
            //Directamente nos convierte el número a entero sin necesidad de utilizar el nextLine
            numeroDecimal = scanner.nextInt();//Integer.parseInt(numeroStr);
            //El catch recibe el error
        }catch (InputMismatchException e)
        {
            System.out.println("Error: Debe ingresar un número entero");
            //Se debe llamar al metodo main de forma directa
            main(args);
            //Se tienen que salir para que no se forme un bucle
            //Para salir tambien se puede utilizar el returno por el tipo de dato void
            System.exit(0);
        }

        System.out.println("numero = " + numeroDecimal);

        //Numero Binario de tipo String utilizando la clase Integer.toBinaryString
        //Se puede arreglar el codigo de esta manera para que se vea mejor
        String ResultadoBinario = "Numero binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);

        //convertir el numero en sistema octal
        String ResultadoOctal = "Numero octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);

        //convertir el numero a sistema hexadecimal
        String ResultadoHexadecimal = "Numero hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);

        //Mostrar el resultado en una ventana de mensaje

        String mensaje = ResultadoBinario;
        //Para concatenar mas Strings se utiliza +=
        mensaje += "\n" + ResultadoOctal;
        mensaje += "\n" + ResultadoHexadecimal;

        System.out.println(mensaje);
    }
}
