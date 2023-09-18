package Udemy.Proyectos.ProyectosString;

import java.util.Locale;
import java.util.Scanner;

public class ProgramaManejoDeNombresScanner
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre de la madre: ");
        String nombreMadre = scanner.nextLine();
        //Retorna el nombre del familiar en mayusculas concatenado con un . y con los dos ultimos caracteres del nombre en mayusculaa
        String primerNombre = nombreMadre.toUpperCase().charAt(1) + "." + nombreMadre.substring(nombreMadre.length()-2).toUpperCase();

        System.out.println("Ingrese el nombre del padre: ");
        String nombrePadre = scanner.nextLine();
        String segundoNombre = nombrePadre.toUpperCase().charAt(1) + "." + nombrePadre.substring(nombrePadre.length()-2).toUpperCase();

        System.out.println("Ingrese el nombre de la hermana o hermano: ");
        String nombreHermana = scanner.nextLine();
        String tercerNombre = nombreHermana.toUpperCase().charAt(1) + "." + nombreHermana.substring(nombreHermana.length()-2).toUpperCase();

        System.out.println("Nuevos nombres: " + "\n" + primerNombre.concat("_") + segundoNombre.concat("_") + tercerNombre.concat("_"));
        System.out.println("!!MUCHAS GRACIAS¡¡");

    }
}
