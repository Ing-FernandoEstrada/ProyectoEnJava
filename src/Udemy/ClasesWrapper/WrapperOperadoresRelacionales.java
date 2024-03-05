package Udemy.ClasesWrapper;
public class WrapperOperadoresRelacionales
{
    public static void main(String[] args)
    {
        //Todo el proceso aplica para números mayores o iguales a 128
        //Si el valor es 127 o menor compara por valor y no por instancia
        //Si es mayor compara por el objeto
        //Son objetos que contienen un valor
        //Forma explicita
        Integer num1 = Integer.valueOf(1000);
        //Forma Implicita
        Integer num2 = num1;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        //Pregunta para ver si son iguales
        System.out.println("Son el mimso objeto ? " + (num1 == num2));

        num2 = 1000;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        //Igualmente pregunta si son iguales pero son de diferente objeto
        System.out.println("Son el mimso objeto ? " + (num1 == num2));

        //Para comparar el valor se utiliza el meotodo equals
        System.out.println("Tienen el mismo valor ? " + (num1.equals(num2)));
        //Otra forma de comparar el valor
        System.out.println("Tienen el mismo valor ? " + (num1.intValue() == num2.intValue()));

        //Se cambia la istancia para num2
        num2 = 2000;

        //Ambos son iguales por valor pero no por instancia por tanto el resultado seria false
        boolean condicion =  num1 > num2;
        System.out.println("Condicion = " + condicion);

        boolean condicion2 =  num1.intValue() > num2.intValue();
        System.out.println("Condicion2 = " + condicion2);
    }
}
