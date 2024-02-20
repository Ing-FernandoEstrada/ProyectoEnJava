package Udemy.Proyectos.FlujosDeControl.NumeroMenor;

import javax.swing.*;
import java.util.Scanner;

public class ValorMenorMultiplesValores
{
    public static void main(String[] args)
    {
        int cantidad = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad de numeros a comparar igual o mayor a 10"));

        // preguntamos si es menor a 10, ya que el mínimo según la letra de la tarea es 10 (buscar el número menor de minimo 10 valores enteros).
        if (cantidad < 10)
        {
            JOptionPane.showMessageDialog(null, "El número es menor que 10! Vuelve a intentarlo");
            main(args);
        }
        else
        {
            int menor = Integer.MAX_VALUE;
            int numero;

            for(int i = 0; i < cantidad; i++)
            {
                numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero " + (i + 1) + ": "));
                menor = (numero < menor) ? numero : menor;
            }

            JOptionPane.showMessageDialog(null, "El número menor es: " + menor);

            if(menor < 10)
            {
                JOptionPane.showMessageDialog(null, "El número " + menor + " es menor que 10!");
            }
            else {
                JOptionPane.showMessageDialog(null, "El número " + menor + " es igual o mayor que 10!");
            }
        }
    }
}
