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
                break;
            }
            case 3:
            {
                ejercicio3();
                break;
            }
            case 4:
            {
                ejercicio4();
                break;
            }
            case 5:
            {
                ejercicio5();
                break;
            }
            case 6:
            {
                ejercicio6();
                break;
            }
            case 7:
            {
                ejercicio7();
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
    public static void ejercicio3 ()
    {
        Numero primerObjeto = new Numero(10);
        Numero segundoObjeto = new Numero(9);

        Boolean hola = primerObjeto.esIgual(segundoObjeto);
        Boolean hola2 = primerObjeto.esMayor(segundoObjeto);
        Boolean hola3 = primerObjeto.esMenor(segundoObjeto);

        System.out.println("Primer objeto es igual a segundo objeto ? " + hola);
        System.out.println("Primer objeto es mayor a segundo objeto ? " + hola2);
        System.out.println("Primer objeto es menor a segundo objeto ? " + hola3);
    }
    public static void ejercicio4 ()
    {
        Libro librito = new Libro("El ave Fenix",2012);
        Revista revistita = new Revista("Avon",2019);

        System.out.println("Metodos de librito: ");
        librito.toString();
        System.out.println("Año de publicacion de el libro: " + librito.getAñoPublicacion());
        System.out.println("Codigo del libro: " + librito.getCodigo());
        System.out.println("Prestar libro: ");
        librito.prestar();
        System.out.println("Devolver libro: ");
        librito.devolver();

        System.out.println("Metodos revista: ");
        revistita.toString();
        System.out.println("Año de publicacion de la revista: " + revistita.getAñoPublicacion());
        System.out.println("Codigo de la revista: " + revistita.getCodigo());

    }
    public static void ejercicio5 ()
    {
        Scanner scan = new Scanner(System.in);

        Pila pilita = new Pila();
        System.out.println("PROBANDO METODOS DE PILA");
        pilita.cargarPilaAutomaticamente();
        pilita.mostrar();

        System.out.println("Pila vacia? " + pilita.estaVacia());
        int tope = pilita.primero();
        System.out.println("Tope: " + tope);
        System.out.println("Pilita luego de tope: ");
        pilita.mostrar();

        int extraer = pilita.extraer();

        System.out.println("Pila luego de extraer: ");
        pilita.mostrar();

        System.out.println("Ingrese numero a añadir. ");
        int numero = scan.nextInt();
        pilita.añadir(numero);
        System.out.println("Pila con numero añadido: ");
        pilita.mostrar();
    }
    public static void ejercicio6 ()
    {
        PruebaPila prueba = new PruebaPila(); /// creo prueba pila q es donde tengo los metodos
        Pila miPila = new Pila(); ///creo una pila que es objeto de tipo coleccionInterfaz

        prueba.rellenar(miPila);
        System.out.println("Elementos de la pila: ");
        prueba.imprimirYVaciar(miPila);
        System.out.println("Pila luego de ser vaciada: ");
        miPila.mostrar();
    }
    public static void ejercicio7 ()
    {
        BarcoPasaje barcoPasaje = new BarcoPasaje(10);
        PortaAvion barcoAvion = new PortaAvion(12,120);
        Pesquero barcoPesquero = new Pesquero("Jenny",80,120);

        barcoPasaje.alarma();
        barcoPasaje.mensajeSocorro();
        System.out.println("*************************");
        barcoAvion.alarma();
        barcoAvion.mensajeSocorro();
        System.out.println("*************************");
        barcoPesquero.alarma();
        barcoPesquero.mensajeSocorro();
    }
}