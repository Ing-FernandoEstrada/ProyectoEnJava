package Udemy.TipoStringCadenas;

public class Introduccion
{
  public static void main(String[] args) 
  {
    String str1 = "Hola Fernando";
    String str2 = new String("Hola Fernando");

    //Se utiliza para chequear si son el mimso objeto
    //Con el operador de igualdad compara por referencia (==)
    System.out.println("Son el mismo objeto? " + (str1 == str2));
    //Se utiliza para chequear si tiene el mismo valor
    //con el operador equals() compara por valor
    System.out.println("Son el mismo objeto? " + str1.equals(str2));


    //Metodos para trabajar con clase string
    
    /* 
    *int length(): Numero de caracteres
    *boolean equals(String b): Compara si ambas son iguales por valor
    *boolean equalsIgnoreCase(String b): Compara si ambas son iguales,
    independientemente de mayusculas o minusculas
    *int compareTo(String b): Compara contra la cadena del argumento,
    devolviendo:
    - un valor negativo si la cadena es anterior a b
    - cero(0) si la cadena es igual a b
    - un valor positivo si la cadena es posterior a b
    *String trim() crea un nuevo objeto eliminado el espacio en blanco que
    pudiera haber al principio o al final
    *char charAt(int posicion): Extrae un caracter en la posicion indicada
    *char[] toCharArray(): Convierte la cadena en un arreglo de caracteres
    *String subString(int a, int b): Extrae la sub-cadena entre las posciones a y b
    *String subString(int desde): Extrae la sub-cadena desde la posicion indicada
    *int indexOf(String cadena): Indican en que posicion se encuentra el caracter (o
    cadena) indicando por primera vez, buscando desde el principio
    *int lastIndexOf(String cadena) indica en que posicion se encuentra el caracter
    (o cadena) indicado por primera vez, buscando desde el final
    *boolean startsWith(String prefijo): dice si la cadena comienza con el prefijo indicado
    *boolean endsWith(String sufijo): Dice si la cadena termina con el sufijo indicado
    *String[] split(String patron): Divide la cadena en varias subcadenas utilizando
    el patron indicado como separador
    */

    
  }  
}
