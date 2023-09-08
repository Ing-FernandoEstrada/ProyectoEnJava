package Udemy.Variables;

public class ConversionDeTipos
{
    public static void main(String[] args)
    {
        //Se crea una variable de tipo String y esta se la convierte a un número entero
        String numeroStr = "50";
        //De esta manera se convierte a un numero entero
        int numero = Integer.parseInt(numeroStr);
        System.out.println("numero = " + numero);

        //Se crea una variable de tipo String y esta se la convierte a un double
        String realString = "5154.15e-3";
        double realDouble = Double.parseDouble(realString);
        System.out.println("real = " + realDouble);

        //Se crea una variable de tipo String y esta se la convierte a un booleano
        String boolString = "true";
        boolean boolBoolean = Boolean.parseBoolean(boolString);
        System.out.println("boolean = " + boolBoolean);

        //Se crea una variable de tipo String y esta se la convierte a un char
        String charString = "A";
        char charChar = charString.charAt(0);
        System.out.println("char = " + charChar);

        //En esos casos también se podria aplicar var

        //Coversiones de tipo primitivos a cadenas
        int otroNumeroInt = 100;
        System.out.println("Otro numero Int = " + otroNumeroInt);

        //Con la clase wraper permite convertir los números primitivos
        //Este lo convierte el numero entero a un String
        String otroNumeroStr = Integer.toString(otroNumeroInt);
        System.out.println("Otro numero String = " + otroNumeroStr);

        //Otra forma de convertir otro numero a String

        otroNumeroStr = String.valueOf(otroNumeroInt);
        System.out.println("Otro numero Str = " + otroNumeroStr);

        //De esta manera permite añadir una suma seguido del valor ya ingresado

        otroNumeroStr = String.valueOf(otroNumeroInt + 10);
        System.out.println("Otro numero Str = " + otroNumeroStr);

        //De esta manera concatena los valores donde no daria el resultado
        //artimetico bien
        otroNumeroStr = String.valueOf(otroNumeroStr + 10);
        System.out.println("Otro numero Str = " + otroNumeroStr);

        //----Convertir un decimal a un String----
        double otroRealDouble = 1.23456;
        String otroRealStr = Double.toString(otroRealDouble);
        System.out.println("Otro real str = " + otroRealStr);

        //Conviritiendo con notación cientifica
        double otroRealDouble2 = 1.23456e2;
        String otroRealStr2 = Double.toString(otroRealDouble2);
        System.out.println("Otro real str = " + otroRealStr2);

        otroRealStr = String.valueOf(1.23456f);
        System.out.println("otro real str = " + otroRealStr);
    }
}
