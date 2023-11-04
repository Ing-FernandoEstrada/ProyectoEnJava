package Udemy.FlujosDeControl;

import java.util.Scanner;

public class SentenciaIfElseNumDiasMes
{
    public static void main(String[] args)
    {
        //En este caso con la clase scanner se modifica el codigo para que el usuario ingrese el mes
        Scanner scanner = new Scanner(System.in);

        int mes;

        System.out.println("Ingrese el número del mes de 1 a 12");
        //En este caso se realizara un programa para saber el numero de dias segun el mes
        mes = scanner.nextInt();

        if(mes < 1 || mes > 12)
        {
            System.out.println("Error: Ingrese el mes correctamente");
            main(args);
            System.exit(0);
        }

        // Se inicaliza la variable en cero para el número de dias
        int numeroDias = 0;

        System.out.println("Ingrese el año");
        // Esta variable se crea para saber el año en el que esta
        int anio = scanner.nextInt();

        if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 11 || mes == 12)
        {
            numeroDias = 31;
        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11)
        {
            numeroDias = 30;
        } else if (mes == 2)
        {
            //Para calcular el mes 2, se debe ssaber si es biciesto o no para esto se debe realizar el siguiente calculo
            //Si el año es divisible por 400 es año biciesto o
            //EL año es divisible por 4 y no divisible por 100 es año bicisto
            if (anio % 400 == 0 || ((anio % 4 == 0) && !(anio % 100 == 0)))
            {
                numeroDias = 29;
            }else{
                numeroDias = 28;
            }
        }
        System.out.println("El numero de dias del mes es de " + numeroDias);
    }
}
