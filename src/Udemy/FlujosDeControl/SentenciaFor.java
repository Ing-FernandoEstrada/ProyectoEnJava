package Udemy.FlujosDeControl;

public class SentenciaFor
{
    public static void main(String[] args)
    {
        //Con el mayor o menor igual incluye la iteración del ciclo en el cual se esta dando el rengo
        //Realiza las preguntas uno por uno
        //La inicialización se puede colocar por dentro del ciclo o por fuera, sin embargo toca respetar el orden del ciclo

        System.out.println("Esto es lo que imprime cuando todas las variables estann inicializadas dentro del ciclo");
        for(int i = 0; i <= 5; i++)
        {
            System.out.println("i = " + i);
        }
        //Si no se enbcuentra la variable por fuera del ciclo y se imprime el metodo main saldra un error

        //Si se lo deja por fuera del ciclo hace parte del metodo main

        System.out.println("Esto es lo que imprime cuando la inicialización hace parte del metodo main");
        int j = 0;
        for(; j <= 5; j++)
        {
            System.out.println("j = " + j);
        }
        System.out.println("j = " + j);

        //Tambien en el ciclo se podria cambiar el orden de la secuencia en la que se genera el ciclo
        for(int s = 10; s > 0; s--)
        {
            System.out.println("s = " + s);
        }

        //Combinaciones
        System.out.println("Combinación para que i llegue hasta 5 y s empiece desde 10 y se decremente");
        for(int i = 1, s = 10; i < s; i++, s--)
        {
            System.out.println(i + " - " + s);
        }

        //Este ciclo unicamente sirve para que imprima numeros impares
        System.out.println("Este ciclo solo imprime números impares");
        //Se implementa por medio de un if
        for(int i = 0; i <= 10; i++)
        {
            //Con el modulo se indica si el numero es par
            if(i % 2 == 0)
            {
                //Este modulo permite unicamente salirse de la iteración y continua
                continue;
                //Cada que sea par se sale de la iteración y solo unicamente imprime números impares
            }
            System.out.println("i = " + i);
        }

        System.out.println("Este ciclo solo imprime números pares");
        //Se implementa por medio de un if
        for(int i = 0; i <= 10; i++)
        {
            //Con el modulo se indica si el numero es par o impar
            //Si es con negación solo imprime números pares
            if(i % 2 != 0)
            {
                //Este modulo permite unicamente salirse de la iteración y continua
                continue;
                //Cada que sea par se sale de la iteración y solo unicamente imprime números pares
            }
            System.out.println("i = " + i);
        }
    }
}
