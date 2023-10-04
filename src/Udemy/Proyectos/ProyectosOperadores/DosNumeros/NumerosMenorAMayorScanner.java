package Udemy.Proyectos.ProyectosOperadores.DosNumeros;

import java.util.Scanner;

public class NumerosMenorAMayorScanner
{
    public static void main(String[] args)
    {
        //Ingrese dos numeros y que los muestre ordenados de mayor a menor
        Scanner scanner =  new Scanner(System.in);

        System.out.println("Ingrese el primer número: ");
        int numero1 = scanner.nextInt();
        System.out.println("Ingrese el segundo número: ");
        int numero2 = scanner.nextInt();

        //Imprimos cada uno de los numeros
        System.out.println("Número 1 = " + numero1);
        System.out.println("Número 2 = " + numero2);

        //Se realiza la condición
        String resultado = (numero1 < numero2) ? numero1 + " es menor que " + numero2 : numero2 + " es menor que " + numero1;

        //Imprimimos el orden
        System.out.println("El orden es: " + "\n" + resultado);
    }
}
