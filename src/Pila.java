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
        return this.pila.size() == 0;
    }

    @Override
    public int extraer()
    {
        int ultimo = 0;
        if (!estaVacia())
        {
            ultimo = this.pila.get(this.pila.size() - 1);
            this.pila.remove(this.pila.size() - 1);
        } else
        {
            System.out.println("No se puede extraer un elemento de una pila vacia.");
        }
        return ultimo;

    }
    @Override
    public int primero()
    {
        int ultimo = 0;
        if (!estaVacia()) {
            ultimo = this.pila.get(this.pila.size() - 1);
        } else {
            System.out.println("No se puede obtener el primer elemento de una pila vacía.");
        }
        return ultimo;
    }

    @Override
    public void añadir(int numero)
    {
        this.pila.add(numero);
    }
    public void mostrar ()
    {
        for(int i = 0; i < this.pila.size(); i++)
        {
            System.out.println(this.pila.get(i));

        }
    }
}
