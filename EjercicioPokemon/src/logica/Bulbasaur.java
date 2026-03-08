
package logica;

public class Bulbasaur extends Pokemon implements IPlanta {

    public Bulbasaur() {
    }

    
    @Override
    protected void atacarPlacaje() {
        System.out.println("soy Bulbasaur este es mi acataque placaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("soy Bulbasaur este es mi acataque ananiazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("soy Bulbasaur este es mi acataque mordisco");
    }

    @Override
    public void atacarDranaje() {
        System.out.println("soy Bulbasaur este es mi acataque drenaje");
    }

    @Override
    public void atacarParalizar() {
        System.out.println("soy Bulbasaur este es mi acataque paralizar");
    }
    
}
