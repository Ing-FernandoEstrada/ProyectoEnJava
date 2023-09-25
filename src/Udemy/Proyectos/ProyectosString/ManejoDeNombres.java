package Udemy.Proyectos.ProyectosString;

import javax.swing.*;

public class ManejoDeNombres
{
    public static void main(String[] args)
    {

        String nombreMadre;
        do
        {
            nombreMadre = JOptionPane.showInputDialog(null, "Ingrese el nombre de la madre");
            nombreMadre = nombreMadre != null ? nombreMadre.trim() : "";

            if(nombreMadre.isBlank())
            {
                JOptionPane.showMessageDialog(null, "El nombre de la madre no puede estar en blanco!");
                System.exit(0);
            }
        }
        while (nombreMadre.isBlank());

        String nombrePadre;
        do
        {
            nombrePadre = JOptionPane.showInputDialog(null, "Ingrese el nombre del padre");
            nombrePadre = nombrePadre != null ? nombrePadre.trim() : "";

            if(nombrePadre.isBlank())
            {
                JOptionPane.showMessageDialog(null, "El nombre del padre no puede estar en blanco!");
                System.exit(0);
            }
        }
        while(nombrePadre.isBlank());

        String nombreHermana;
        do
        {
            nombreHermana = JOptionPane.showInputDialog(null, "Ingrese el nombre de la hermana");
            nombreHermana = nombreHermana != null ? nombreHermana.trim() : "";

            if(nombreHermana.isBlank())
            {
                JOptionPane.showMessageDialog(null, "El nombre de la hermana no puede estar en blanco!");
                System.exit(0);
            }

        }
        while(nombreHermana.isBlank());

        String primerNombre = nombreMadre.toUpperCase().charAt(1) + "." + nombreMadre.substring(nombreMadre.length()-2).toUpperCase();
        String segundoNombre = nombrePadre.toUpperCase().charAt(1) + "." + nombrePadre.substring(nombrePadre.length()-2).toUpperCase();
        String tercerNombre = nombreHermana.toUpperCase().charAt(1) + "." + nombreHermana.substring(nombreHermana.length()-2).toUpperCase();

        String detalle = "Nuevos nombres: " + "\n" + primerNombre.concat("_") + segundoNombre.concat("_") + tercerNombre.concat("_");

        JOptionPane.showMessageDialog(null, "El detalle de los nombres es: " + "\n" + detalle);
        JOptionPane.showMessageDialog(null, "!!Muchas gracias¡¡");
    }
}