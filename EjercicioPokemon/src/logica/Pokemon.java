
package logica;

public abstract class Pokemon { //abstract para hacer la clase abstracta
    //ATRIBUTOS
    protected int numPokedex; //protected para que solo las hijos la utilicen
    protected String nombre;
    protected double peso;
    protected String sexo;
    protected int temporada;
    
    //declaracion de METODOS abstractos 
    //es abstracto porque no tiene implementacion
    protected  abstract void atacarPlacaje();
    protected  abstract void atacarAraniazo();
    protected  abstract void atacarMordisco();
    
    
}
