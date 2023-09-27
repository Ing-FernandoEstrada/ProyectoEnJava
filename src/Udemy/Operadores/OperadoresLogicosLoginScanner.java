package Udemy.Operadores;
import java.util.Scanner;

public class OperadoresLogicosLoginScanner
{
    public static void main(String[] args)
    {
        //En este caso se realizara un login utilizando operadores logicos como el and y el or
        String username = "fernando";
        String password = "12345";

        //Lo que se debe realizar cuando son mas de 1 usuario
        String username2 = "admin";
        String password2 = "12345";

        Scanner scanner = new Scanner(System.in);

        //En este caso se captura para que el usuario ingrese el username
        System.out.println("Ingrese el username");;
        String usuario = scanner.nextLine();

        System.out.println("Ingrese la contraseña");;
        String contraseña = scanner.nextLine();

        //Aqui se compara los datos
        //En este caso se realiza la autenticacion utilizndo el operador and
        boolean esAutenticado = false;
        //Usanado el iquals se compara los valores.
        //Si el usuario y la contraseña coinciden puede ingresar
        //Utilizando el operador or se puede autenticar mas usuarios
        if( (username.equals(usuario) && password.equals(contraseña)) ||
                (username2.equals(usuario) && password2.equals(contraseña)))
        {
            esAutenticado = true;
        }
        //SI se quiere decir que el usuario y contraseña es invalido seria con un else
        else
        {
            System.out.println("Usuario o contraseña incorrecto");
        }

        //Y si ya puede ingresar dentro del sistema aparece el mensaje de bienvenido
        if (esAutenticado)
        {
            System.out.println("Bienvenido Usuario ".concat(usuario).concat("!"));
        }
        //Pero si no esta autenticado con el usuario y contraseña aparece no esta autenticado
        else
        {
            System.out.println("Lo siento requiere autenticación");
        }
    }
}
