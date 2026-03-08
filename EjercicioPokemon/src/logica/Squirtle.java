
package logica;


public class Squirtle extends Pokemon implements IAgua {

    public Squirtle() {
    }

    
    
    @Override
    protected void atacarPlacaje() {
        System.out.println("soy Squirtle este es mi acataque placaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("soy Squirtle este es mi acataque araniazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("soy Squirtle este es mi acataque mordisco");
    }

    @Override
    public void atacarHidrobomba() {
        System.out.println("soy Squirtle este es mi acataque hidrobomba");
    }

    @Override
    public void atacarBurbuja() {
        System.out.println("soy Squirtle este es mi acataque burbuja");
    }

    @Override
    public void atacarPistolaAgua() {
        System.out.println("soy Squirtle este es mi acataque pistola de agua");
    }
    
    
    
}
