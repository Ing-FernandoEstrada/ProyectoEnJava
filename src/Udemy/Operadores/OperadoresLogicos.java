package Udemy.Operadores;

public class OperadoresLogicos
{
    public static void main(String[] args)
    {
        //Se evalua la expresión and y or
        //Para la operacion and todo se deve cumplir para uqe sea verdadero
        //Para la operacion or al menos 1 se deve cumplir para que todo se cumpla

        int i = 3;
        byte j = 7;
        float k = 127e-7f;
        double l = 2.1412e3;
        boolean m = false;

        //-------OPERACION AND-----------

        //En este caso las dos se deben cumplir
        //Entonces seria falsa
        //En este caso hay 3 condiciones las cuales unicamente se cumplen 2 por tanto toda la expresión es falsa
        boolean b1 = i == j && k < l && m == true;
        System.out.println("b1 = " + b1);

        //En este caso toda la expresión seria verdadera
        boolean b2 = i == j && k < l && m == true;
        System.out.println("b1 = " + b2);

        //-------OPERACION OR-----------

        //En este caso al menos una se debe cumplir para que el resultado sea true
        //Pero si todas las expresiones son falsas o erroneas toda la expresion va a ser falsa
        boolean b3 = i == j || k > l;
        System.out.println("b3 = " + b3);

        //Las operaciones se realizan de izquierda a derecha
        //En este caso primero evalua el and el resultado de eso lo guardo y lo evalua con el or
        //Por tanto el resultado seria verdadero
        boolean b4 = i == j && k > l || m == false;
        System.out.println("b4 = " + b4);

        //Si cambiamos la presendencia funcionaria de esta manera
        //Primero se evalua lo que esta por fuera de los parentesis y por ultimo de lo que etsa dentro
        //En este caso el resultado seria falso
        boolean b5 = i == j && (k > l || m == false);
        System.out.println("b4 = " + b5);

        //En este caso primero ser evalua ño que esta en el lado izquierdo osea lo de los parentesis
        //El resultadop seria verdadero
        boolean b6 = (i == j && k > l) || m == false;
        System.out.println("b4 = " + b6);
        
        //mas precedencia tiene el operador and que el or
        //en estos casos entonces primero realzaria lo que esta a la derecha osea el and
        //en este caso el resultado seria true
        boolean b7 = i == j || k < l && m == true;
        System.out.println("b7 = " + b7);

        //pero si se utiliza parentesis cambiaria la precedencia
        //en este caso el resulado seria true
        boolean b8 = (i == j || k < l) && m == true;
        System.out.println("b7 = " + b8);

        //En este caso se realiza lo mismo de forma explicita
        boolean b9 = true || true && false;
        System.out.println("b9 = " + b9);

        //Y si se cmabia la precedencia el reusltado seria false
        boolean b10 = (true || true) && false;
        System.out.println("b9 = " + b10);

        //otro ejemplo de forma explicita
        boolean b11 = ((true || false) && false) || false; //En este caso seria false pero no funciona asi
        //quien tiene mayor precedencia es el and por tanto primero se debe realizar el and
        boolean b12 = true || (false && false) || false; //true
        System.out.println("b11 = " + b11);
        System.out.println("b12 = " + b12);
    }
}
