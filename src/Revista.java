import java.util.UUID;
import java.util.Random;
public class Revista
{
    private UUID codigo;
    private String titulo;
    private int añoPublicacion;
    private int numero;

    public Revista ()
    {

    }
    public Revista (String titulo, int añoPublicacion)
    {
        Random random = new Random();

        this.codigo = UUID.randomUUID();
        this.titulo = titulo;
        this.añoPublicacion = añoPublicacion;
        this.numero = random.nextInt(100)+1;
    }

    public UUID getCodigo()
    {
        return codigo;
    }

    public int getAñoPublicacion()
    {
        return añoPublicacion;
    }

    @Override
    public String toString()
    {
        return "Revista{" +
                "codigo=" + codigo +
                ", titulo='" + titulo + '\'' +
                ", añoPublicacion=" + añoPublicacion +
                ", numero=" + numero +
                '}';
    }

}
