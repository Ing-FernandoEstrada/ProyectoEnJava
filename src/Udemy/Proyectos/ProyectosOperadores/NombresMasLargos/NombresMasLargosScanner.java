package Udemy.Proyectos.ProyectosOperadores.NombresMasLargos;

import javax.swing.*;
import java.util.Scanner;

public class NombresMasLargosScanner
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el Nombre y Apellido del primer familiar");
        String persona1 = scanner.nextLine();
        System.out.println("Ingrese el Nombre y Apellido del segundo familiar");
        String persona2 = scanner.nextLine();
        System.out.println("Ingrese el Nombre y Apellido del tercer familiar");
        String persona3 = scanner.nextLine();

        String nombreMasLargo = persona1.split(" ")[0].length() > persona2.split(" ")[0].length() ? persona1 : persona2;
        nombreMasLargo = nombreMasLargo.split(" ")[0].length() > persona3.split(" ")[0].length() ? nombreMasLargo : persona3;

        System.out.println("El nombre mas largo es el de " + "\n" + nombreMasLargo);

    }
}
