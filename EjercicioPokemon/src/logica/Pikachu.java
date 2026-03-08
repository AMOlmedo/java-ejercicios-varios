
package logica;


public class Pikachu extends Pokemon implements IElectrico {

    public Pikachu() {
    }

    
    @Override
    protected void atacarPlacaje() {
        System.out.println("soy Pikachu este es mi acataque placaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("soy Pikachu este es mi acataque araniazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("soy Pikachu este es mi acataque mordisco");
    }

    @Override
    public void atacarImpacTrueno() {
        System.out.println("soy Pikachu este es mi acataque impacto trueno");
    }

    @Override
    public void atacarPunioTrueno() {
        System.out.println("soy Pikachu este es mi acataque punio trueno");
    }
    
    
}
