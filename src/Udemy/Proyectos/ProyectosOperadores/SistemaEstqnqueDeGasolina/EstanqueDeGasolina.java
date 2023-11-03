package Udemy.Proyectos.ProyectosOperadores.SistemaEstqnqueDeGasolina;

import javax.swing.*;

public class EstanqueDeGasolina
{
    public static void main(String[] args)
    {
        double capacidadActual = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la capacidad de gasolina (máximo: 70 litros) "));

        if (capacidadActual < 0 || capacidadActual > 70)
        {
            JOptionPane.showMessageDialog(null, "Ingrese un número comprendido entre 0 y 70 litros");
            main(args);
            System.exit(0);
        }

        if(capacidadActual == 70)
        {
            JOptionPane.showMessageDialog(null, "Estanque lleno");
        }else if(capacidadActual >= 60 && capacidadActual <= 70)
        {
            JOptionPane.showMessageDialog(null, "Estanque casi lleno");
        }else if(capacidadActual >= 40 && capacidadActual <= 60)
        {
            JOptionPane.showMessageDialog(null, "Estanque 3/4");
        }else if(capacidadActual >= 35 && capacidadActual <=40)
        {
            JOptionPane.showMessageDialog(null, "Medio estanque");
        } else if (capacidadActual >= 20 && capacidadActual <= 35)
        {
            JOptionPane.showMessageDialog(null, "Suficiente");
        }else if (capacidadActual >= 1 && capacidadActual <= 20)
        {
            JOptionPane.showMessageDialog(null, "Insuficiente");
        }
    }
}
