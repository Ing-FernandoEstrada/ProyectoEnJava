package Udemy.FlujosDeControl;
public class SentenciasBucleEtiquetasBuscar
{
    public static void main(String[] args)
    {
        //La idea es buscar un caracter po algo dentro de una frase
        String frase = "trigotres tristes tigres tragan trigotrigo en un trigaltrigo";
        String palabra = "trigo";

        //la longitud total se calcula utilizando el metodo lenghth
        int maxPalabra = palabra.length();
        //En este caso buscaria hasta la ultima palabra incluyendo la letra t
        int maxFrase = frase.length() - maxPalabra;

        int cantidad = 0;
        char letra = 'g';

        buscar:
        //En este caso seria <= a la frase para que busque la ultima palabra repetida
        for (int i = 0; i <= maxFrase;)
        {
            //Se necesita otra variable distinta a la i para poder recorrrer caracter por caracter de forma independiente
            int k = i;
            for (int j = 0; j < maxPalabra; j++)
            {
                //Con el metodo busca el caracter que se encontro
                //Osea si es distinto al caracter t que permita continuar
                if(frase.charAt(k++) != palabra.charAt(j))
                {
                    i++;
                    continue buscar;
                }
            }
            cantidad++;
            i = i + maxPalabra;
        }
        System.out.println("Encontrado = " + cantidad + " veces la palabra '"+palabra+"' en la frase");
    }
}
