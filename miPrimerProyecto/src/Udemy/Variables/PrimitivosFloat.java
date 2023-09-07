package Udemy.Variables;

public class PrimitivosFloat
{

    public static void main(String[] args)
    {
        /*El tipo de dato float permite hasta 32 bites
        Como es flotante representa un decimal
        Si se coloca el numero con . cambia el tipo y saldra error y pasa a hacer double
        En esos casos unicamente se podria colocando la letra f al final ejemplo 1.0f*/
        float realFLoat = 2120f;
        //De esta manera permite escribirse el mismo número con notación cientifica
        float realFLoat2 = 2.12e3f;
        //Se multiplica 1.5 x 10 ^ 4
        float realFLoat3 = 1.5e4f;//15000f
        //Cuando son negativos el exponente se iria hacia la izquierda
        float realFLoat4 = 1.5e-10f;//0.00000000015f;
        float realFLoat5 = 0.00000000015f; //1.5e-10f;
        System.out.println("realFLoat = " + realFLoat);
        System.out.println("realFLoat2 = " + realFLoat2);
        System.out.println("realFLoat3 = " + realFLoat3);
        System.out.println("realFLoat4 = " + realFLoat4);
        System.out.println("realFLoat5 = " + realFLoat5);

        //Se realiza este proceso para saber cuantos bites cuenta el tipo de dato float
        System.out.println("Float corresponde en Byte a = " + Float.BYTES);
        System.out.println("Float corresponde en Bytes a = " + Float.SIZE);
        System.out.println("Maximo valor para float = " + Float.MAX_VALUE);
        System.out.println("Minimo valor valor para float = " + Float.MIN_VALUE);

        //Se realiza este proceso para saber cuantos bites cuenta el tipo de dato double

        double realDouble = 3.425656566516531163510238;
        System.out.println("realDouble = " + realDouble);
        System.out.println("Double corresponde en Byte a = " + Double.BYTES);
        System.out.println("Double corresponde en Bytes a = " + Double.SIZE);
        System.out.println("Maximo valor para double = " + Double.MAX_VALUE);
        System.out.println("Minimo valor valor para double = " + Double.MIN_VALUE);

        var varFlotante = 3.1416;//Tipo double
        System.out.println("varFlotante = " + varFlotante);
        var varFlotante2 = 3.1416f;//Tipo float
        System.out.println("varFlotante2 = " + varFlotante2);
        var varFlotante3 = 3;//Tipo int
        System.out.println("varFlotante3 = " + varFlotante3);
        var varFlotante4 = 3L;//Tipo long
        System.out.println("varFlotante4 = " + varFlotante4);

        //En este caso con el metodo main siempre se debe inizializar una variable

        float varFlotante5 = 3.1416f;
        System.out.println("varFlotante5 = " + varFlotante5);
    }
}
