package Udemy.Proyectos.ProyectosOperadores.SistemaEstqnqueDeGasolina;

import java.util.Scanner;

public class EstanqueDeGasolinaScanner
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la capacidad de gasolina (máximo: 70 litros) ");
        double capacidadActual = scanner.nextDouble();

        if (capacidadActual < 0 || capacidadActual > 70)
        {
            System.out.println("Ingrese un número comprendido entre 0 y 70 litros");
            main(args);
            System.exit(0);
        }

        if(capacidadActual == 70)
        {
            System.out.println("Estanque lleno");
        }else if(capacidadActual >= 60 && capacidadActual <= 70)
        {
            System.out.println("Estanque casi lleno");
        }else if(capacidadActual >= 40 && capacidadActual <= 60)
        {
            System.out.println("Estanque 3/4");
        }else if(capacidadActual >= 35 && capacidadActual <=40)
        {
            System.out.println("Medio estanque");
        } else if (capacidadActual >= 20 && capacidadActual <= 35)
        {
            System.out.println("Suficiente");
        }else if (capacidadActual >= 1 && capacidadActual <= 20)
        {
            System.out.println("Insuficiente");
        }
    }
}
