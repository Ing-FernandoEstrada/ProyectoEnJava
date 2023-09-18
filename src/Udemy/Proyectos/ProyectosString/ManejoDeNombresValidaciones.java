package Udemy.Proyectos.ProyectosString;

import javax.swing.*;
import java.util.Arrays;
import java.util.Scanner;

public class ManejoDeNombresValidaciones
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nombreMadre;

        do {
            System.out.println("Ingrese el nombre de la madre: ");
            nombreMadre = scanner.nextLine().trim();
        }
        while (nombreMadre.isBlank());

        String nombrePadre;
        do {
            System.out.println("Ingrese el nombre del padre: ");
            nombrePadre = scanner.nextLine().trim();
        }
        while (nombrePadre.isBlank());

        String nombreHermana;
        do {
            System.out.println("Ingrese el nombre de la hermana o hermano: ");
            nombreHermana = scanner.nextLine().trim();
        }
        while (nombreHermana.isBlank());

        String primerNombre = nombreMadre.toUpperCase().charAt(1) + "." + nombreMadre.substring(nombreMadre.length() - 2).toUpperCase();
        String segundoNombre = nombrePadre.toUpperCase().charAt(1) + "." + nombrePadre.substring(nombrePadre.length() - 2).toUpperCase();
        String tercerNombre = nombreHermana.toUpperCase().charAt(1) + "." + nombreHermana.substring(nombreHermana.length() - 2).toUpperCase();

        System.out.println("Nuevos nombres: " + "\n" + primerNombre.concat("_") + segundoNombre.concat("_") + tercerNombre.concat("_"));
        System.out.println("!!MUCHAS GRACIAS¡¡");
    }
}
