import java.util.ArrayList;

public class ArrayReales implements Estadisticas
{
    ArrayList<Double> arregloDoubles;

    public ArrayReales()
    {
        this.arregloDoubles = new ArrayList<Double>();
    }
    public void cargarArrayListDoubles ()
    {
        this.arregloDoubles.add(5.25);
        this.arregloDoubles.add(1.25);
        this.arregloDoubles.add(2.25);
        this.arregloDoubles.add(3.25);
        this.arregloDoubles.add(4.25);
        this.arregloDoubles.add(1.00);
        this.arregloDoubles.add(0.80);
        this.arregloDoubles.add(12.20);
    }

    @Override
    public double minimo()
    {
        double minimo = this.arregloDoubles.get(0);

        for(int i = 0; i < this.arregloDoubles.size(); i++)
        {
            if(this.arregloDoubles.get(i) < minimo)
            {
                minimo = this.arregloDoubles.get(i);
            }
        }
        return minimo;
    }
    @Override
    public double maximo()
    {
        double maximo = this.arregloDoubles.get(0);

        for(int i = 0; i < this.arregloDoubles.size(); i++)
        {
            if(this.arregloDoubles.get(i) > maximo)
            {
                maximo = this.arregloDoubles.get(i);
            }
        }
        return maximo;
    }

    @Override
    public double sumatoria()
    {
        double suma = 0;

        for(int i = 0; i < this.arregloDoubles.size(); i++)
        {
            suma = suma + this.arregloDoubles.get(i);
        }

        return suma;
    }

}
