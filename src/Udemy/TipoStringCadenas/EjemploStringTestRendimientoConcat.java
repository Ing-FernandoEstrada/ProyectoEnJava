package Udemy.TipoStringCadenas;
public class EjemploStringTestRendimientoConcat
{
    public static void main(String[] args) 
    {
        String a = "a";
        String b = "b";
        String c = a;

        //En este caso se calcula el tiempo inicial para ver cuanto se demora
        //Este metodo retorna el tiempo actual en milisegundos
        //Se concatena con StringBuilder

        StringBuilder sb = new StringBuilder(a);

        long inicio = System.currentTimeMillis();

        //por medio de un for se repite varias veces un proceso de concatenación
        for (int i=0; i < 100000; i++)
        {
          //con pocos o muchos Strings es mas rapido trabajar con StringBuilder
            //Se concatena a con b y con un salto de linea
            c = c.concat(a).concat(b).concat("\n"); //500 => 2 milisegundo, 1000 => 4 ms, 10000 => 105 ms, 100000 => 5071 ms
            c += a + b + "\n"; // 500 => 19 milisegundos, 1000 => 21 ms, 10000 => 68 ms, 100000 => 1976 ms
            //utilizando append se concatena
            sb.append(a).append(b).append("\n"); //StingBuilder es mucho mas rapido para concatenar de manera masiva
            //500 => 0 miloisegundos, 1000 => 0 ms, 10000 => 2ms, 100000 => 8 ms
        }

        long fin = System.currentTimeMillis();
        //En este caso se restaria el ultimo tiempo en milisegundos y el primer
        System.out.println(fin - inicio);
        //Esto es para saber cuanto se demora con 500 iteraciones
        System.out.println("c = " + c);
        //toString para que genere el String completo
        System.out.println("sb = " + sb.toString());
    }   
}
