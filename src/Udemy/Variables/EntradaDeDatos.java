package Udemy.Variables;

import javax.swing.*;

public class EntradaDeDatos
{
    public static void main(String[] args)
    {
        //Sistema primitivo int

        //En este caso la aplicación se hara mas dinamica con la entrada de datos

        String numeroStr = JOptionPane.showInputDialog(null, "Ingrese un número entero");

        //Este proceso se realiza para cuando el usuario ingrese texto y no numeros lanze una excepcion
        //Para que funcione en el todo el proceso se debe inicializar la varibale por fuera

        int numeroDecimal = 0;

        try
        {
            numeroDecimal = Integer.parseInt(numeroStr);
            //El catch recibe el error
        }catch (NumberFormatException e)
        {
            JOptionPane.showMessageDialog(null, "Error: Debe ingresar un número entero");
            //Se debe llamar al metodo main de forma directa
            main(args);
            //Se tienen que salir para que no se forme un bucle
            //Para salir tambien se puede utilizar el returno por el tipo de dato void
            System.exit(0);
        }

        System.out.println("numero = " + numeroDecimal);

        //Numero Binario de tipo String utilizando la clase Integer.toBinaryString
        //Se puede arreglar el codigo de esta manera para que se vea mejor
        String ResultadoBinario = "numero binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
        System.out.println(ResultadoBinario);
        //Devuelve 500 en binario utilizando 1 y 0

        //Ahora el binario se convertira en tipo entero
        //con 0b java entiende que se esta trabajando con un número binario
        int numeroBinario = 0b11110;
        System.out.println("numeroBinario = " + numeroBinario);

        //convertir el numero en sistema octal
        String ResultadoOctal = "numero octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);
        System.out.println(ResultadoOctal);
        //Para imprimir el sistema octal se be colocar un 0 delante del numero
        int numeroOctal = 0364;
        System.out.println("numeroOctal = " + numeroOctal);

        //convertir el numero a sistema hexadecimal
        String ResultadoHexadecimal = "numero hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);
        System.out.println(ResultadoHexadecimal);
        //Imrpime el sistema hexadecimal se debe colocar un 0x delante del numero
        int numeroHex = 0x1e;
        System.out.println("numeroHex = " + numeroHex);

        //Mostrar el resultado en una ventana de mensaje

        String mensaje = ResultadoBinario;
        //Para concatenar mas Strings se utiliza +=
        mensaje += "\n" + ResultadoOctal;
        mensaje += "\n" + ResultadoHexadecimal;

        //Imprime el resultado en una ventana de mensaje
        JOptionPane.showMessageDialog(null, mensaje + numeroDecimal);
    }
}
