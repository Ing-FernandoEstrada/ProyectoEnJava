package Udemy.ValorVsReferencia;
public class PasarPorReferencia
{
    public static void main(String[] args)
    {
        //Toda variable primitiva se pasa por valor
        int[] edades = {10, 11, 12};

        System.out.println("Iniciamos el metodo main");

        for(int i = 0; i < edades.length; i++)
        {
            System.out.println("edades[i] = " + edades[i]);
        }
        System.out.println("Antes de llamar al metodo test");
        test(edades);
        System.out.println("Despues de llamar al metodo test");

        for(int i = 0; i < edades.length; i++)
        {
            System.out.println("edades[i] = " + edades[i]);
        }
        System.out.println("Finaliza el metodo main con los datos del arreglo modificados");
    }
    public static void test(int[] edadesArreglo)
    {
        System.out.println("Iniciamos el metodo test");
        for (int i = 0; i < edadesArreglo.length; i++)
        {
            edadesArreglo[i] = edadesArreglo[i] + 20;
        }
        System.out.println("Finaliza el meotdo test");
    }
}
