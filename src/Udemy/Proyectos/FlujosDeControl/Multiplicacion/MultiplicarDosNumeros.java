package Udemy.Proyectos.FlujosDeControl.Multiplicacion;

import javax.swing.*;
import java.util.Scanner;

public class MultiplicarDosNumeros
{
    public static void main(String[] args)
    {

        int num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el primer número"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el segundo numero"));

        int resultado = 0;

        int valorAbsolutoA = Math.abs(num1);

        //Se suma tantas veces el valor del num2, segun el valor del num1
        for(int i = 0; i < valorAbsolutoA; i++ )
        {
            resultado += num2;
        }

        //Si ambos son negativos o si solo uno es negativo se invierte el signo
        if(num1 * num2 < 0)
        {
            resultado = - resultado;
        }

        JOptionPane.showMessageDialog(null, "El resultado es: " + resultado);
    }
}
