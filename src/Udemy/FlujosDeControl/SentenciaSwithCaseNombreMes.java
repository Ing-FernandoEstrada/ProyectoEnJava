package Udemy.FlujosDeControl;

import java.util.Scanner;

public class SentenciaSwithCaseNombreMes
{
    public static void main(String[] args)
    {
        // Para solicitar al usuario que ingrese el mes en la ejecución
        Scanner scanner = new Scanner(System.in);

        int mes;

        System.out.println("Ingrese el numero del mes");
        mes = scanner.nextInt();

        if(mes < 1 || mes > 12)
        {
            System.out.println("Error: Ingrese el mes comprendido entre 1 y 12");
            main(args);
            System.exit(0);
        }

        String nombreMes = null;

        //Es importante utilizar el break para que no se salte del resultado que se le esta solicitando que de la respuesta
        switch (mes)
        {
            case 1:
                nombreMes = "Enero";
                break;
            case 2:
                nombreMes = "Febrero";
                break;
            case 3:
                nombreMes = "Marzo";
                break;
            case 4:
                nombreMes = "Abril";
                break;
            case 5:
                nombreMes = "Mayo";
                break;
            case 6:
                nombreMes = "Junio";
                break;
            case 7:
                nombreMes = "Julio";
                break;
            case 8:
                nombreMes = "Agosto";
                break;
            case 9:
                nombreMes = "Septiembre";
                break;
            case 10:
                nombreMes = "Octubre";
                break;
            case 11:
                nombreMes = "Noviembre";
                break;
            case 12:
                nombreMes = "Diciembre";
                break;
            default:
                nombreMes = "Indefinido";
        }

        System.out.println("El nombre del mes es: " + nombreMes);

        /*int num = 2;

        //La sentencia swith solo acepta valores char, byte, short, int, String
        //En este caso si se ejecuta en uno sigue validando los demas resultados
        //Por tanto es recomendable utilizar la sentencia break para cerrar el cilo cuando ya encontro el resultado
        switch (num){
            case 0:
                System.out.println("El número es cero");
                break;
            case 1:
                System.out.println("El número es uno");
                break;
            case 2:
                System.out.println("El número es dos");
                break;
            case 3:
                System.out.println("El número es tres");
                break;
            //Esta sentencia default se utiliza cuando el numero o caracter que se ingrese no esta en la lista
            default:
                System.out.println("Número o caracter desconocido");
        }

        String nombre = "Andres";

        switch (nombre) {
            case "admin":
                System.out.println("Hola admin, bienvenido!");
                break;
            case "Andres":
                System.out.println("Hola andres");
                break;
            case "Pepe":
                System.out.println("Hola Pepe");
                break;
            default:
                System.out.println("Usuario desconocido");
        }*/
    }
}
