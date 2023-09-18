package Udemy.TipoStringCadenas;

public class EjemploStringMetodosArreglos
{
    public static void main(String[] args)
    {
        String trabalenguas = "trabalenguas";
        //Se convierte el String en un arreglo de caracteres
        System.out.println("trabalenguas = " + trabalenguas.toCharArray());
        //Se crea un areglo de elementos de tipo char
        //retorna un arreglo de tipo char
        char[] arreglo = trabalenguas.toCharArray();
        //Se obtiene el largo de el arreglo con la variable de tipo entero
        //El length en un arreglo es un atriobuto no un metodo
        int largo = arreglo.length;
        System.out.println("largo = " + largo);
        for (int i=0; i<largo; i++)
        {
            //EN este caso imrprime normal el texto
            //System.out.print(arreglo[i]);
            //En este caso imprime de forma vertical
            System.out.println(arreglo[i]);
        }
        System.out.println();

        //se convierte segun un parametro o expresion regular
        //con este metodo imrpime el metodo exluyendo el caracter que se envie como parametro
        System.out.println("trabalenguas = " + trabalenguas.split("a"));
        //Si se imprime muestra el hash dek objeto+

        //String porque un elemento puede tener mas de un elemento
        String[] arreglo2 = trabalenguas.split("a");
        int largo2 = arreglo2.length;
        for (int j=0; j<largo2; j++)
        {
            System.out.println(arreglo2[j]);
        }

        String archivo = "alguna.imagen.pdf";
        //con doble \\ se indica que es el caracter .
        //EL . normalmente es una expresion regular
        String[] arreglo3 = archivo.split("[.]"); //\\.
        int largo3 = arreglo3.length;
        System.out.println("largo3 = " + largo3);
        for (int j=0; j<largo3; j++)
        {
            System.out.println(arreglo3[j]);
        }
        //De esta manera se obtiene la extension
        System.out.println("Extension = " + arreglo3[largo3-1]);
    }
}
