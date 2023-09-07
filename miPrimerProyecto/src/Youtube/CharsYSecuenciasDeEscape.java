package Youtube;
public class CharsYSecuenciasDeEscape
{
    public static void main(String[] args)
    {
        //Solo se puede asignar un caracter en particular
        char  caracter;
        //Para declarar inicializar la variable de tipo char unicamente acepta comillas simples
        caracter = 'A';
        System.out.println(caracter);

        //Tambien se puede de esta manera
        //No es tan convencional
        Character car = new Character('B');
        System.out.println(car);

        //PrimitivosCaracteres de escape
        //\n salto de linea
        System.out.println("Curso de Java SE por Fernando");
        //Es para que fernando salga en pantalla
        System.out.println("Curso de Java SE por \n\"Fernando\"");

        char x;
        //No presenta metodos que se asocien a el

        Character y;
        //En cambio character si presenta metodos que se le asocien
    }
}