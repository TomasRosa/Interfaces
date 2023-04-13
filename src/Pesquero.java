public class Pesquero implements Barco
{
    private String nombre;
    private int cantPescadores;
    private int potencia;

    public Pesquero ()
    {

    }
    public Pesquero (String nombre, int cantPescadores, int potencia)
    {
        this.nombre = nombre;
        this.cantPescadores = cantPescadores;
        this.potencia = potencia;
    }

    @Override
    public void mensajeSocorro()
    {
        System.out.println("AYUDAAAA SE NOS HUNDE LA MERCADERIA");
    }

    @Override
    public void alarma()
    {
        System.out.println("AAAAAAAAAAAAAAAAAAAA pesquero AAAAAAAAAAAAAAAAAAAAA");
    }
}
