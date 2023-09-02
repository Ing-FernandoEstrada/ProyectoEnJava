public class Strings {
    public static void main(String[] args) {
        //Los valores de tipo cadena son amplicamente utilizandos
        String texto1 = "Fernando";
        String texto2 = "Estrada";

        //Espera un index - y se escribe el número en la posición en el que se encuentra la inicialización de la variable
        //Los valores de tipo cadena son amplicamente utilizandos
        // Espera un index - y se escribe el número en la posición en el que se encuentra la inicialización de la variable
        char captura = texto1.charAt(0);
        System.out.println(captura);
        char captura2 = texto1.charAt(1);
        System.out.println(captura2);

        //Va a comprar 2 variables de cadena y determina si son son exactamente iguales
        int resultado = texto1.compareTo(texto2);
        System.out.println(resultado);

        //Ejemplo con cadenas iguales
        String texto3 = "Fernando";
        String texto4 = "Fernando";
        int resultado2 = texto3.compareTo(texto4);
        System.out.println(resultado2);
        //En este caso como las dos cadenas son iguales nos devuelve un cero

        //En este caso se tiene en cuenta las dos cadenas pero una de llasa esta en minusculas pero con el metodo no importa
        //que si esta en minuscula o mayuscula devuelve 0
        String texto5 = "fernando";
        int resultado3 = texto3.compareToIgnoreCase(texto5);
        System.out.println(resultado3);

        //Con el metodo concat concatena las cos cadenas y nos da como resultado a union de las dos cadenas
        String concatenado = texto4.concat(texto5);
        System.out.println(concatenado);

        //Para determinar si tiene un caracter en particular
        boolean resultado4 = texto4.contains("a");
        System.out.println(resultado4);

        //IndexOF nos muestra la primera coincidencia con la letra escrita
        int resultado5 = texto4.indexOf("e");
        System.out.println(resultado5);

        //Este metodo presenta dos variantes el principal uso de esta funcion
        //es extraer texto de una cadena

        String recorte = texto4.substring(1);
        System.out.println(recorte);
        //Este motodo recorta desde la posición en la que se le indique

        //De esta manera recorta desde la psocion A hasta la posicion B
        String recorte2 = texto4.substring(1, 4);
        System.out.println(recorte2);

        //Determina la cantidad de letras que tiene la cadena
        int resultado6 = texto4.length();
        System.out.println(resultado6);
    }
}