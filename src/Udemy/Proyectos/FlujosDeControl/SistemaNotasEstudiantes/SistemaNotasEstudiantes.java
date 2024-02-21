package Udemy.Proyectos.FlujosDeControl.SistemaNotasEstudiantes;

import javax.swing.*;

public class SistemaNotasEstudiantes
{
    public static void main(String[] args)
    {
        double nota;

        double sumaDeNotasTotal = 0, SumaNotasMayoresA5 = 0, SumaNotasMenoresA4 = 0;
        double promedioNotasMayoresA5, promedioNotasMenoresA4;
        int cantidadNotasMayoresA5 = 0, cantidadNotasMenoresA4 = 0, cantidadNotasDe1 = 0;

        int cantidadNotas = 20;

        for(int i = 0; i < cantidadNotas; i++)
        {
            boolean notaValida = false;
            do
            {
                nota = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la nota " + (i + 1) + ":"));

                if(nota >= 1 && nota <= 7)
                {
                    notaValida = true;
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Error: La nota debe estar entre 1 y 7. Vuelve a intentarlo.");
                }
            }while(!notaValida);

            if(nota == 1)
            {
                cantidadNotasDe1++;
            }
            else
            {
                if(nota > 5)
                {
                    cantidadNotasMayoresA5++;
                    SumaNotasMayoresA5 += nota;
                }
                else if(nota < 4)
                {
                    cantidadNotasMenoresA4++;
                    SumaNotasMenoresA4 += nota;
                }
            }
            sumaDeNotasTotal += nota;
        }

        //Se muestra la cantidad de notas que unicamente sean de 1
        JOptionPane.showMessageDialog(null, "El número de notas 1 es de : " + cantidadNotasDe1);

        //La cantidad de notas mayores a 5
        JOptionPane.showMessageDialog(null, "La cantidad de las notas mayores a 5 es de: " + cantidadNotasMayoresA5);

        //Se trabaja con las notas mayores a 5
        if(cantidadNotasMayoresA5 == 0)
        {
            JOptionPane.showMessageDialog(null, "No se puede calcular el promedio de notas sobre 5");
        }
        else
        {
           promedioNotasMayoresA5 = SumaNotasMayoresA5 / cantidadNotasMayoresA5;
            JOptionPane.showMessageDialog(null, "El promedio de notas mayores a 5 es: " + promedioNotasMayoresA5);
        }

        //Cantidad de notas menores a 4
        JOptionPane.showMessageDialog(null, "La cantidad de las notas menores a 4 es de: " + cantidadNotasMenoresA4);

        //Se trabaja con las notas menores a 4
        if(cantidadNotasMayoresA5 == 0)
        {
            JOptionPane.showMessageDialog(null, "No se puede calcular el promedio de notas menores de 4");
        }
        else
        {
            promedioNotasMenoresA4 = SumaNotasMenoresA4 / cantidadNotasMenoresA4;
            JOptionPane.showMessageDialog(null, "El promedio de notas menores a 4 es: " + promedioNotasMenoresA4);
        }

        //Promedio total de las notas
        double promedioTotalNotas = sumaDeNotasTotal/cantidadNotas;
        JOptionPane.showMessageDialog(null, "El promedio general de las notas es: " + promedioTotalNotas);
    }
}
