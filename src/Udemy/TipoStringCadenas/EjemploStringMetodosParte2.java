package Udemy.TipoStringCadenas;

public class EjemploStringMetodosParte2
{
    public static void main(String[] args)
    {
        String trabalenguas = "trabalenguas";
        //Este metodo sirve para remplazar un caracter por otro
        System.out.println("trabalenguas = " + trabalenguas.replace("a", "."));
        //La instancia orginal no se cambia solo se cambia la que tenga el metodo replace
        System.out.println("trabalenguas = " + trabalenguas);
        //Este metodo permite saber si existe un caracter en el String y retorna la posicion
        System.out.println("trabalenguas.indexOf('a') = " + trabalenguas.indexOf('a'));
        //Este es para la ultima ocurrencia
        //Si no encuentra un caracter en alguno de ellos retorna un -1
        System.out.println("trabalenguas.lastIndexOf('a') = " + trabalenguas.lastIndexOf('a'));
        //este metodo recibe una secuencia de caracteres y retorna un true o false
        //retorna true
        System.out.println("trabalenguas = " + trabalenguas.contains("t"));
        //retorna false
        System.out.println("trabalenguas = " + trabalenguas.contains("z"));
        //Si comienza con y retorna ture o false
        //retorna false
        System.out.println("trabalenguas.startsWith(\"lenguas\") = " + trabalenguas.startsWith("lenguas"));
        //retorna true
        System.out.println("trabalenguas.startsWith(\"traba\") = " + trabalenguas.startsWith("traba"));
        //termina con y retorna true o false
        //retorna flase
        System.out.println("trabalenguas.endsWith(\"tr\") = " + trabalenguas.endsWith("tr"));
        //retorna true
        System.out.println("trabalenguas.endsWith(\"lenguas\") = " + trabalenguas.endsWith("lenguas"));
        //Ejemplo con espacios
        System.out.println("  trabalenguas ");
        //con este metodo elima los espacios
        //Elimina en ambos lados
        System.out.println("  trabalenguas ".trim());
    }
}
