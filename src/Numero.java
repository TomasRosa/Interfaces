public class Numero implements  Relaciones
{
    private int numero;
    public Numero ()
    {

    }
    public Numero (int numero)
    {
        this.numero = numero;
    }

    public int getNumero()
    {
        return numero;
    }

    public void setNumero(int numero)
    {
        this.numero = numero;
    }

    @Override
    public Boolean esMayor(Object b)
    {
        ///Suponiendo que A es el numero que yo tengo como atributo en esta clase.
        ///B es otra clase.
      if(b instanceof Numero)
      {
          if(this.numero > ((Numero) b).numero)
          {
              return true;
          }
          else
          {
              return false;
          }
      }
      else
        {
            return false;
        }
    }

    @Override
    public Boolean esMenor(Object b)
    {
      if(b instanceof Numero)
      {
          if(this.numero < ((Numero) b).numero)
          {
              return true;
          }
          else
          {
              return false;
          }
      }
      else
      {
          return false;
      }
    }

    @Override
    public Boolean esIgual(Object b)
    {
        if(b instanceof Numero)
        {
            if(this.numero == ((Numero) b).numero)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        else
        {
            return false;
        }
    }
}
