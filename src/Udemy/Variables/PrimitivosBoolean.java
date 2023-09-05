package Udemy.Variables;

public class PrimitivosBoolean
{
    public static void main(String[] args)
    {
        boolean datoLogico = false;
        System.out.println("datoLogico = " + datoLogico);

        boolean datoLogico2 = true;
        System.out.println("datoLogico = " + datoLogico2);

        //EN este caso retorna una instancia de la clase Boolean
        //Este tipo de dato es de tipo primitivo
        //Esto regularmente no se coloca a la hora de asignarle el valor
        boolean datoBoolean = Boolean.TRUE;
        System.out.println("datoBoolean = " + datoBoolean);
        boolean datoBoolean2 = Boolean.FALSE;
        System.out.println("datoBoolean2 = " + datoBoolean2);

        //Simplemente se lo havce de esta manera
        //Cuando Boolean se escribe con mayuscula ya es de referencia no dato primitivo
        boolean dato = true;
        System.out.println("dato = " + dato);

        //Nos sirven para el flujo de control para envaluar una condicion

        double d = 988764.43e-3; //98.876443
        System.out.println("d = " + d);
        float f = 12345e2f; //123.45
        System.out.println("f = " + f);

        dato = d > f;
        System.out.println("dato = " + dato);

        dato = d < f;
        System.out.println("dato = " + dato);

        boolean esIgual = 3-2 == 1;
        System.out.println("esIgual = " + esIgual);

        boolean esIgual2 = 3-3 == 1;
        System.out.println("esIgual = " + esIgual2);
    }
}
