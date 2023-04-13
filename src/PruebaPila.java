public class PruebaPila implements PruebaPilaInterfaz
{
    public PruebaPila ()
    {

    }
    @Override
    public void rellenar(ColeccionInterfaz pila)
    {
        for(int i = 1; i <= 10; i++)
        {
            pila.añadir(i);
        }
    }

    @Override
    public void imprimirYVaciar(ColeccionInterfaz pila)
    {
        int basura;

        while(pila.estaVacia() == false)
        {
            basura = pila.extraer();
            System.out.println(basura);
        }
        if(pila.estaVacia() == true)
        {
            System.out.println("Se extrajeron todos los elementos, quedo vacia.");
        }
    }
}
