package Udemy.Proyectos.ProyectosOperadores;

import java.util.Scanner;

public class OperadoresLogicosLoginArregloScanner
{
    public static void main(String[] args) {
        // Definimos los usuarios y contraseñas en un arreglo
        String[] usuarios = {"usuario1", "usuario2", "usuario3", "usuario4", "usuario5", "usuario6", "usuario7", "usuario8", "usuario9", "usuario10"};
        String[] contrasenas = {"contrasena1", "contrasena2", "contrasena3", "contrasena4", "contrasena5", "contrasena6", "contrasena7", "contrasena8", "contrasena9", "contrasena10"};

        // Creamos un objeto Scanner para recibir la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su usuario: ");
        String usuarioIngresado = scanner.nextLine();

        System.out.print("Ingrese su contraseña: ");
        String contrasenaIngresada = scanner.nextLine();

        boolean autenticado = false;

        // Comparamos el usuario y la contraseña ingresados con los datos en el arreglo
        for (int i = 0; i < usuarios.length; i++)
        {
            if (usuarioIngresado.equals(usuarios[i]) && contrasenaIngresada.equals(contrasenas[i]))
            {
                autenticado = true;
                break;
            }
        }

        // Verificamos si el usuario fue autenticado
        if (autenticado) {
            System.out.println("¡Bienvenido, " + usuarioIngresado + "!");
        } else {
            System.out.println("Usuario y contraseña incorrecto");
            System.out.println("Lo siento, requiere autenticación.");
        }

        // Cerramos el scanner
        scanner.close();
    }
}
