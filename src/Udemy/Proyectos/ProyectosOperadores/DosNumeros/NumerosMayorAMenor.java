package Udemy.Proyectos.ProyectosOperadores.DosNumeros;

import javax.swing.*;
import java.util.Scanner;

public class NumerosMayorAMenor
{
    public static void main(String[] args)
    {
        int numero1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el primer numero: "));
        int numero2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el segundo numero: "));

        JOptionPane.showMessageDialog(null, "Número 1 es: " + numero1 + "\n" + "Número 2 es: " + numero2);

        //Se realiza la condición
        String resultado = (numero1 > numero2) ? numero1 + " es mayor que " + numero2 : numero2 + " es mayor que " + numero1;

        //Imprimimos el orden
        JOptionPane.showMessageDialog(null, "El orden entre " + numero1 + "y " + numero2 + " es: " + "\n" +resultado);
    }
}
