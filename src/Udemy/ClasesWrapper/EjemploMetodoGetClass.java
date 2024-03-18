package Udemy.ClasesWrapper;

import java.lang.reflect.Method;

public class EjemploMetodoGetClass
{
    public static void main(String[] args)
    {
        String texto = "Hola que tal";
        //Este metodo retorna una instancia de la clase class
        Class strClass = texto.getClass();

        //Este metodo muestra el nombre completo de la clase
        System.out.println("strClass = " + strClass.getName());
        //Este metodo muestra unicmente el nombre
        System.out.println("strClass = " + strClass.getSimpleName());
        //En este caso retorna el Package del nombre
        System.out.println("strClass = " + strClass.getPackageName());
        //Imprime el objeto completo de la clase class
        System.out.println("strClass = " + strClass);

        //Podemos mostrar metodos atreibutos y demas utilizando un foreach
        for(Method metodo: strClass.getMethods())
        {
            //Imprimimos el nombre del metodo
            //va a listar todos los metodos de la clase String
            System.out.println("metodo.getName() = " + metodo.getName());
        }

        Integer num = 34;
        Class intClass = num.getClass();
        Class objClass = intClass.getSuperclass().getSuperclass();

        System.out.println("intClass = " + intClass.getSimpleName());
        System.out.println("intClass = " + intClass.getPackage());
        System.out.println("intClass = " + intClass.getName());

        //Este metodo retorne la clase padre del integer
        System.out.println("intClass = " + intClass.getSuperclass());
        System.out.println("intClass = " + objClass);
        
        //Todos los metodos de la clase object
        for(Method metodo: objClass.getMethods())
        {
            System.out.println("metodo.getName() = " + metodo.getName());
        }
    }
}
