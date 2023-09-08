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
    }
}
