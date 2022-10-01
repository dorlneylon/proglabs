package main.pokemons;
import ru.ifmo.se.pokemon.*;
import main.moves.*;

public class Victreebell extends Weepinbell {
    public Victreebell(String name, int lvl) {
        super(name, lvl);
        setStats(80.0, 105.0, 65.0, 100.0, 70.0, 70.0);
        addMove(new Swagger());
    }
}
