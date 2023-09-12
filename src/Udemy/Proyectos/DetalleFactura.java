package Udemy.Proyectos;

import javax.swing.*;

public class DetalleFactura
{
    public static void main(String[] args)
    {
        String textoStr = JOptionPane.showInputDialog(null, "Ingrese el nombre de la factura o descripción: ");
        double precio1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el primer precio del producto: "));
        double precio2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el segundo precio del producto: "));

        //Realiza la sumatoria de los precios de los dos productos y aplica el 19%

        double precioTotal = precio1 + precio2;
        double impuesto = precioTotal * 0.19;
        double totalNeto = precioTotal + impuesto;

        String detalle = "La factura " + textoStr + " de la oficina " +
                " tiene un precio bruto de " + precioTotal + ", con un impuesto de " + impuesto +
                " y el monto total después de impuesto es de " + totalNeto;

        //Imprime el resultado en una ventana de mensaje
        JOptionPane.showMessageDialog(null, "El detalle de la factura es: " + "\n" + detalle);
        JOptionPane.showMessageDialog(null, "Gracias por su compra!!");
    }
}
