package Udemy.ClasesWrapper;
public class AutoboxingInteger
{
    public static void main(String[] args)
    {
        Integer[] enteros = {Integer.valueOf(1),2,3,4,5,6,7,8,9,10,11,12,13,14,15};

        int suma =  0;

        //Valores que se sumen del arreglo pero solo los números pares
        for(Integer i: enteros)
        {
            //De esta forma se identifica que es numero par
            if(i.intValue() % 2 == 0)
            {
                //Suma los valores pares
                suma += i.intValue();
            }
        }
        //Recorre el arreglo para sumar los numeros pares
        System.out.println("suma = " + suma);

        //Para que no lo tome el valor anterior se debe inicializar nuevamente el valor de la suma en cero
        suma = 0;

        //Se realiza el proceso para el unboxing
        for(Integer i: enteros)
        {
            //De esta forma se identifica que es numero par
            if(i % 2 == 0)
            {
                //Suma los valores pares
                suma += i;
            }
        }
        //Recorre el arreglo para sumar los numeros pares
        System.out.println("suma = " + suma);
    }
}