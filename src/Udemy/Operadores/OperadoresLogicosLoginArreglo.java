package Udemy.Operadores;
import java.util.Scanner;
public class OperadoresLogicosLoginArreglo
{
    public static void main(String[] args)
    {
        //Para definir un arreglo se debe colocar los corchetes para identificar que es un arreglo
        //En este caso se crea la instancia pero se usa para la cantidad de caracteres que tendra el arreglo
        //Si se desea agregar un 3 usuario se debe cambiar los valores en el arreglo
        /*String[] usernames = new String[3];
        String[] passwords = new String[3];

        //En este caso se realizara un login utilizando operadores logicos como el and y el or
        //En este caso se guarda el arreglo dependiendo de la posicion
        usernames[0] = "fernando";
        passwords[0] = "12345";

        //Lo que se debe realizar cuando son mas de 1 usuario
        usernames[1] = "admin";
        passwords[1] = "12345";

        usernames[2] = "andres";
        passwords[2] = "12345";*/

        //De esta manera se escribe mas simplificado el arreglo

        String[] usernames = {"fernando", "admin", "andres"};
        String[] passwords = {"12345", "1234545", "123435455"};

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

        //En este caso se utiliza eñl cilo for para recorrer el numero de elementos que contiene el arreglo
        for(int i=0; i < usernames.length; i++)
        {
            //se utiliza corchete para acceder al valor
            if( usernames[i].equals(usuario) && passwords[i].equals(contraseña))
            {
                esAutenticado = true;
                //Break se utiliza para salirse del for
                break;
            }
        }

        //Y si ya puede ingresar dentro del sistema aparece el mensaje de bienvenido
        if (esAutenticado)
        {
            System.out.println("Bienvenido Usuario ".concat(usuario).concat("!"));
        }
        //Pero si no esta autenticado con el usuario y contraseña aparece no esta autenticado
        else
        {
            System.out.println("Usuario o contraseña incorrecto");
            System.out.println("Lo siento requiere autenticación");
        }
    }
}
