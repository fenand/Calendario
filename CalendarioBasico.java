
public class CalendarioBasico
{

    private int dia ;
    private int mes;
    private int año;

    /**
     * Constructor de la  class CalendarioBasico
     */
    public CalendarioBasico()
    {
        dia = 1;
        mes = 1;
        año = 1;
    }

       /**
        * Fijar fecha
        */
       public void setFecha(int nuevoDia,int nuevoMes, int nuevoAño){
         dia = nuevoDia;
         mes = nuevoMes;
         año = nuevoAño;
        }
       
}
