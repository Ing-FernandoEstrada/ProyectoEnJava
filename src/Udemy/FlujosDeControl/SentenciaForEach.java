package Udemy.FlujosDeControl;

public class SentenciaForEach
{
    public static void main(String[] args)
    {
        //Solo funciona para arreglos u objetos de colección de java
        int[] numeros= {1, 3, 5, 7, 9, 11, 13};
        for(int num: numeros)
        {
            System.out.println("num = " + num);
        }

        //Recorre el arreglo por cada variable
        String[] nombres = {"Andres", "Pepe", "Maria", "Paco", "Lalo", "Bea", "Pato", "Pepa"};
        for(String nombre: nombres)
        {
            System.out.println("nombre = " + nombre);
        }
    }
}
