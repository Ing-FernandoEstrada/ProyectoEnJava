package Udemy.Operadores;

import java.util.Scanner;

public class OperadorTernarioNumeroMenor
{
    public static void main(String[] args)
    {
        int min = 0;

        Scanner scanner =  new Scanner(System.in);

        System.out.println("Ingrese un número: ");
        int numero1 = scanner.nextInt();
        System.out.println("Ingrese el segundo número: ");
        int numero2 = scanner.nextInt();
        System.out.println("Ingrese el tercer número: ");
        int numero3 = scanner.nextInt();
        //En este caso aumentamos un cuarto numero
        System.out.println("Ingrese el cuarto número: ");
        int numero4 = scanner.nextInt();

        //En este caso comparamos el numero 1 y num2 para saber cual es el mayor
        min = (numero1 < numero2) ? numero1: numero2;
        //En este caso si el maximo es mayor retorna max de lo contrario numero 3
        min = (min < numero3) ? min: numero3;
        min = (min < numero4) ? min: numero4;

        //Imprimos cada uno de los numeros
        System.out.println("numero1 = " + numero1);
        System.out.println("numero2 = " + numero2);
        System.out.println("numero3 = " + numero3);
        System.out.println("numero3 = " + numero4);

        //Imprimimos cual es el numero minimo
        System.out.println("El numero menor es: " + min);
    }
}
