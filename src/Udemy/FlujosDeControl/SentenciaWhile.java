package Udemy.FlujosDeControl;

public class SentenciaWhile
{
    public static void main(String[] args)
    {
        //Se empieza una iteración utilizando el cilo while
        System.out.println("Programa que permite realizar un ciclo de numeros utilizando while");
        int i = 0;
        while(i <= 5)
        {
            System.out.println("i = " + i);
            i++;
        }

        System.out.println("Programa para que cambie la variable a false cuando llega a 7. Solo iteera de 0 a 7");
        i = 0;
        boolean prueba = true;
        while(prueba)
        {
           if (i == 7)
           {
               prueba = false;
           }
           System.out.println("i = " + i);
           i++;
        }
        //Cuando el resultado es falso con la sentencia do while al menos se ejecuta una sola vez
        //Primera ejecuta y despues prueba
        prueba =  false;
        do
        {
            System.out.println("Al menos se ejecuta una sola vez");
        }while(prueba);

        System.out.println("Programa que evalua un codigo o numeración de 0 a 10");
        i = 0;
        prueba =  true;
        do
        {
            if(i == 10)
            {
                prueba = false;
            }
            System.out.println("i = " + i);
            i++;
        }while(prueba);
    }
}
