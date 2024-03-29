package Udemy.Proyectos.FlujosDeControl.Multiplicacion;

import java.util.Scanner;

public class MultiplicarDosNumerosScanner
{
    public static void main(String[] args)
    {
        Scanner scanner =  new Scanner(System.in);

        System.out.println("Ingrese el primer número");
        int num1 = scanner.nextInt();

        System.out.println("Ingrese el segundo número");
        int num2 = scanner.nextInt();

        int resultado = 0;

        int valorAbsolutoA = Math.abs(num1);

        //Se suma tantas veces el valor del num2, segun el valor del num1
        for(int i = 0; i < valorAbsolutoA; i++ )
        {
            resultado += num2;
        }

        //Si ambos son negativos o si solo uno es negativo se invierte el signo
        if(num1 * num2 < 0)
        {
            resultado = - resultado;
        }

        System.out.println("El resultado es: " + resultado);
    }
}
