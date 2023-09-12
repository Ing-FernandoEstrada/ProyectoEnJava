package Udemy.Proyectos;

import java.util.Scanner;

public class DetalleFacturaScanner
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre de la factura o descripción: ");
       //utiliza el metodo next line para obtener el nombre de la factura
       String nombre = scanner.nextLine(); 

       System.out.println("Ingrese el primer precio del producto: ");
       double precio1 = scanner.nextDouble();

       System.out.println("Ingrese el segundo precio del producto: ");
       double precio2 = scanner.nextDouble();
       
       //Realiza la sumatoria de los precios de los dos productos y aplica el 19%

       double totalPrecio = precio1 + precio2; 
       double impuesto = totalPrecio * 0.19;
       double totalNeto = totalPrecio + impuesto;
       
       //Imprime el detalle de la factura con el mensaje

       String detalle = "La factura " + nombre + " de la oficina " +
       " tiene un precio bruto de " + totalPrecio + ", con un impuesto de " + impuesto +
       " y el monto total después de impuesto es de " + totalNeto;

       System.out.println("Detalle de la factura: " + "\n" + detalle);

       System.out.println("MUCHAS GRACIAS POR SU COMPRA !!!");

    }
}