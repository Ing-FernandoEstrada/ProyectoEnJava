package Udemy.ClasesWrapper;
public class WrapperInteger
{
    public static void main(String[] args)
    {
        int intprimitivo = 32768;

        //Se debe colocar un objeto al tipo de dato
        //De esta manera se crea un objeto del tipo Integer
        //Toma un valor entero primitivo
        //Esta es la forma explicita
        Integer intObjeto = Integer.valueOf(intprimitivo);

        //Hay otra forma de como crear el objeto entero primitivo
        //Esta forma es implicita
        Integer intObjeto2 = intprimitivo;
        System.out.println("intObjeto = " + intObjeto);

        //Un objeto de tipo integer de referencia a un tipo integer
        int num = intObjeto;
        System.out.println("num = " + num);

        //Este metodo retorna el entero primitivo
        int num2 = intObjeto.intValue();
        System.out.println("num2 = " + num2);

        //Una forma de convertir de un string a un valor entero
        String valorTvLcd = "67000";
        Integer valor = Integer.valueOf(valorTvLcd);
        System.out.println("valor = " + valor);

        //Se realiza la prubea con un tipo de dato short
        //Este entero primitivo se con vierte a un shortValue
        //En este caso como es mayor al valor de tipo short va aver perdida de información y de datos
        //En este caso retornaria un valor muy ambiguo por tanto no retornaria el valor real
        Short shortObjeto = intObjeto.shortValue();
        System.out.println("shortObjeto = " + shortObjeto);

        Byte byteObjeto = intObjeto.byteValue();
        System.out.println("byteObjeto = " + byteObjeto);

        Long longObjeto = intObjeto.longValue();
        System.out.println("longObjeto = " + longObjeto);
    }
}
