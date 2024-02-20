package Udemy.Proyectos.FlujosDeControl.NumeroMenor;

import java.util.Scanner;

public class ValorMenorMultiplesValoresScanner
{
    public static void main(String[] args)
    {
        Scanner scanner =  new Scanner(System.in);

        System.out.println("Ingrese la cantidad de numeros a comparar igual o mayor a 10");
        int cantidad = scanner.nextInt();

        // preguntamos si es menor a 10, ya que el mínimo según la letra de la tarea es 10 (buscar el número menor de minimo 10 valores enteros).
        if (cantidad < 10)
        {
            System.out.println("El número es menor que 10! Vuelve a intentarlo ");
            main(args);
        }
        else
        {
            int menor = Integer.MAX_VALUE;
            int numero;

            for(int i = 0; i < cantidad; i++)
            {
                System.out.println("Ingrese el numero " + (i + 1) + ": ");
                numero = scanner.nextInt();
                menor = (numero < menor) ? numero : menor;
            }

            System.out.println("El número menor es: " + menor);

            if(menor < 10)
            {
                System.out.println("El número " + menor + " es menor que 10!");
            }
            else {
                System.out.println("El número " + menor + " es igual o mayor que 10!");
            }
        }
    }
}
