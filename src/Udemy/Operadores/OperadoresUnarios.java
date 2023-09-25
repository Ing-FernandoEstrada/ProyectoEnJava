package Udemy.Operadores;

public class OperadoresUnarios {
    public static void main(String[] args) {
        //Existen dos operadores unarios con el + y con el -
        //En este caso se aplica la ley de signos

        int i = -5;
        int j = +i; // j = (1)*i -> -5
        System.out.println("j = " + j);

        int k = -i; //k = (-1)*i -> 5
        System.out.println("k = " + k);

        i = 6;
        j = +i;
        System.out.println("j = " + j);

        k = -i;
        System.out.println("k = " + k);
    }
}

