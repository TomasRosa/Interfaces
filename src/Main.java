import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingresa que ejercicio desea ver.");
        int opcion = scan.nextInt();

        switch (opcion)
        {
            case 1:
            {
                ejercicio1();
                break;
            }
            case 2:
            {
                ejercicio2();
            }
        }
    }
    public static void ejercicio1 ()
    {
        ArrayReales arregloDeReales = new ArrayReales();

        arregloDeReales.cargarArrayListDoubles();

        double maximo = arregloDeReales.maximo();
        double minimo = arregloDeReales.minimo();
        double sumatoria = arregloDeReales.sumatoria();

        System.out.println("Minimo del arreglo: " + minimo);
        System.out.println("Maximo del arreglo: " + maximo);
        System.out.println("Sumatoria del arreglo: " + sumatoria);
    }
    public static void ejercicio2 ()
    {
        Matematica matematica = new Matematica();

        matematica.cargarArregloAutomatico();
        matematica.mostrarArreglo();

        double inicio = matematica.inicio();

        System.out.println("Num inicio: " + inicio);

        double fin = matematica.fin();

        System.out.println("Num final: " + fin);
    }
}