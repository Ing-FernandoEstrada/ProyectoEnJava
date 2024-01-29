package Udemy.FlujosDeControl;

import javax.swing.*;

public class SentenciaForArreglos
{
    public static void main(String[] args)
    {
         String[] nombres = {"Andres", "Pepe", "Maria", "Paco", "Lalo", "Bea", "Pato", "Pepa"};

         //Para iterar se utiliza un for
        //Para mejorar la practica es mejor que el conteo de los elementos se lo deje por fuera
        int count = nombres.length;
        for(int i = 0; i < count; i++)
        {
            //Si se quiere exceptuar dos nombres en especifico se realiza el siguiente procedimiento
            //El equalsIgnoreCase - Ignora mayusculas o minusculas como estan escritas en el arreglo
            //Tambien funciona utilizando el metodo Contains

            //Sentencia por la cual permite exceptuar nombres utilizando el metodo equalsIgnoreCase donde ignora mayusculas y minusculas
            if(nombres[i].equalsIgnoreCase("andres") || nombres[i].equalsIgnoreCase("pepa"))
            {
                //Permite continuar con el proceso exceptuando los dos nombres que se omitieron en el if
                continue;
            }

            /*//Sentencia que permite exceptuar los string sin importar como esten escritos si en mayusculas o minisculas
            if(nombres[i].toLowerCase().contains("ANDRES".toLowerCase()) || nombres[i].toLowerCase().contains("PEPA".toLowerCase()))
            {
                continue;
            }*/


            //Para ejecutar el arreglo se llama al objeto y la posición en la que se encuentra
            //Pero si se quiere darle una numeración de concatena la variable inicializada en el ciclo for
            System.out.println(i + ".- " + nombres[i]);
        }
        JOptionPane.showMessageDialog(null, "Función que permite ingresar un nombre y ver si existe en el arreglo");
        //Por medio de esta función permite buscar un nombre
        String buscar = JOptionPane.showInputDialog("Ingrese un nombre, ejemplo \"Pepe\" o \"Maria\":");
        //JOptionPane.showMessageDialog(null, "Buscar es igual a: " + buscar);

        //La función permite identificar si se lo encontro o no a la persona
        boolean encontrado =  false;
        for (int i = 0; i < count; i++)
        {
            if(nombres[i].equalsIgnoreCase(buscar))
            {
                //Si se lo encuentra devuelve true de lo contrario false
                encontrado = true;
                break;
            }
        }
        //Lanza el mensaje si fue encontrado la persona o no
        if(encontrado)
        {
            JOptionPane.showMessageDialog(null, buscar + " fue encontrado");
        }else {
            JOptionPane.showMessageDialog(null, buscar + " no existe en el sistema");
        }
    }
}