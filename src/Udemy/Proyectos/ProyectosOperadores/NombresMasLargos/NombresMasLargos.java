package Udemy.Proyectos.ProyectosOperadores.NombresMasLargos;

import javax.swing.*;

public class NombresMasLargos
{
    public static void main(String[] args)
    {
        String persona1 = JOptionPane.showInputDialog("Ingresa el nombre y apellido de un familiar o amigo:");
        String persona2 = JOptionPane.showInputDialog("Ingresa el nombre y apellido de un familiar o amigo:");
        String persona3 = JOptionPane.showInputDialog("Ingresa el nombre y apellido de un familiar o amigo:");

        String nombreMasLargo = persona1.split(" ")[0].length() > persona2.split(" ")[0].length() ? persona1 : persona2;
        nombreMasLargo = nombreMasLargo.split(" ")[0].length() > persona3.split(" ")[0].length() ? nombreMasLargo : persona3;

        JOptionPane.showMessageDialog(null, "El nombre más largo es el de: " + "\n" + nombreMasLargo);
    }
}
