package Udemy.Variables;

public class ReglasEnTipos
{
    public static void main(String[] args)
    {
        int numero = 20;
        //Tipos de datos de tipo String
        String nombre;
        nombre = "Edgar";

        //Si no cumple la condición no se ejecutara el If
        if(numero>10)
        {
            nombre = "Fernando";
        }
        System.out.println("nombre = " + nombre);

        //No se permiten utilizar palabras reservadas para declarar variables
        //int class = 5;
        //int public = 5;
        //int void = 5; Entre otras

        //Para declarar una variable siempre se debe comenzar con una letra
        int c45nh = 5;
        int _c45nh = 5;
        int $c45nh = 5;
        //Cualquier variable empieza con minuscula
        int edadPersona = 5;

        //Para comentar un bloque completo de codigo se utiliza
            /*
                if(numero>10)
                {
                    nombre = "Fernando";
                }
                System.out.println("nombre = " + nombre);
            */

        //Se remomienda no utilizar tildes ni ñ para declarar una variable, metodos, clases

        //int niña = 20;


    }
}
