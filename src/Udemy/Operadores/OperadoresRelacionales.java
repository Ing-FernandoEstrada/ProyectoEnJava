package Udemy.Operadores;

public class OperadoresRelacionales
{
    public static void main(String[] args)
    {
        int i = 3;
        System.out.println("i = " + i);
        byte j = 7;
        System.out.println("j = " + j);
        //Para identificar que el valor es de tipo float se debe poner la letra f
        float k = 127e-7f;
        System.out.println("k = " + k);
        double l = 2.14e3;
        System.out.println("l = " + l);
        boolean m = false;
        System.out.println("m = " + m);

        //Operacion de igualdad

        //EL operador de igualdad se escribe ==
        //Este tipo de operadores se utiliza en tipo de datos primitivos
         boolean b1 = i == j;
        System.out.println("Valor igual = " + b1);

        //Con este operador invierte el valor booleano
        boolean b2 = !b1;
        System.out.println("Valor invertido = " + b2);

        //Pata saber el operador distinto
        boolean b3 = i != j;
        System.out.println("Valor distinto = " + b3);

        //Comparar boolenos
        boolean b4 = m == true;
        System.out.println("Compara el valor booleano = " + b4);

        //Para ver si el valor boleano es diferente
        boolean b5 = m != true;
        System.out.println("El valor es diferente = " + b5);

        //Operador mayor y menor

        boolean b6 = i > j;
        System.out.println(" i es mayor que j ? " + b6);

        boolean b7 = i < j;
        System.out.println("i es menor que j ? = " + b7);

        boolean b8 = j < i;
        System.out.println("J es menor que i ? = " + b8);
        
        //Operador mayor igual y menor igual
        
        boolean b9 = l >= k;
        System.out.println("l es mayor igual que k = " + b9);
        
        boolean b10 = l <= k;
        System.out.println("l  es menor o igual que k ? = " + b10);
        
        boolean b11 = k <= l;
        System.out.println("k es menor o igual que l ? = " + b11);
    }
}
