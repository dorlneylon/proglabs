package main.pokemons;
import ru.ifmo.se.pokemon.*;
import main.moves.*;

public class Weepinbell extends Bellsprout {
    public Weepinbell(String name, int lvl) {
        super(name, lvl);
        addMove(new Growth());
    }
}
