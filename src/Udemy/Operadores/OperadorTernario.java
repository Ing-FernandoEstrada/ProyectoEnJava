package Udemy.Operadores;

import javax.swing.*;
import java.util.Scanner;

public class OperadorTernario
{
    public static void main(String[] args)
    {
        String estado = "";
        double promedio = 0.0;

        double matematicas = 0.0;
        double ciencias = 0.0;
        double historia = 0.0;

        Scanner scanner = new Scanner(System.in);

        matematicas = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la nota de matematicas entre 2.0 y 7.0: "));
        ciencias = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la nota de ciencias entre 2.0 y 7.0: "));
        historia = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la nota de historia entre 2.0 y 7.0: "));

        //En este caso calculamos el promedio
        promedio = (matematicas + ciencias + historia) / 3;
        JOptionPane.showMessageDialog(null, "El promedio de matemáticas, ciencias e historia es" + "\n" + promedio);

        estado = promedio >= 5.49 ? "Aprobado": "Rechazado";
        JOptionPane.showMessageDialog(null, "El promedio esta: " + estado);

        //en el terminal no se puede utilizar el . si no la , para un tipo de dato decimal
    }
}
