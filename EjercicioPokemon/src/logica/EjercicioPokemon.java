//Ejercicio practico TodoCode serie java poo
package logica;

public class EjercicioPokemon {

    public static void main(String[] args) {
        //instaciamos la clase  y creamos los objetos
        Squirtle squirtle = new Squirtle();
        Charmander charmander = new  Charmander();
        Bulbasaur bulbasaur = new Bulbasaur();
        Pikachu pikachu = new Pikachu();
        
        squirtle.atacarAraniazo();
        squirtle.atacarHidrobomba();
        charmander.atacarAraniazo();
        charmander.atacarLanzaLlamas();
        bulbasaur.atacarAraniazo();
        bulbasaur.atacarDranaje();
        pikachu.atacarAraniazo();
        pikachu.atacarImpacTrueno();
        
    }
    
}
