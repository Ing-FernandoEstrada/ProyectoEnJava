package Udemy.FlujosDeControl;

public class SentenciaSwithCase
{
    public static void main(String[] args)
    {
        int num = 2;

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
        }
    }
}
