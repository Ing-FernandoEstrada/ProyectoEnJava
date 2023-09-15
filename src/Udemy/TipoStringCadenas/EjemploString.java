package Udemy.TipoStringCadenas;

public class EjemploString 
{
    public static void main(String[] args) 
    {
        //Esta es de forma implicita
        String curso = "Programación Java";
        //Esta es de forma explicita
        String curso2 = new String("Programación Java");
        
        //Estos dos son objetos totalmente distintos
        //Uno se utiliza para comparar objetos y el otro para comparar valores

        boolean esIgual = curso == curso2;
        System.out.println("curso == curso2 = " + esIgual);

        //Compara los dos valores y deduce si son iguales los caracteres incliuyendo mayusculas y minusculas
        //True si son igual
        //False si son diferentes
        esIgual = curso.equals(curso2);
        System.out.println("curso.equals(curso2) = " + esIgual);

        //Con el ignoreCase ignora mayusculas o minisculas que tenga el texto
        //true: si coincide el mensaje
        //false: si no coincide el mensaje
        esIgual = curso.equalsIgnoreCase(curso2);
        System.out.println("curso.equalsIgnoreCase(curso2) = " + esIgual);

        //Si se crean dos objetos del tipo String con el mismo mensaje el resultado va hacer verdadero
        //Mismo objeto que se guarda en distintas variables
        String curso3 = "Programación Java";
        esIgual = curso == curso3;
        System.out.println("curso == curso3 = " + esIgual);
        //Para comparar valores siempre se debe usar equals o equalsIgnoreCase
    }   
}
