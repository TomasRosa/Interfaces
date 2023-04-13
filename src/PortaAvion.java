public class PortaAvion implements Barco
{
    private int cantAviones;
    private int tripulacion;

    public PortaAvion ()
    {

    }
    public PortaAvion (int cantAviones, int tripulacion)
    {
        this.cantAviones = cantAviones;
        this.tripulacion = tripulacion;
    }

    @Override
    public void mensajeSocorro()
    {
        System.out.println("AYUDAAAAAAAAAAA SE NOS HUNDEN LOS AVIONES.");
    }

    @Override
    public void alarma()
    {
        System.out.println("AAAAAAAAAAAAAAAAAAAAAAAA portaavion AAAAAAAAAAAAAAAAA");
    }
}
