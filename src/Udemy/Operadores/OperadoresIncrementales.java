package Udemy.Operadores;

public class OperadoresIncrementales
{
    public static void main(String[] args)
    {
        //Pre incremento
        int i = 1;
        //Con esta forma permite incrementar el valor de uno en uno
        int j = ++i; // i = i + 1;

        //En este caso va a cambiar el valor para i y para j
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        //Post incremento

        //En el pre incremento el valor va despues de la variable en el post antes de la variable
        //primero se asigna a la variable y despues se incrementar el valor
        i = 2;
        System.out.println("Inicial de i = " + i);
        j = i++; //con post siempre se incrementa la variable
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        //Pre decremento

        i = 3;
        j = --i; //con esto se decrementa el valor de i

        //En este caso el valor incial es 3 - 1 = 2 y ese valor se asigna a la variable J
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        //Post decremento

        i = 4;
        //valor inical de de i
        System.out.println("i = " + i);
        j = i--;
        //Este seria el nuevo valor de i
        System.out.println("i = " + i);
        //J mantiene en 4
        System.out.println("j = " + j);

        //En este caso se concatenara Strings

        //En este caso se incrementa en 1 el valor de J
        System.out.println("(++j) = " + (++j));
        //En este caso se mantiene el valor de J porque primero se asigna y despues se incrementa
        System.out.println("(j++) = " + (j++));
        //Al final despues se incrementa si se vuleve a imprimir la variable
        System.out.println("Valor final de J para + = " + j);

        //En este caso como j vale 6 se decrementa 1
        System.out.println("(--j) = " + (--j));
        //En este caso se matiene el valor pero se decrementa
        System.out.println("(j--) = " + (j--));
        //Y para revisar el resultado se debe volver a llamar el valor de j
        System.out.println("Valor final de J para - = " + j);
    }
}
