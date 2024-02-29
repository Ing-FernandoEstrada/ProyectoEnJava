package Udemy.Proyectos.FlujosDeControl.MenuDeOpciones;

import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;

public class MenuDeOpciones
{
    public static void main(String[] args)
    {

        int opcionIndice = 0;

        do
        {
            Map<String, Integer> opciones = new HashMap<>();

            opciones.put("Actualizar", 1);
            opciones.put("Eliminar", 2);
            opciones.put("Agregar", 3);
            opciones.put("Listar", 4);
            opciones.put("Salir", 5);

            Object[] opcionArreglo = opciones.keySet().toArray();

            Object opcion = JOptionPane.showInputDialog(null,
                    "Seleccione una Operación", "Mantenedor de Usuario", JOptionPane.INFORMATION_MESSAGE, null, opcionArreglo, opcionArreglo[0]);

            if (opcion == null)
            {
                JOptionPane.showMessageDialog(null, "Debe seleccionar una operación");
            }
            else
            {
                opcionIndice = opciones.get(opcion.toString());
            }

            switch (opcionIndice)
            {
                case 1:
                {
                    JOptionPane.showMessageDialog(null, "Usuario actualizado correctamente");
                    break;
                }
                case 2:
                {
                    JOptionPane.showMessageDialog(null, "Usuario eliminado correctamente");
                    break;
                }
                case 3:
                {
                    JOptionPane.showMessageDialog(null, "Usuario agregado correctamente");
                    break;
                }
                case 4:
                {
                    JOptionPane.showMessageDialog(null, "Listando a los usuarios");
                    break;
                }
                default:
                    break;
            }
        }
        while (opcionIndice != 5);
        JOptionPane.showMessageDialog(null, "Haz salido con exito!");
    }
}