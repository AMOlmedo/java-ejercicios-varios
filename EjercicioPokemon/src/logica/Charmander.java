
package logica;


public class Charmander extends Pokemon implements IFuego {

    public Charmander() {
    }
    
    
    
    @Override
    protected void atacarPlacaje() {
        System.out.println("soy Charmander este es mi acataque placaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("soy Charmander este es mi acataque araniazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("soy Charmander este es mi acataque mordisco");
    }

    @Override
    public void atacarPunioFuego() {
        System.out.println("soy Charmander este es mi acataque punio de fuego");
    }

    @Override
    public void atacarLanzaLlamas() {
        System.out.println("soy Charmander este es mi acataque lanza llamas");
    }

    @Override
    public void atacarAscuas() {
        System.out.println("soy Charmander este es mi acataque ascuas");
    }
    
    
    
}
