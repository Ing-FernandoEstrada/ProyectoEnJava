package Udemy.ValorVsReferencia;
public class PasarPorValor
{
    public static void main(String[] args)
    {
        //Toda variable primitiva se pasa por valor
        int i = 10;
        System.out.println("Iniciamos el metodo main con i = " + i);
        test(i);
        System.out.println("Finaliza el metodo main con el valor de i (Se mantiene igual) " + i);
    }
    public static void test(int i)
    {
        System.out.println("Iniciamos el metodo test con i = " + i);
        //Se cambia el valor de i
        i = 35;
        System.out.println("Finaliza el meotdo test con i = " + i);
    }
}
