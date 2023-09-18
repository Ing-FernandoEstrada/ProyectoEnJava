package Udemy.TipoStringCadenas;

public class EjemploStringExtensionArchivo
{
    public static void main(String[] args)
    {
        String archivo = "alguna_imagen.jpeg";
        //es mejor utilizar last indexOf para capturar la ultima ocurrencia del .
        int i = archivo.lastIndexOf(".");

        //imprimimos la cantidad de caracteres
        System.out.println("archivo = " + archivo.length());
        //tomamos los 4 ultimos
        System.out.println("archivo.substring(14) = " + archivo.substring(14));
        //De ahi para adelante va a tomar inmclusive el .
        System.out.println("archivo.substring(14) = " + archivo.substring(i));
        //Que parta de un caracter + 1 o elo numero que sea dentro del rango
        System.out.println("archivo.substring(14) = " + archivo.substring(i+1));
    }
}
