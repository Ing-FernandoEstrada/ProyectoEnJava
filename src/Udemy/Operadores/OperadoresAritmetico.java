package Udemy.Operadores;

import javax.swing.*;

public class OperadoresAritmetico
{
    public static void main(String[] args)
    {
        int i = 5;
        int j = 4;
        //Para definir variables se puede de esta manera
        //int i = 5, j = 4;

        int suma = i + j;
        //int i = 5, j = 4, suma = i + j;
        System.out.println("suma = " + suma);
        //En este caso para que se conctanene el string y realice la suma se debera colocar los parentesis a la operacion aritmetica
        System.out.println("i + j = " + (i + j));

        int resta = i - j;
        System.out.println("resta = " + resta);
        //java no permite realizar esto porque saldrai error
        //System.out.println("i - j = " + i - j);
        //Para eso toca utilizar los parentesis
        System.out.println("(i - j) = " + (i - j));

        int multi = i * j;
        System.out.println("multi = " + multi);
        System.out.println("(i * j) = " + (i * j));
        
        int div = i / j;
        float div2 = i / j;
        System.out.println("division = " + div);
        //En este caso con el tipo de dato float el resultado seria 1.0
        //Para resolver esa situacion tocaria castear el valor de tipo flotante para que de el resultado exacto
        float div3 = (float) i / j;
        //Se puede castear uno y el resultado ya sale bien  o sino los dos
        float div4 = (float) i / (float) j;
        //En este caso se uso floato pero tambien se puede utilizar double
        double div5 = i / j;
        //En este caso pasa lo mismo por tanto tamnbien tocaria castear el valor
        double div6 = (double) i / j;
        System.out.println("div2 = " + div2);
        System.out.println("div3 = " + div3);
        System.out.println("div4 = " + div4);
        System.out.println("div5 = " + div5);
        System.out.println("div6 = " + div6);
        //como se esta manejando tipo de dato entero no nos arroja el decimal de la division
        System.out.println("(i / j) = " + (i / j));
        //Este es el ejemplo para realizar el proceso con una division con dos variables

        //En este caso se utilizara el operador resto
        //Para saber el resto de dos numeros se utiliza el simbolo %
        //En este caso se aplica la siguiente logica 5/4 = 4 cabe una sola vez en 5 sobra 1 porque 4 para llegar a 5 falta 1
        //8/5 cabe una sola vez el 5 y sobra 3
        
        int resto = i % j;
        System.out.println("resto = " + resto);
        int resto2 = 8 % 5;
        System.out.println("resto2 = " + resto2);

        //En este caso se utiliza JOptionPane para salicitar al usuario ingrese un numero
        //En este caso toca convertir el numero utilizando parseInt

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
        if(numero % 2 == 0)
        {
            System.out.println("Numero par = " + numero);
            JOptionPane.showMessageDialog(null, "Numero par = " + numero);
            main(args);
        }else {
            System.out.println("Numero impar = " + numero);
            JOptionPane.showMessageDialog(null, "Numero impar = " + numero);
            main(args);
        }
    }
}
