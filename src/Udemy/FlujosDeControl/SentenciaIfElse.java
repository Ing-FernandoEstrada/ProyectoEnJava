package Udemy.FlujosDeControl;

public class SentenciaIfElse
{
    public static void main(String[] args)
    {
        /*//Siempre debe tener parantesis el if
        if(expresion)
        {
            //Se delimita el alcance del if
        }else{
            //Si no se cumple ejecuta este bloque
            //Jamas se ejecuran de manera simultanea
        }*/

        //En este caso se realiza un ejemplo para un promedio de un estudiante
        //Cuando son pocas lineas no se puede utilizar {} pero es lo mas recomendable utilizarlas en todo momento
        float promedio = 5.8f;

        if(promedio >= 6.5){
            System.out.println("Felicitaciones excelente promedio");
        }else{
            System.out.println("Necesitas esforzarte un poco más");
        }

        //Se realiza el mismo ejemplo solo que es mas complejo utilizando la sentencia else if
        float promedio2 = 4.0f;

        if(promedio2 >= 6.5){
            System.out.println("Felicitaciones excelente promedio");
        }else if (promedio2 >= 6.0){
            System.out.println("Muy buen promedio");
        }else if (promedio2 >=5.5){
            System.out.println("Buen promedio");
        }else if (promedio2 >= 5.0)
        {
            System.out.println("Regular, necesitas esforzarte más");
        } else if (promedio2 >= 4.0) {
            System.out.println("Insuficiente, necesitas estudiar más");
        } else {
            System.out.println("Reprobado!");
        }
        System.out.println("Tu promedio es: " + promedio2);
    }
}
