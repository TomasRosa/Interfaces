import java.util.ArrayList;
import java.util.Random;
public class Pila implements ColeccionInterfaz
{
    ArrayList<Integer> pila;
    int contadorObjetos = 0;

    public Pila ()
    {
        this.contadorObjetos++;
        this.pila = new ArrayList<Integer>();
    }
    public void cargarPilaAutomaticamente ()
    {
        Random random = new Random();
        for(int i = 0; i < 10; i++)
        {
            this.pila.add(random.nextInt(100)+1);
        }
    }

    @Override
    public boolean estaVacia()
    {
        if(this.pila.get(0) == null)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    @Override
    public int extraer()
    {
        int ultimo = 99999;

        if(estaVacia() == false)
        {
            for(int i = 0; i < this.pila.size(); i++)
            {
                ultimo = this.pila.get(i);
            }
            this.pila.remove(ultimo);

        }
        else
        {
            System.out.println("No se puede extraer un elemento de una pila vacia.");
        }

        return ultimo;
    }

    @Override
    public int primero()
    {
        int ultimo = 999999;
        if(estaVacia() == false)
        {
            for(int i = 0; i < this.pila.size(); i++)
            {
               ultimo = this.pila.get(i);
            }
        }
        else
        {
            System.out.println("No se puede extraer un elemento de una pila vacia.");
        }
        return ultimo;
    }
    @Override
    public void añadir(int numero)
    {
        this.pila.add(numero);
    }
}
