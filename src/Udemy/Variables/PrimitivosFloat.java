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
    }
}
