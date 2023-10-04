package Udemy.Operadores;

public class PrecedenciaOperadores
{
    public static void main(String[] args) {
        //Variables del tipo integer
        int i = 14;
        int j = 8;
        int k = 20;

        //Si se desea calcular el promedio de los 3 deberia ser de la siguiente manera
        //En este caso tiene en cuenta mayormente realizar la division primero en este caso el resultado no seria correcto
        //Para que no suceda eso deberiamos utilizar los ()
        //En este caso se coloca la d en el numero para que tengan todos numeros decimales despues de la ,
        //De lo contrario lo redondea y lo toma como exacta

        double promedio = (i + j + k) / 3d; //la d es de double
        System.out.println("El promedio es: = " + promedio);

        promedio = i + j + k / 3d * 10; //Primero divide luego multiplica y luego suma
        System.out.println("El promedio es: = " + promedio);

        promedio = i + j + k / (3d * 10); //primero multiplica luego divide y luego suma
        System.out.println("El promedio es: = " + promedio);

        promedio = (i + j + k) / (3d * 10); //Primero suma luego suma y luego divide
        System.out.println("El promedio es: = " + promedio);

        promedio = (i + j + k) / 3d * 10; //Primero suma luego divide y el resultado lo multiplica
        System.out.println("El promedio es: = " + promedio);

        //Utilizando preIncremento y postDecremento
        promedio = ++i + j-- + k / 3d * 10; //Primero realiza la suma del pre y post luego suman con el resultado de k/3d y por ultimo lo multiplica por 10
        System.out.println("El promedio es: = " + promedio);
        System.out.println("i = " + i);
        //Despues se decrementa en la otra instruccion
        System.out.println("j = " + j);

        promedio = --i + j++ + k / 3d * 10; //Primero realiza la suma del pre y post luego suman con el resultado de k/3d y por ultimo lo multiplica por 10
        System.out.println("El promedio es: = " + promedio);
        System.out.println("i = " + i);
        //Despues se incrementa en la otra instruccion
        System.out.println("j = " + j);
    }
}