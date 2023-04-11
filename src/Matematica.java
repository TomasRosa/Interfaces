import java.util.ArrayList;

public class Matematica implements  Extremos
{
    ArrayList<Double> arregloMatematica;
    int longitud = 10;

    public Matematica()
    {
        this.arregloMatematica = new ArrayList<Double>();
    }

    public void cargarArregloAutomatico ()
    {
        for(int i = 0; i < this.longitud; i++)
        {
            this.arregloMatematica.add(Math.random());
        }
    }
    public void mostrarArreglo ()
    {
        for(int i = 0; i < this.arregloMatematica.size(); i++)
        {
            System.out.println(this.arregloMatematica.get(i));
        }
    }
    @Override
    public double inicio()
    {
        return this.arregloMatematica.get(0);
    }

    @Override
    public double fin()
    {
        double ultimo = 9999;

        for(int i = 0; i < this.arregloMatematica.size(); i++)
        {
            ultimo = this.arregloMatematica.get(i);
        }

        return ultimo;
    }
}
