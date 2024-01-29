package Udemy.FlujosDeControl;

public class SentenciasBucleEtiquetas
{
    public static void main(String[] args)
    {
        //En este caso el 2 se sale del ciclo y solo imprime los demas numeros
        //Se esta creando una etiqueta al for que esta encerrando todo
        System.out.println("Imprime el i de 0 a 4 excluyendo el 2 y el j se imprime de 0 a 4 por cada uno de los recorridos que hace el i");
        bucle1:
        for(int i = 0; i < 5; i++)
        {
            System.out.println();
            for(int j = 0; j < 5; j++)
            {
                if(i == 2)
                {
                    continue bucle1;
                }
                System.out.println("[i = " + i + ", j = " + j + "], ");
            }
        }

        System.out.println("\nEn este caso solo imprime solo la primera parte del codigo");
        etiqueta:
        for(int i = 0; i < 5; i++)
        {
            System.out.println();
            for(int j = 0; j < 5; j++)
            {
                if(i == 2)
                {
                    break etiqueta;
                }
                System.out.println("[i = " + i + ", j = " + j + "], ");
            }
        }

        System.out.println("Iteraicón por cada dia de la semana y cada dia de la semana 8 horas de trabajo menos sabado y domingo");
        System.out.println("I = DIA, J = HORA");
        bucle:
        //Dias de la semana
        for(int i = 1; i <= 7; i++)
        {
            int j = 1;
            //Horas de trabajo al dia
            while (j <= 8)
            {
                //Sin contar sabado ni domingo
                if(i == 6 || i == 7)
                {
                    System.out.println("Dia  " + i + ": Descanso de fin de semana");
                    continue bucle;
                }
                System.out.println("Dia " + i + ", trabajando a las " + j + " horas. ");
                j++;
            }
        }
    }
}