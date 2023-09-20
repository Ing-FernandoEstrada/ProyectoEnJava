package Udemy.Operadores;

public class OperadoresAsignacion
{
    public static void main(String[] args)
    {
        //El operador de asignacion en este
        int i = 5;
        int j = i + 4;
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        //Operadores cobinados
        //Tambien funcionaria de esta manera
        i += 2; //i = i +2;
        System.out.println("i = " + i); //En este caso el resultado srria 7

        i += 5; //En este caso el resultado seria 12 porque el valor anteroor de i es 7
        System.out.println("i = " + i);

        i += 5;
        System.out.println("i = " + i); //En este caso el resultado seria 17 porque i anteriormente valia 12
        //SI se realiza el mismo procedimiento toma el valor de i anterior y lo sumna con la operacion  que se le asigne

        //Ahora se realiza el proceso con j con resta
        j -= 4; // j = j - 4
        System.out.println("j = " + j); //El resultado seria 5 porque 9-4 = 5 y 9 porque era el primer valor de j

        //Esto para multiplicacion
        j *= 3; // j = j * 3
        System.out.println("j = " + j); //En este caso el resultado seria 5 porque porque el valor anterior de j era 5 y 5*3 = 15

        //Se aplica una concatenacipon compuesta
        //Este ejemplo se realiza con un string con la consulta concatenada
        String sqlString = "select * from clientes as c";
        sqlString += " where c.nombre='Andres' ";
        sqlString += " and c.activo=1";
        System.out.println("sqlString = " + sqlString);
    }
}
