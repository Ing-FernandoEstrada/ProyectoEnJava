package Udemy.Operadores;

import java.util.Scanner;

public class OperadorTernarioScanner
{
    public static void main(String[] args)
    {
        //Se le conoce como condcional true o false
        //Significa que esta formado por 3 elemetnos partes o argumentos
        //Se pregunta si se cumple con el signpo pregunta
        //: significa de lo contrario

        //Esta es la estructura
        //variable = condicion ? si es verdadero: si es falso;

        //Ahora si se lo lleva a Java quedaria de la siguiente manera
        //Retorna true si la condicion es verdadero
        //De lo contrario es falso
        //En este caso retorna true
        String variable = 7 == 7 ? "Si es verdadero": "si es falso";
        System.out.println("variable = " + variable);
        //En este caso retorna falso
        String variable2 = 7 == 8 ? "Si es verdadero": "si es falso";
        System.out.println("variable = " + variable2);

        String estado = "";
        double promedio = 0.0;

        //Es lo mismo que decir
        /*if(promedio >= 5.49)
        {
            estado = "Aprobado";
        }
        else {
            estado = "Rechazado";
        }*/

        //Realmente fue un ejemplo muy simple pero cambiaremos de ejemplo
        //Para que alguien pueda ingresar las notas desde la clase escaner sera de esta manera

        double matematicas = 0.0;
        double ciencias = 0.0;
        double historia = 0.0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la nota de matematicas entre 2.0 y 7.0: ");
        matematicas = scanner.nextDouble();
        System.out.println("Ingrese la nota de ciencias entre 2.0 y 7.0: ");
        ciencias = scanner.nextDouble();
        System.out.println("Ingrese la nota de historia entre 2.0 y 7.0: ");
        historia = scanner.nextDouble();

        //En este caso calculamos el promedio
        promedio = (matematicas + ciencias + historia) / 3;
        System.out.println("El promedio de matemáticas, ciencias e historia es: " + "\n" + promedio);

        //En este caso se crea un operador ternario para una nota la cual si es mayor a 5.49 es aprobado de lo contrario rechazado
        //En este caso se aprueba pero si se cambia el valor del promedio a un numero menor cambiara el estado
        estado = promedio >= 5.49 ? "Aprobado": "Rechazado";
        System.out.println("promedio = " + estado);

        //en el terminal no se puede utilizar el . si no la , para un tipo de dato decimal
    }
}
