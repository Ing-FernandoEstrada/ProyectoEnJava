package Udemy.ClasesWrapper;
public class WrapperBoolean
{
    public static void main(String[] args)
    {
        //Esta es la forma implicita de declarar variables
        Integer num1, num2;
        num1 = 1;
        num2 = 2;

        boolean prinBoolean = num1 > num2; //false

        //Declaro variable de referencia
        Boolean objBoolean = Boolean.valueOf(prinBoolean);

        //Una nueva instancia apartir de un String
        Boolean objBoolean2 = Boolean.valueOf("false");

        Boolean objBoolean3 = true;


        System.out.println("prinBoolean = " + prinBoolean);
        System.out.println("objBoolean = " + objBoolean);
        System.out.println("objBoolean2 = " + objBoolean2);

        //Para crear este resultado no se comporta igual que los enteros u otro tipo de datos
        //En este caso compara por el valor
        System.out.println("Comparando dos objetos boolean: " + (objBoolean == objBoolean2));
        System.out.println("Comparando dos objetos boolean: " + (objBoolean.equals(objBoolean2)));
        System.out.println("Comparando dos objetos boolean: " + (objBoolean2 == objBoolean3));
        System.out.println("Comparando dos objetos boolean: " + (objBoolean == objBoolean3));

        //Converir un primitivo a un tipo de referencia
        boolean prinBoolean2 = objBoolean2.booleanValue();
        System.out.println("prinBoolean2 = " + prinBoolean2);
    }
}
