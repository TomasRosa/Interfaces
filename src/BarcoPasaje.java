import java.sql.SQLOutput;

public class BarcoPasaje implements Barco
{
    private int cantCamas;

    public BarcoPasaje()
    {

    }
    public BarcoPasaje(int cantCamas)
    {
        this.cantCamas = cantCamas;
    }

    @Override
    public void mensajeSocorro()
    {
        System.out.println("AYUDAAA SE NOS HUNDEN LAS PERSONAS");
    }

    @Override
    public void alarma()
    {
        System.out.println("AAAAAAAAAAAAAAAAAAAAAA barcopasaej AAAAAAAAAAAA");
    }
}
