package Udemy.TipoStringCadenas;

import java.util.Locale;

public class EjemploStringMetodos
{
    public static void main(String[] args)
    {
        String nombre = "Fernando";

        //------Metodos más importentes de la clase string------

                //------------Parte 1----------------

        //Metodo para saber el largo de cadena String
        System.out.println("nombre.length() = " + nombre.length());
        //Como convertir el texto a mayuscula
        System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase());
        //Convertir el texto en minuscula
        System.out.println("nombre.toLowerCase = " + nombre.toLowerCase());
        //Comparar un String con otro
        //En este caso sera true
        System.out.println("nombre.equals(\"Fernando\") = " + nombre.equals("Fernando"));
        //En este caso sera false
        System.out.println("nombre.equals(\"andres\") = " + nombre.equals("fernando"));
        //Con este metodo ignora mayusculas y minusculas
        System.out.println("nombre.equalsIgnoreCase(\"fernando\") = " + nombre.equalsIgnoreCase("fernando"));
        //compara caracteres este metodo ordena en lexiografico los caracteres
        //Si son iguales el resulado sera 0
        //Si son deferentes el resultado sera - 32
        System.out.println("nombre.compareTo(\"fernando\")) = " + nombre.compareTo("fernando"));
        //Con otro nombre el resultado es 13
        System.out.println("nombre.compareTo(\"andres\")) = " + nombre.compareTo("andres"));
        //convierte un string en caracteres o puede obtener un caracter en particular
        // 0 corresponde a la primera letra
        System.out.println("nombre.charAt(0) = " + nombre.charAt(0));
        // Si se quiere obtener otra letra se debe indicar la posicion
        System.out.println("nombre.charAt(1) = " + nombre.charAt(1));
        //Si se quiere obtner el ultimo caracter de forma dinamica seria de esta manera
        System.out.println("nombre.charAt(nombre.length()-1) = " + nombre.charAt(nombre.length()-1));
        //Obtiene un fragmento del string
        //obtiene desde la posicion en la que se indique hacia delante
        System.out.println("nombre.substring(1) = " + nombre.substring(1));
        //Recibe desde y hasta por medio de dos argumentos
        //La ultima posicion no se incluye
        System.out.println("nombre.substring(1, 4) = " + nombre.substring(1, 4));
        //Que imprima desde una posicion especifica hasta el final
        System.out.println("nombre.substring(5, 8) = " + nombre.substring(5, 8));
        //Para obtener el ultimo caracter de forma dinamica
        System.out.println("ombre.substring(nombre.length()-1) = " + nombre.substring(nombre.length()-1));
        //Los dos ultimos -2
        System.out.println("ombre.substring(nombre.length()-1) = " + nombre.substring(nombre.length()-2));

                  //------------Parte 2----------------
    }
}
