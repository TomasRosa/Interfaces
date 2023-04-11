import java.util.UUID;

public class Libro implements Presta
{
    private UUID codigo;
    private String titulo;
    private int añoPublicacion;
    private Boolean prestado = false;

    public Libro ()
    {
        this.codigo = UUID.randomUUID();
    }
    public Libro (String titulo, int añoPublicacion)
    {
        this.codigo = UUID.randomUUID();
        this.titulo = titulo;
        this.añoPublicacion = añoPublicacion;
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
        return "Libro{" +
                "codigo=" + codigo +
                ", titulo='" + titulo + '\'' +
                ", añoPublicacion=" + añoPublicacion +
                ", prestado=" + prestado +
                '}';
    }

    @Override
    public void prestar()
    {
        this.prestado = true;
        System.out.println("El libro ha sido prestado. ");
        System.out.println("Libro prestado: " + this.prestado);
    }

    @Override
    public void devolver()
    {
        if(this.prestado == true)
        {
            this.prestado = false;
            System.out.println("El libro ha sido devuelto.");
            System.out.println("Libro prestado: " + this.prestado);

        }
    }
}
